var appCadastro = angular.module ('appCadastro',[]);

appCadastro.controller('MainController', ['$scope', '$http', function($scope, $http) {
	$scope.cpfAlert = 'vazio';
	$scope.validaCpf = function() { 
		
		try {
			var cpfOriginal = $scope.cpf;
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
		          		$scope.cpfAlert = 'Favor inserir CPF válido - primeiro dígito inválido';
		                return false;
		          }
		          numeros = cpf.substring(0,10);
		          soma = 0;
		          for (i = 11; i > 1; i--)
		                soma += numeros.charAt(11 - i) * i;
		          resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;
		          if (resultado != digitos.charAt(1)){
		          		$scope.cpfAlert = 'Favor inserir CPF válido - segundo dígito inválido';
		                return false;
		          }
		          $scope.cpfAlert = 'Deu boa parça';
		          return true;
		          }
		    else{
		    	$scope.cpfAlert = 'Favor inserir CPF válido - final do código';
		    	return false;
		    }
		        
				
	};

	$scope.compararSenha = function(){
		if($scope.validaSenha != $scope.senha){
			$scope.resultadoSenha = 'As senhas digitadas não correspondem';
		}
		if($scope.validaSenha == $scope.senha){
			$scope.resultadoSenha = '';
		}
	};
	
	$scope.validarCarteira = function(){

	};

	$scope.cadastrarSocio = function(){
	
	};

	$scope.validarSocio = function(){

	};

	
	
}]);
