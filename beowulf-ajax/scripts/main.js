console.log('main.js: Running');

// Configure some requirejs basics
requirejs.config({
	// Most scripts are in the scripts/ directory.
	baseUrl: 'scripts',
	// AngularJS is an exception; as an external resource it resides in ext/scripts/.
	paths : {
		angular : '../ext/scripts/angular'
	},
	/* AngularJS doesn't follow the requirejs module definition convention, so we
	 * add module metadata here. We could also specify here if angular has any dependencies
	 * on other requirejs modules, which would then be loaded first.
	 */
	shim : {
		'angular' : { 'exports' : 'angular' }
	}
});

var app = 'application';

// Enable this only in dev mode
app = 'applicationDev';

require([app], function(application) {
	console.log("main.js: Pulling in application and initializing");
	application.initialize();
});