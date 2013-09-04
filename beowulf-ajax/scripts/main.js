console.log('Running main.js');

requirejs.config({
	baseUrl: 'scripts'
});

var app = 'application';

require([app], function(application) {
	console.log("Pulling in application and initializing");
	application.initialize();
});