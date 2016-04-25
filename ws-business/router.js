module.exports = {

	index: function(req, res) {
		res.status(200).send('Business service is online!');
	},

	list: function(req, res) {
		res.json(
			require('./model').get(
				req.query.skip ? req.query.skip[0] ? req.query.skip[0] : req.query.skip : 0, 
				req.query.limit ? req.query.limit[0] ? req.query.limit[0] : req.query.limit : 10));
	},

	save: function(req, res) {
		console.log(req.body);
		res.json(require('./model').put(req.body));
	}

};
