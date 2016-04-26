angular.module('ws-consumer').controller('FormController', ['$scope', 'Selector', 'BusinessProvider', function($scope, Selector, BusinessProvider){

	$scope.selected = function() {
		return Selector.selected;
	};

	$scope.save = function(selected, additional) {
		selected.name = selected.city;
		selected.additional = additional;
		BusinessProvider.save(selected).then(function() {
			$scope.additional = '';
		});
	};

}]);
