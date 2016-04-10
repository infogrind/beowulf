define(['util', 'angular', 'controllers'], function(util, angular) {
	console.log("application.js: Starting up");
	
	/* Define the main application module. This will be passed to
	 * angular.bootstrap() below, so that all services and all dependencies
	 * of the application module are available.
	 * The controllers are defined in a separate module myControllers;
	 * see controllers.js.
	 */
	var appModule = angular.module('myApp', ['myControllers']);

	/* The returned requirejs module (not to be confused with an angularjs module)
	 * has a single method initialize(), which bootstraps the angularjs application.
	 */
	var application = {
		initialize : function() {
			console.log("application.js: Initializing app");
			angular.bootstrap(document, ['myApp']);
		}
	};
	
	return application;
});