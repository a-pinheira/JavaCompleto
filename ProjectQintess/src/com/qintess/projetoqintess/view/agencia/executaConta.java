package com.qintess.projetoqintess.view.agencia;

import com.qintess.projetoqintess.controler.agencia.ContaCorrente;
import com.qintess.projetoqintess.controler.agencia.ContaPoupanca;
import com.qintess.projetoqintess.model.agencia.Cliente;
import com.qintess.projetoqintess.model.agencia.Conta;

public class executaConta {

	public static void main (String args[]) {
		//Instância- executa de conta
		Conta contaCliente = new Conta(0, 0, 0, null); //passa paramentros dentro de conta(), se usar construtor
		contaCliente.setAgencia(4300); //acessando esta instancia por meio da variável e passando um valor para ela
	    contaCliente.deposita(1200);
	    contaCliente.saque(300);
		//contaCliente.getAgencia();
		/*//cria uma instancia de CLIENTE
	    Cliente cliente = new Conta("Joao", 1212125, 1231231232, null);
		// cria uma conta corrente
		ContaCorrente cce2 = new ContaCorrente(1234, 568, 200, cliente2, 500);
		// cria uma conta poupanca
		ContaPoupanca contapoupanca = new ContaPoupanca(1235, 555, 3000, cliente);
		*/
		System.out.println("Retorna o número da agencia" + contaCliente.getAgencia());
		// Instancia de  Cliente
		
		Cliente contaCli = new Cliente("Simone", "123.455.654/98", "simone@uhul.com", "22.123.432-5", "go@123");
		contaCli.setNome("Simone");
		contaCliente.setCliente(contaCli);
		System.out.println("Acesso aos metodos"+ contaCliente.getCliente().getNome());
		String nome="o";
		//CONTA  CORRENTE
		// Conta c2 = new Conta(12, 1245-0, 1500, contaCli);
		ContaCorrente c2 = new ContaCorrente(011, 1234, 500, null);
		c2.saque(800);
		//c2.getSaldo();
		System.out.println(c2.getSaldo());
		//c2 = cc;

		//System.out.println(contacorrente2.getLimite());
		//contacorrente2.sacarDinheiro(300);
		//System.out.println(contacorrente2.getLimite() + " " + contacorrente2.getCreditoEspecial());
		
		//CONTA POUPANÇA
		ContaPoupanca cp = new ContaPoupanca(001, 123-3, 250, null);
		cp.deposita(250);
		cp.saque(350);
		cp.transferencia(contaCliente, c2, 550);
		
}
}
