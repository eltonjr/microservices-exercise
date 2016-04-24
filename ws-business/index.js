var express = require('express');
var app = express();
var router = require('./router');

var port = 42002;

app.get('/v1', router.index);
app.get('/v1/business', router.list);
app.post('/v1/business', router.save);

var server = app.listen(port, function() {
	console.log('Business Service is ready @ port ' + port);
});
