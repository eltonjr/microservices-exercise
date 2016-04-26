angular.module('ws-consumer').controller('BusinessController', ['$scope', 'BusinessProvider',
	function($scope, BusinessProvider){

		$scope.collection = function() {
			return BusinessProvider.collection;
		};

	}
])
