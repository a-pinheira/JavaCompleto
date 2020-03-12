package com.qintess.projetoqintess.view.agencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.qintess.projetoqintess.model.agencia.Cliente;
import com.qintess.projetoqintess.model.agencia.Conta;
import com.qintess.projetoqintess.controler.agencia.ContaCorrente;


public class executaArq {
	public static void main(String[] args) throws FileNotFoundException {
		
		//Path caminho = Paths.get(System.getProperty("user.home"), "contas.txt");
		File arquivo = new File("contas.txt");
		try {
		
		Scanner scanner = new Scanner(arquivo);

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			String[] colunas = scanner.nextLine().split(";");
			Cliente cliente = new Cliente(colunas[4],colunas[5],colunas[6],colunas[7],colunas[8]);
			//Cliente cliente1 = new Cliente("nome", "cpf", "senha", "email", "rg");
			System.out.println("Nome cliente " + cliente.getNome()==colunas[4]);
			System.out.println("CPF " + cliente.getCpf());
			System.out.println("RG " + cliente.getRg());
			System.out.println("Senha " + cliente.getSenha());
     		//String[] colunas = scanner.nextLine().split(";");
			//Diferença entre contentEquals e equalsIgnoreCase
			//String tipoConta = colunas [9];
			if (colunas[3].contentEquals("CC")) {
				colunas[3] = "1";
			}
			else if (colunas[3].contentEquals("CP")) {
				colunas[3] = "2";
				
			}
			ContaCorrente cc = new ContaCorrente(0, 0, 0, cliente);
			//ContaCorrente cc = new ContaCorrente(Double.parseDouble(colunas[0]), Double.parseDouble(colunas[1]), Double.parseDouble(colunas[2]), cliente.equals(colunas));
			System.out.println("\n\t ----- DADOS DA AGENCIA ---- ");
			System.out.println("Agencia " + cc.getAgencia());
			System.out.println("Numero da Conta " + cc.getNumerico());
			System.out.println("Saldo " + cc.getSaldo());
			System.out.println("Cliente " + cc.getCliente());
		}
		scanner.close();
	} catch (FileNotFoundException e) {
		//TODO AUTO-generated catch block
		e.printStackTrace();
	}
	}
}


