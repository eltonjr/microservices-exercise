var express = require('express');
var app = express();
var router = require('./router');

var port = 42002;

router(app);

var server = app.listen(port, function() {
	console.log('Business Service is ready @ port ' + port);
});
