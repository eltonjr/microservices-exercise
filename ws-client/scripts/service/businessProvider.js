angular.module('ws-consumer').factory('BusinessProvider', ['$http', 'Routes', function($http, Routes){
	
	var Model = {
		collection: []
	};

	function reload() {
		$http.get(Routes.business).success(function(response) {
			Model.collection = response;
		});
	}
	reload();

	Model.save = function(data) {
		return $http.post(Routes.business, data).then(function(response) {
			reload();
		});
	};

	return Model;
}]);
