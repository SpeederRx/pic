picPagesApp.controller('criarativoController', ['$scope', function($scope) {
	$scope.proposta = {nome: "Petrobrás Venda"};
       $scope.tiposAtivo = {
                availableOptions: [
                {id: '1', name: 'Moeda'},
                {id: '2', name: 'Título'},
                {id: '3', name: 'Ação'}
                ]           
        };
}]);