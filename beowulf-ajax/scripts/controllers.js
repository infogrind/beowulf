/*global define*/

/* Each controller implementation is defined in a separate file in the controllers
 * directory and loaded as a RequireJS dependency.
 */
define(['angular', 'controllers/myCtrl'], function (angular, myCtrl) {
	var module = angular.module("myControllers", []);
	module.controller('myController', myCtrl);
});