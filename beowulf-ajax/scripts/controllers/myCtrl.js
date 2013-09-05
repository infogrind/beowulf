/*global define*/
define(['angular'], function() {
	// This controller is pulled in via controllers.js.
	function myCtrl($scope, myService) {
		$scope.serviceResult = myService.sayHello();
	}
	
	return myCtrl;
});