angular.module('ws-consumer').factory('Selector', ['DemographicsProvider', function(DemographicsProvider){
	var Model = {};

	// The displayed location | default: null
	Model.selected = null;

	Model.select = function(location) {
		Model.selected = location;

		DemographicsProvider.load(location.id).success(function(response) {
			Model.selected.demo = response;			
		});
	};

	return Model;
}]);
