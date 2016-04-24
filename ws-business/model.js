module.exports = (function() {

	var data = [];

	function put(entry) {
		data.push(entry);
	}

	function get(from, to) {
		return data.slice(from, to);
	}

	return {
		put: put,
		get: get
	};

})();
