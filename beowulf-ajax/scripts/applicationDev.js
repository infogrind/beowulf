define(['application'], function(application) {
	console.log("Starting up application in dev mode");
	console.log("Pulling in mock module.");
	require(['mock']);

	return application;
});