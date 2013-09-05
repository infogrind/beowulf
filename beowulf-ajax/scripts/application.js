define(['util', 'angular', 'controllers'], function(util, angular) {
	console.log("application.js: Starting up");
	
	/* Define the main application module. This will be passed to
	 * angular.bootstrap() below, so that all services and all dependencies
	 * of the application module are available.
	 * The controllers are defined in a separate module myControllers;
	 * see controllers.js.
	 */
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