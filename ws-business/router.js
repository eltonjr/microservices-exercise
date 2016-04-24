module.exports = function(app) {

	app.use('/v1', function(req, res) {
		res.status(200).send('Business service is online!');
	});

};
