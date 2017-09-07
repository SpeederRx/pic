var app = angular.module('postserviceApp', []);

app.controller('postserviceCtrl', function ($scope, $http) {
	$scope.name = null;
	$scope.age = null;
	$scope.adress = null;
	$scope.lblMsg = null;

	$scope.postdata = function (name, age, adress) {
		var data = {
			name: name,
			age: age,
			adress: adress
		};
		var information = JSON.stringify(data);
		//Call the services

		$http.post('http://localhost:8080/Socio', information).then(function (response) {
			if (response.data)
				$scope.msg = "Post Data Submitted Successfully!";
			},
			function (response) {
				$scope.msg = "Service not Exists";
				$scope.statusval = response.status;
				$scope.statustext = response.statusText;
				$scope.headers = response.headers;
		});
	};
});