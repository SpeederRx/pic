var picPagesApp = angular.module("PicPagesApp", ['ui.router', 'ngRoute']);

var views = [
    {
        state: "cadastrarpropostacompra",
        url: "cadastrarpropostacompra",
        caminho: "pages",
        nomeArquivo: "cadastrarpropostacompra",
        controller: "cadastrarpropostacompra"
    },
    {
        state: "cadastrarpropostavenda",
        url: "cadastrarpropostavenda",
        caminho: "pages",
        nomeArquivo: "cadastrarpropostavenda",
        controller: "cadastrarpropostavenda"
    }
];

//a função abaixo realiza a configuração de cada controller mapeando cada template(view) com seu respectivo controller
picPagesApp.config(function ($stateProvider, $routeProvider, $locationProvider) {

    for (var int = 0; int < views.length; int++) {
        var view = views[int];
        $stateProvider.state(view.state, {
            url: "/" + view.url,
            templateUrl: view.caminho + '/' + view.nomeArquivo + '.html',
            controller: view.controller + 'Controller',
            controllerAs: view.controller,
            bindToController: true
        });
    }
});

picPagesApp.factory('$crudFactory', ['$rootScope', '$resource', function ($rootScope, $resource) {
    return {
        getCrud: function (path) {
            return $resource('/api/' + path + '/', null, {
                'update': {method: 'PUT'}
            });
        }
    }
}]);

picPagesApp.controller('IndexController', ['$scope','$http', function($scope, $http) {
         $scope.obterSocio = function(socio){
            $http.post('/login', socio).then(function (response) {
                if (response.status == 200){
                    $scope.socio = response.data;
                    console.log($scope.socio);
                }
            },
            function (response) {
                alert('Ocorreu um erro= ' + response.status);
                console.log('Nao Deu boa' + response.status);
            });
         };       

        $scope.socioAtivo = {
            email: 'rodrigobsilva@live.com',
            senha: 'senha'
        };

        $scope.obterSocio($scope.socioAtivo);


        console.log("Guayraçu");

}]);
