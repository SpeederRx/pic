picPagesApp.controller('editarativoController', ['$scope', function($scope) {
	$scope.proposta = {nome: "Petrobrás Venda"};
    $scope.ativo = null;
    $scope.tiposAtivo = {
            availableOptions: [
            {id: '1', descricao: 'Moeda'},
            {id: '2', descricao: 'Título'},
            {id: '3', descricao: 'Ação'}
            ]           
    };
    $scope.ativos = { 
            availableOptions: [
            {id: '1', descricao: 'Ações Petrobrás', tipoAtivo: '3'},
            {id: '2', descricao: 'Ações Vale', tipoAtivo: '3'},
            {id: '3', descricao: 'Real', tipoAtivo: '1'},
            {id: '4', descricao: 'Títulos do Tesouro', tipoAtivo: '2'}
            ]           
    };
    
    
    
}]);