/*global define*/

/* Each controller implementation is defined in a separate file in the controllers
 * directory and loaded as a RequireJS dependency.
 */
define(['angular', 'controllers/myCtrl', 'services'], function (angular, myCtrl) {
	/* Create a new module "myControllers" that will contain the controllers.
	 * It has a dependency on the 'myServices' module, such that individual controllers
	 * can use the latter's services.
	 */
	var module = angular.module("myControllers", ['myServices']);
	module.controller('myController', myCtrl);
});