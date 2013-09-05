/*global define*/
define(['angular'], function(angular) {
	var module = angular.module('myServices', []);
	
	module.factory('myService', function () {
		return {
			sayHello	 : function() {
				console.log("Hello from myService! :-)");
			}
		};
	});
});