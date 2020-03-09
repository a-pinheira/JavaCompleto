package com.qintess.projetoqintess.controler.agencia;

import com.qintess.projetoqintess.model.agencia.Conta;

public class ContaCorrente extends Conta{

	public ContaCorrente(int agencia, int numero, double saldo,
			com.qintess.projetoqintess.model.agencia.Cliente cliente) {
		super(agencia, numero, saldo, cliente);
		// TODO Auto-generated constructor stub
	}
		
	public void sacarDinheiro(double valor) {
		if(valor<=getSaldo()) {
			if(valor>300) {
				System.out.println("Só é possível sacar até R$300,00");
			} else{ 
				/*if(valor>getSaldo()-limite){
					setCreditoEspecial(-(valor-getSaldo()));
					limite -= creditoespecial;
					super.sacarDinheiro(valor);	
					setSaldo(getSaldo()-2);
				} else{
					super.sacarDinheiro(valor);
					setSaldo(getSaldo()-0.3);
				}
			}  else
			System.out.println("Esse valor não está disponível");
	}
	
	public void depositarDinheiro(double valor) {
		if(creditoespecial==0)
			super.depositarDinheiro(valor);
		else {
			if(valor>creditoespecial) {
				double valorReal;
				limite += creditoespecial;
				valorReal = valor-creditoespecial;
				creditoespecial = 0;
			 
				setSaldo(valorReal);
			}
			else if(creditoespecial==valor) {
				limite += creditoespecial;
				creditoespecial = 0;
				
			}
			else{
				creditoespecial -= valor;	
				limite -= creditoespecial; */
			}
			
		} 
		}
	
	}

