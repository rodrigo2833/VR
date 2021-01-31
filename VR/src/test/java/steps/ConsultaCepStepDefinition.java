package steps;

import static center.DriverFactory.getDriver;

import java.io.IOException;

import Pages.viacepPG;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import screenShots.TC001ConsultaValida;

public class ConsultaCepStepDefinition {

	private viacepPG via;
	private TC001ConsultaValida shot;

	@After(value = { "@test1,@test2" })
	public void finalizar() throws IOException {
		shot = new TC001ConsultaValida();
		shot.evidenciar();
	}

	@Dado("^que acessei um cep valido na url$")
	public void que_acessei_um_cep_valido_na_url() throws Throwable {

		getDriver().get("https://viacep.com.br/ws/04466090/json/");

	}

	@Entao("^devo validar o codigo IBGE e o endereco$")
	public void devo_validar_o_codigo_IBGE_e_o_endereco() throws Throwable {

		via = new viacepPG();
		via.validarEndereco();
		via.validarIBGE();

	}

	@Dado("^que acesso um cep invalido na url e retornado uma mensagem de erro$")
	public void queAcessoUmCepInvalidoNaUrlERetornadoUmaMensagemDeErro() throws Throwable {
		getDriver().get("https://viacep.com.br/ws/04166090/json/");
	}
	


}
