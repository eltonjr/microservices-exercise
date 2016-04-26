angular.module('ws-consumer').controller('LocationController', ['$scope', 'LocationProvider', 'Selector',
	function($scope, LocationProvider, Selector){

		$scope.collection = function() {
			return LocationProvider.collection;
		};

		$scope.select = function(loc) {
			Selector.select(loc);
		};
	}
])
