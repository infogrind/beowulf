/*global define*/

/* Each controller implementation is defined in a separate file in the controllers
 * directory and loaded as a RequireJS dependency.
 */
define(['angular', 'controllers/myCtrl', 'services'], function (angular, myCtrl) {
	var module = angular.module("myControllers", ['myServices']);
	module.controller('myController', myCtrl);
});