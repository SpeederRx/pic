picPagesApp.controller('cadastrarpropostacompraController', ['$scope', '$http', function($scope, $http) {
	var now = new Date;
	
    $scope.getAtivos = function(){
        $http.get('/ativo').then(function (response) {
            if (response.status == 200){
                $scope.ativos = response.data;
                console.log($scope.ativos);
            }
        },
        function (response) {
            alert('Ocorreu um erro= ' + response.status);
            console.log('Nao Deu boa' + response.status);
        });
     };
    $scope.getAtivos();
	$scope.socio = {
			id: 4,
			cpf: '05728048900',
			dataNasc: '1984-01-10 18:10:10',
			nome: 'Rodrigo B Silva',
			email: 'email@email.com',
			senha: 'senha',
			enderecoData: {
				rua: 'Rua das Ruas',
				numero: 10,
				complemento: 'casa2',
				bairro: 'CIC',
				cidade: 'Curitiba',
				estado: 'PR',
				cep: '81050020',
				pais: 'Brasil'},
			telefone: '41988887777',
			contaMovimento: '9878',
			tipoEnvio: 2,
			classificacao: 1.0		
	}
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
		$scope.participante.socioData=$scope.socio;
		$scope.participante.dataVinculo = now.getDate();
		$scope.participante.dataDesvinculo = null;
		$scope.participante.proponente = true;
		$scope.participante.propostaData.dataInicio = $scope.dataInicio+" "+ $scope.horaInicio+":00";
		$scope.participante.propostaData.dataFim = $scope.dataFim+" "+ $scope.horaFim+":00";
		$scope.participante.propostaData.tipoProposta = 1;
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