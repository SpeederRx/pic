picPagesApp.controller('visaogeralController', ['$scope', '$http', function($scope, $http) {
         $scope.obterPropostas = function(){
            $http.get('/proposta').then(function (response) {
                if (response.status == 200){
                    $scope.propostas = response.data;
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

        console.log("Guayraçu");
}]);