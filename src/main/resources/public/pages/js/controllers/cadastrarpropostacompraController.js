picPagesApp.controller('cadastrarpropostacompraController', ['$scope', '$http', function($scope, $http) {
	$scope.cadastrarProposta = function(participante){		
		$http.post('/novaproposta', participante).then(function (response) {
				if (response.status == 200){
					alert("Cadastro efetuado com sucesso.");
					console.log('Nao Deu boa' + response);
				}
			},
			function (response) {
				alert('Ocorreu um erro= ' + response.status);
				console.log('Nao Deu boa' + response);
			});
	};
	
	$scope.validarParticipante = function(){
		var now = new Date();
		$scope.participante.socioData={id:4};
		$scope.participante.dataVinculo = now.getDate();
		$scope.participante.dataDesvinculo = null;
		$scope.participante.proponente = true;
		
		
		$scope.cadastrarProposta($scope.participante);
		
		console.log("Guayraçu");
	};
	
	
	$scope.salvarProposta = function(){
		$scope.participante.propostaData.estadoProposta = 1;
		$scope.validarParticipante();
	}
	
	$scope.ativarProposta = function(){
		$scope.participante.propostaData.estadoProposta = 2;
		$scope.validarParticipante();
	}	
	
}]);