/*global define*/
define(['angular', 'controllers/myCtrl'], function (angular, myCtrl) {
	var module = angular.module("myControllers", []);
	module.controller('myController', myCtrl);
});