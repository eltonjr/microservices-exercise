angular.module('ws-consumer').factory('DemographicsProvider', ['$http', 'Routes', function($http, Routes){
	
	var Model = {};

	Model.load = function(id) {
		return $http.get(Routes.demographics + '/' + id);
	}

	return Model;
}]);
