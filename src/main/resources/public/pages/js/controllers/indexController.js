picPagesApp.controller('indexPainelControle', ['$scope', function($scope) {
	$scope.cadastrarSocio = function(socio){

		$http.post('/socio', socio).then(function (response) {
				if (response.status == 200){
					alert("Cadastro efetuado com sucesso. Efetue login para acessar seu painel de controle.");
					$scope.toggleLoginState();
					$(window.document.location).attr('href',"#login");
				}
			},
			function (response) {
				alert('Ocorreu um erro= ' + response.status);
				console.log('Nao Deu boa' + response.status);
			});
	};	
}]);






