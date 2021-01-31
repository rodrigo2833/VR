# language: pt

Funcionalidade: Consultar os dados de um endereco a partir de um CEP

	Como um usuario
	Eu quero testar a api Viacep
	
@test1
Cenario: Deve validar e printar o codigo do IBGE do endereco

Dado que acessei um cep valido na url
Entao devo validar o codigo IBGE e o endereco

@test2
Cenario: Imprimir a reaposta do cep invalido

Dado que acesso um cep invalido na url e retornado uma mensagem de erro 
