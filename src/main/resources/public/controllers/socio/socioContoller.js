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

		$.ajax({
			type: "POST",
			url: "localhost:8080/Socio",
			data: data
		});/*	
		$http.post('localhost:8080/Socio', data).then(function (response) {
			if (response.data)
				$scope.msg = "Post Data Submitted Successfully!";
			},
			function (response) {
				$scope.msg = "Service not Exists";
				$scope.statusval = response.status;
				$scope.statustext = response.statusText;
				$scope.headers = response.headers();
		});*/
	};
});