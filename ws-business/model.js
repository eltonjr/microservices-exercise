// NoSQL database lol
module.exports = (function() {

	var data = [];

	function put(entry) {
		data.push(entry);
		return entry;
	}

	function get(from, to) {
		return data.slice(from, to);
	}

	function findByKey(key, value) {
		return data.filter(function(item) {
			item[key] === value;
		});
	}

	return {
		put: put,
		get: get,
		findByKey: findByKey
	};

})();
