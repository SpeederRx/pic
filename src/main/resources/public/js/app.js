var appIndex = angular.module ('appIndex',[]);

appIndex.controller('indexController', ['$scope', '$http', function($scope, $http) {
	
	$scope.showCadastro = false;
	$scope.showLogin = false;

	$scope.toggleCadatroState = function(){
			$scope.showCadastro = true;
			$scope.showLogin = false;
	};

	$scope.toggleLoginState = function(){
			$scope.showCadastro = false;
			$scope.showLogin = true;
			$(window.location).attr('href',"#login");
	};

	$scope.setOffCadastroLogin = function(){
		$scope.showCadastro = false;
		$scope.showLogin = false;
	};
	
	/*/////////////Inicio variáveis para teste///////////////////////

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


	/////////////Fim variáveis para teste///////////////////////*/
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
		if($scope.validaSenha == null || $scope.validaSenha != $scope.socio.senha){
			$scope.resultadoSenha = 'As senhas digitadas não correspondem';
			return false;
		}
		else if($scope.validaSenha == $scope.socio.senha){
			$scope.resultadoSenha = '';
			return true;
		}
		else{
			$scope.resultadoSenha = 'As senhas digitadas não correspondem';
			return false;
		}
	};

	$scope.cadastrarSocio = function(socio){

		$http.post('/socio', socio).then(function (response) {
				if (response.status == 200){
					alert("Cadastro efetuado com sucesso. Efetue login para acessar seu painel de controle.");
					$scope.toggleLoginState();
					$(window.document.location).attr('href',"#login");
				}
			},
			function (response) {
				alert('Ocorreu um erro= ' + response.status);
				console.log('Nao Deu boa' + response.status);
			});
	};

	$scope.validarSocio = function(){
			$scope.socio.classificacao = 1.0;
			if($scope.socio == null){
				alert("Por favor preencha o formulário");
				return;
			}
			if($scope.validaCpf() == false){
				alert("Por favor preencher o CPF");
				return;
			}

			if($scope.compararSenha() == false){
				alert("Por verifique as senhas digitadas");
				return;
			}

			if($scope.socio.dataNasc == null || $scope.socio.dataNasc == ""){
				alert("Por favor preencher data de nascimento");
				return;
			}
			if($scope.socio.nome == null || $scope.socio.nome.trim() == ""){
				alert("Por favor preencher o nome");
				return;
			}
			if($scope.socio.email == null || $scope.socio.email.trim() == ""){
				alert("Por favor preencher o email");
				return;
			}
			if($scope.socio.senha == null || $scope.socio.senha.trim() == ""){
				alert("Por favor preencher a senha");
				return;
			}
			if($scope.socio.enderecoData == null){
				alert("Por favor preencher o endereço completo");
				return;
			}	
			if($scope.socio.telefone == null || $scope.socio.telefone.trim() == ""){
				alert("Por favor preencher o telefone");
				return;
			}
			if($scope.socio.contaMovimento == null || $scope.socio.contaMovimento.trim() == ""){
				alert("Por favor preencher o número da carteira digital");
				return;
			}
			if($scope.socio.tipoEnvio == null){
				alert("Por favor selecionar um meio de envio do cód de segurança");
				return;
			}

			try{$scope.cadastrarSocio($scope.socio);}
			catch(err){
				console.log(err);
			}
			
		
	};

	$scope.efetuarLogin = function(){
        
            $http.post('/login', $scope.socio).then(function (response) {
                if (response.status == 200){
                    $scope.socio = response.data;
                    console.log($scope.socio);
            		$(window.document.location).attr('href',"pages/index.html");
                }
            },
            function (response) {
                alert('Ocorreu um erro= O login ou senha estão incorretos');
                console.log('Nao Deu boa' + response.status);
            });
};

	$scope.validarCarteira = function(){

	};


}]);
