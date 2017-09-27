picPagesApp.controller('consultarAtivosController', ['$scope', '$http', function($scope, $http){
    $scope.getAtivos = function(){
        $http.post('/socioativo', 4).then(function (response) {
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