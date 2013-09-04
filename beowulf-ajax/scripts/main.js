console.log('main.js: Running');

requirejs.config({
	baseUrl: 'scripts'
});

var app = 'application';

// Enable this only in dev mode
app = 'applicationDev';

require([app], function(application) {
	console.log("main.js: Pulling in application and initializing");
	application.initialize();
});