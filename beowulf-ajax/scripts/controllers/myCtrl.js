/*global define*/
define(['angular'], function() {
	/* This controller is pulled in via controllers.js.
	 * Because the myControllers module defines a dependency on the myServices module,
	 * the services of the latter (such as myService) are available for injection here.
	 */
	function myCtrl($scope, myService) {
		$scope.serviceResult = myService.sayHello();
	}
	
	return myCtrl;
});