package com.qintess.projetoqintess.model.agencia;

public class Conta {
	private double agencia;
	private double numero;
	protected double saldo;
	private Cliente Cliente;

	// private Conta Conta;
	private double limite;

	public double getAgencia() {
		return agencia;
	}

	public void setAgencia(double agencia) {
		this.agencia = agencia;
	}

	public double getNumerico() {
		return numero;
	}

	public void setNumerico(double numerico) {
		this.numero = numerico;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Conta(int agencia, int numero, double saldo, Cliente cliente) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.Cliente = cliente;
	}

	// ctrl shift F - identa automático
	// Método Saque
	// Todo saque o cliente tem que pagar 0.30centavos
	public void saque(double valor) {
		System.out.println("Digite o valor " + valor);
		if (saldo > 0) {
			if (saldo + limite >= valor) { // saldo tem q estar protected
				saldo -= valor + 0.30;
				// acumularIFN(valor);
				System.out.println("Retire o seu Dinheiro " + valor);
			} else {
				System.out.println("Saldo Insuficiente");
			}
		} else {
			System.out.println("Valor Invalido. Não Existe!");
		}
	}

	// Método Deposita
	public void deposita(double valor) {
		this.saldo += valor;
		// shortcurt (+=) ou saldo=saldo+valor;
		/*
		 * String saldo = Double.toString(this.saldo); return saldo;
		 */
	}

	// Método Transferência 
	// Cada transferencia tem um custo/taxa de 4,0
	public void transferencia(Conta destinatario, Conta remetente, double valor) {
		System.out.println("Valor da Transferência: ");
		// valor = leia.nextDouble();
		if (remetente.getSaldo() >= valor) {
			this.saldo -= valor + 4;
			System.out.println("Transferindo valor... " + valor);
			destinatario.setSaldo(destinatario.getSaldo() + valor);
			remetente.setSaldo(remetente.getSaldo() - valor);
		} else {
			System.out.println("Não é possível transferir esse valor");
		}

		System.out.println("Seu Saldo atual : " + getSaldo());
		// sacar();
		// c.depositar();

	}

}
