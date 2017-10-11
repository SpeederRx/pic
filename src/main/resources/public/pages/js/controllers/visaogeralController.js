picPagesApp.controller('visaogeralController', ['$scope', '$http', '$filter', function($scope, $http, $filter) {
		
/*Valores para o combo de opcoes de pesquisa por data */	
		$scope.dateSearchOptions = [
			{
				id:1,
				name:"Data de Abertura"
			},
			{
				id:2,
				name:"Data de Finalização"
			}];
/*Fim de Valores para o combo de opcoes de pesquisa por data */
		
		/*Load de propostas ativas*/		
         $scope.obterPropostas = function(){
            $http.get('/proposta').then(function (response) {
                if (response.status == 200){
                    $scope.propostas = response.data;
                    $.each($scope.propostas, function(i, val) {
                        $scope.propostas[i].dataInicio = (new Date($scope.propostas[i].dataInicio));
                        $scope.propostas[i].dataFim = new Date($scope.propostas[i].dataInicio);
                        console.log($scope.propostas[i].dataFim);
                    });
                    
                    $scope.propostasPorData = $scope.propostas;
                    console.log($scope.propostas);
                }
            },
            function (response) {
                alert('Ocorreu um erro= ' + response.status);
                console.log('Nao Deu boa' + response.status);
            });
         };       

        $scope.obterPropostas();
		/*Fim de Load de propostas ativas*/       
      
        /*Função para controle de Ordenação da tabela*/
        $scope.propertyName = 'dataInicio';   /*Inicia a tabela ordenada por data de inicio da proposta do mais recente para antigo*/
        $scope.reverse = true;
        
	   	 $scope.isSortUp = function(fieldName){
	 	 	return $scope.propertyName === fieldName && !$scope.reverse;
	 	 };
	 	 $scope.isSortDown = function(fieldName){
	 	 	return $scope.propertyName === fieldName && $scope.reverse;
	 	 };
        $scope.sortBy = function(propertyName) {
          $scope.reverse = ($scope.propertyName === propertyName) ? !$scope.reverse : false;
          $scope.propertyName = propertyName;
        };
        /*Fim da Função para controle de Ordenação da tabela*/
        
        /*Função para filtrar propostas por data*/
        $scope.filtrarPorData = function(){
        	if($scope.dataInicioPesquisa != null && $scope.dataFimPesquisa != null && $scope.searchOption != null){
        		var dataInicioP = new Date($scope.dataInicioPesquisa);
        		var dataFimP = new Date($scope.dataFimPesquisa);
        		if($scope.searchOption.id == 1){
        			$scope.propostasPorData = []
                    $.each($scope.propostas, function(i, val) {
                    	if($scope.propostas[i].dataInicio >= dataInicioP && $scope.propostas[i].dataInicio <= dataFimP){
                    		$scope.propostasPorData.push($scope.propostas[i]);
                    	}
                    });
        		}
        		else{
                    $.each($scope.propostas, function(i, val) {
                    	if($scope.propostas[i].dataFim >= dataInicioP && $scope.propostas[i].dataFim <= dataFimP){
                    		$scope.propostasPorData.push($scope.propostas[i]);
                    	}

                    });
        		}

        	}
        	else{
        		alert("Por favor, preencha todos os campos acima para pesquisa");
        	}
        }
        
        $scope.limparFiltrosPorData = function(){
        	$scope.propostasPorData = $scope.propostas;
        }
        
        
}]);