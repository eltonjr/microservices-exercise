angular.module('ws-consumer', ['ngRoute']);

angular.module('ws-consumer').config(['$routeProvider', function($routeProvider) {
	$routeProvider.when('/', {
		templateUrl: 'views/main.html',
		controller: 'MainCtrl'
	});
}]);
