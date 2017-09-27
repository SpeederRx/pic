picPagesApp.controller('consultarSaldoController', ['$scope', '$http', function($scope, $http){
    $scope.getAtivos = function(){
        $http.post('/socioativomoeda', 4).then(function (response) {
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

}]);