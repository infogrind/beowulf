define(['util', 'angular', 'controllers'], function(util, angular) {
	console.log("application.js: Starting up");
	
	var appModule = angular.module('myApp', ['myControllers']);
	
	appModule.factory('myService', function () {
		return {
			sayHello	 : function() {
				console.log("Hello from myService! :-)");
			}
		};
	});
	
	var application = {
		initialize : function() {
			console.log("application.js: Initializing app");
			angular.bootstrap(document, ['myApp']);
		}
	};
	
	return application;
});