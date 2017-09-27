picPagesApp.controller('editarativoController', ['$scope', '$http', function($scope, $http) {
	$scope.ativo = null;
    $scope.tiposAtivo = {
            availableOptions: [
            {id: '1', descricao: 'Moeda'},
            {id: '2', descricao: 'Título'},
            {id: '3', descricao: 'Ação'}
            ]           
    };
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
    console.log("Guayraçu");
    
    $scope.updateAtivo = function(){
    	if($scope.ativo != null){
    		$scope.ativo.descricao = $scope.ativos[($scope.ativo.id)-1].descricao;
    		$scope.ativo.tipoAtivo = $scope.ativos[($scope.ativo.id)-1].tipoAtivo;
    	}
    	    	
    };
	$scope.alterarAtivo = function(ativo){

		$http.post('/ativo', ativo).then(function (response) {
				if (response.status == 200){
					alert("Alteração efetuada com sucesso.");
					$scope.getAtivos();
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
        
        if($scope.ativo.tipoAtivo == null || $scope.ativo.id == null){
            alert("Por favor, preencha todos os campos.");
            return;
        }
        
        if($scope.ativo.descricao == null || $scope.ativo.descricao == ''){
            alert("Por favor, preencha todos os campos.");
            return;
        }
        else{
            $scope.alterarAtivo($scope.ativo);
        }
    }    
}]);