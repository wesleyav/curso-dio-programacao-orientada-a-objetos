
public class Carro {

	String cor;
	String modelo;
	int capacidadeTanque;

	/* Contrutor vazio */
	Carro() {

	}

	/* Sobrecarga do método constutor */
	Carro(String cor, String modelo, int capacidadeTanque) {
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}

	String getCor() {
		return cor;
	}

	void setCor(String cor) {
		this.cor = cor;
	}

	String getModelo() {
		return modelo;
	}

	void setModelo(String modelo) {
		this.modelo = modelo;
	}

	int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	double totalValorTanque(double valorCombustivel) {
		return capacidadeTanque * valorCombustivel;
	}

}
