define(['application'], function(application) {
	console.log("applicationDev.js: Starting up application in dev mode");
	console.log("applicationDev.js: Pulling in mock module.");
	require(['mock']);

	return application;
});