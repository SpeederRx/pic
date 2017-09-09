var appCadastro = angular.module ('appIndex',[]);

appCadastro.controller('CadastroController', ['$scope', '$http', function($scope, $http) {
	$scope.cpfAlert = 'vazio';
	$scope.showCadastro = false;
	$scope.showLogin = false;

	$scope.toggleCadatroState = function(){
			$scope.showCadastro = true;
			$scope.showLogin = false;
	};

	$scope.toggleLoginState = function(){
			$scope.showCadastro = false;
			$scope.showLogin = true;
	};

	$scope.setOffCadastroLogin = function(){
		$scope.showCadastro = false;
		$scope.showLogin = false;
	};
	/*/////////////Inicio variáveis para teste///////////////////////*/

	$scope.socio = {
			cpf: '05728048900',
			dataNasc: '',
			nome: 'John Smith',
			email: 'email@email.com',
			senha: 'senha',
			enderecoData: {
				rua: '05728048900',
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


	/*/////////////Fim variáveis para teste///////////////////////*/
	$scope.validaCpf = function() {

		try {
			var cpfOriginal = $scope.socio.cpf;
		}
		catch(err){
			$scope.cpfAlert = 'Campo Vazio';
			return false;
		}
		var cpf = cpfOriginal.replace(/[^\d]+/g,'');
		var numeros, digitos, soma, i, resultado, digitos_iguais;
		    digitos_iguais = 1;
		    if (cpf.length != 11){
		    	$scope.cpfAlert = 'Favor inserir os 11 dígitos do CPF';
		          return false;
		    }

		    for (i = 0; i < cpf.length - 1; i++)
		          if (cpf.charAt(i) != cpf.charAt(i + 1))
		                {
		                digitos_iguais = 0;
		                break;
		                }
		    if (!digitos_iguais)
		          {
		          numeros = cpf.substring(0,9);
		          digitos = cpf.substring(9);
		          soma = 0;
		          for (i = 10; i > 1; i--)
		                soma += numeros.charAt(10 - i) * i;
		          resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;
		          if (resultado != digitos.charAt(0)){
		          		$scope.cpfAlert = 'CPF Inválido. Por favor, verifique.';
		                return false;
		          }
		          numeros = cpf.substring(0,10);
		          soma = 0;
		          for (i = 11; i > 1; i--)
		                soma += numeros.charAt(11 - i) * i;
		          resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;
		          if (resultado != digitos.charAt(1)){
		          		$scope.cpfAlert = 'CPF Inválido. Por favor, verifique.';
		                return false;
		          }
		          $scope.cpfAlert = '';
		          return true;
		          }
		    else{
		    	$scope.cpfAlert = 'CPF Inválido. Por favor, verifique.';
		    	return false;
		    }


	};

	$scope.compararSenha = function(){
		if($scope.validaSenha != $scope.socio.senha){
			$scope.resultadoSenha = 'As senhas digitadas não correspondem';
		}
		if($scope.validaSenha == $scope.senha){
			$scope.resultadoSenha = '';
		}
	};

	$scope.validarCarteira = function(){

	};

	$scope.cadastrarSocio = function(socio){
		//Call the services

		$http.post('/socio', socio).then(function (response) {
			if (response.data)
				alert('Deu boa' + response.status);
				console.log('Deu boa' + response.status)
			},
			function (response) {
				alert('Nao boa' + response.statusresponse.status);
				console.log('Nao Deu boa' + response.status);
			});
	};

	$scope.validarSocio = function(){
			$scope.cadastrarSocio($scope.socio);
	};

	$scope.efetuatLogin= function(){
		$http.post('/login', socio).then(function (response) {
			if (response.data)
				alert('Deu boa' + response.status);
				console.log('Deu boa' + response.status)
			},
			function (response) {
				alert('Nao boa' + response.statusresponse.status);
				console.log('Nao Deu boa' + response.status);
			});
	};


}]);
