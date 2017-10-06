picPagesApp.controller('executarpropostaController', ['$scope', '$http', function($scope, $http) {
         $scope.obterPropostas = function(){
            $http.get('/proposta').then(function (response) {
                if (response.status == 200){
                    $scope.propostas = response.data;
                    $.each($scope.propostas, function(i, val) {
                        $scope.propostas[i].dataInicio = new Date($scope.propostas[i].dataInicio);
                        $scope.propostas[i].dataFim = new Date($scope.propostas[i].dataInicio);
                    });
                    console.log($scope.propostas);
                }
            },
            function (response) {
                alert('Ocorreu um erro= ' + response.status);
                console.log('Nao Deu boa' + response.status);
            });
         };       

        $scope.obterPropostas();
        
        $scope.prop = {nome:"Tabela de Propostas"};
        $scope.propertyName = 'nome';
        $scope.reverse = true;
        

        $scope.sortBy = function(propertyName) {
          $scope.reverse = ($scope.propertyName === propertyName) ? !$scope.reverse : false;
          $scope.propertyName = propertyName;
        };
        $scope.executarproposta = function(proposta){
        	console.log(proposta.id);
        }
}]);