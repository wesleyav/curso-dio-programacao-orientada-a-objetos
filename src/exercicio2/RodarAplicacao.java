package exercicio2;

public class RodarAplicacao {

	public static void main(String[] args) {

		// Instancia objeto
		Funcionario funcionario = new Funcionario();

		// Instancia objetos do mesmo tipo
		// Upcastings implícitos
		// Ordem do upcast = <-, ou seja, de gerente para funcionário
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();

		// Downcast implícito, implica em erro, se faz necessário informar para qual
		// tipo deve ser feito o cast
//		Gerente gerente_ = new Funcionario();

		// Downcast explícito
		// Erro de classPath devido ao downcast não ser do mesmo tipo, Funcionario e
		// Vendedor no sentido de que o que tem em Funcionario não tem em Vendedor
		// Evitar downcast, pois dá erro
//		Vendedor vendedor_ = (Vendedor) new Funcionario();

	}

}
