picPagesApp.controller('criarativoController', ['$scope', '$http', function($scope, $http) {
	$scope.proposta = {nome: "Petrobrás Venda"};
       $scope.tiposAtivo = {
                availableOptions: [
                {id: '1', name: 'Moeda'},
                {id: '2', name: 'Título'},
                {id: '3', name: 'Ação'}
                ]           
        };
	$scope.cadastrarAtivo = function(ativo){

		$http.post('/ativo', ativo, null).then(function (response) {
				if (response.status == 200){
					alert("Cadastro efetuado com sucesso.");
					
				}
			},
			function (response) {
				alert('Ocorreu um erro= ' + response.status);
				console.log('Nao Deu boa' + response.status);
			});
	};
    
    $scope.validarAtivo = function(){
        if($scope.ativo == null){
            alert("Por favor, preencha todos os campos.");
            return;
        }
        
        if($scope.ativo.tipoAtivo == null){
            alert("Por favor, preencha todos os campos.");
            return;
        }
        
        if($scope.ativo.descricao == null || $scope.ativo.descricao == ''){
            alert("Por favor, preencha todos os campos.");
            return;
        }
        else{
            $scope.cadastrarAtivo($scope.ativo);
        }
    }
}]);