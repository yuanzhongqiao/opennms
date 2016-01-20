(function() {
	'use strict';

	var MODULE_NAME = 'onmsList.scanreport';

	// $filters that can be used to create human-readable versions of filter values
	angular.module('scanReportListFilters', [ 'onmsListFilters' ])
	.filter('property', function() {
		return function(input) {
			switch (input) {
			case 'id':
				return 'ID';
			case 'timestamp':
				return 'Scan Time';
			case 'location':
				return 'Location';
			}
			// If no match, return the input
			return input;
		}
	})
	.filter('value', function($filter) {
		return function(input, property) {
			switch (property) {
			case 'timestamp':
				// Return the date in our preferred format
				return $filter('date')(input, 'MMM d, yyyy h:mm:ss a');
			}
			return input;
		}
	});

	// Minion list module
	angular.module(MODULE_NAME, [ 'ngResource', 'onmsList', 'scanReportListFilters' ])

	/**
	 * ScanReport REST $resource
	 */
	.factory('ScanReports', function($resource, $log, $http, $location) {
		return $resource(BASE_REST_URL + '/scanreports/:id', { id: '@id' },
			{
				'query': { 
					method: 'GET',
					isArray: true,
					// Append a transformation that will unwrap the item array
					transformResponse: appendTransform($http.defaults.transformResponse, function(data, headers, status) {
						// TODO: Figure out how to handle session timeouts that redirect to 
						// the login screen
						/*
						if (status === 302) {
							$window.location.href = $location.absUrl();
							return [];
						}
						*/
						// Always return the data as an array
						return angular.isArray(data.scanreport) ? data.scanreport : [ data.scanreport ];
					})
				},
				'update': { 
					method: 'PUT'
				}
			}
		);
	})

	/**
	 * Minion list controller
	 */
	.controller('ScanReportListCtrl', ['$scope', '$location', '$window', '$log', '$filter', 'ScanReports', function($scope, $location, $window, $log, $filter, ScanReports) {
		$log.debug('ScanReportListCtrl initializing...');

		// Set the default sort and set it on $scope.$parent.query
		$scope.$parent.defaults.orderBy = 'timestamp';
		$scope.$parent.defaults.order = 'desc';
		$scope.$parent.query.orderBy = 'timestamp';
		$scope.$parent.query.order = 'desc';

		// Reload all resources via REST
		$scope.$parent.refresh = function() {
			// Fetch all of the items
			ScanReports.query(
				{
					_s: $scope.$parent.query.searchParam, // FIQL search
					limit: $scope.$parent.query.limit,
					offset: $scope.$parent.query.offset,
					orderBy: $scope.$parent.query.orderBy,
					order: $scope.$parent.query.order
				}, 
				function(value, headers) {
					$scope.$parent.items = value;

					var contentRange = parseContentRange(headers('Content-Range'));
					$scope.$parent.query.lastOffset = contentRange.end;
					// Subtract 1 from the value since offsets are zero-based
					$scope.$parent.query.maxOffset = contentRange.total - 1;
					$scope.$parent.setOffset(contentRange.start);
				},
				function(response) {
					switch(response.status) {
					case 404:
						// If we didn't find any elements, then clear the list
						$scope.$parent.items = [];
						$scope.$parent.query.lastOffset = 0;
						$scope.$parent.query.maxOffset = -1;
						$scope.$parent.setOffset(0);
						break;
					case 401:
					case 403:
						// Handle session timeout by reloading page completely
						$window.location.href = $location.absUrl();
						break;
					}
					// TODO: Handle 500 Server Error by executing an undo callback?
				}
			);
		};

		// Save an item by using $resource.$update
		$scope.$parent.update = function(item) {
			var saveMe = ScanReports.get({id: item.id}, function() {
				saveMe.label = item.label;
				saveMe.location = item.location;
				saveMe.properties = item.properties;

				// TODO
				//saveMe.status = item.status;
				// TODO
				//saveMe.properties = item.properties;

				// Read-only fields
				// saveMe.type = item.type;
				// saveMe.date = item.date;

				saveMe.$update({}, function() {
					// If there's a search in effect, refresh the view
					if ($scope.$parent.query.searchParam !== '') {
						$scope.$parent.refresh();
					}
				});
			}, function(response) {
				$log.debug(response);
			});

		};

		// Refresh the item list;
		$scope.$parent.refresh();

		$log.debug('ScanReportListCtrl initialized');
	}])

	.run(['$rootScope', '$log', function($rootScope, $log) {
		$log.debug('Finished initializing ' + MODULE_NAME);
	}])

	;

	angular.element(document).ready(function() {
		console.log('Bootstrapping ' + MODULE_NAME);
		angular.bootstrap(document, [MODULE_NAME]);
	});
}());
