angular.module('ws-consumer').factory('LocationProvider', ['$http', 'Routes', function($http, Routes){
	
	var Model = {
		collection: []
	};

	function init() {
		$http.get(Routes.locations).success(function(response) {
			Model.collection = response;
		});
	}
	init();

	return Model;
}]);
