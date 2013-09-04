console.log('Running main.js');

requirejs.config({
	baseUrl: 'scripts'
});

require(['application'], function(application) {
	console.log("Pulling in application and initializing");
	application.initialize();
});