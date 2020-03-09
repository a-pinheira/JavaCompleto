package com.qintess.projetoqintess.controler.agencia;

import com.qintess.projetoqintess.model.agencia.Conta;

public class ContaCorrente extends Conta{

	public ContaCorrente(int agencia, int numero, double saldo,
			com.qintess.projetoqintess.model.agencia.Cliente cliente) {
		//super � para referenciar a classe m�e 
		super(agencia, numero, numero + saldo, cliente);
		setLimite (getLimite());
		//setLimite (limite);
		// TODO Auto-generated constructor stub
	}
	
	public void setSaldo(double saldo) {
		super.setSaldo(saldo + this.limite);
	}
		
	private double creditoespecial=0;
	private double limite;
	
		
	public double getCreditoespecial() {
		return creditoespecial;
	}

	public void setCreditoespecial(double creditoespecial) {
		this.creditoespecial = creditoespecial;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void sacarDinheiro(double valor) {
		if(valor<=getSaldo()) {
			if(valor>300) {
				System.out.println("S� � poss�vel sacar at� R$300,00");
			} else{ 
				if(valor>getSaldo()-limite){
					setCreditoespecial(-(valor-getSaldo()));
					limite -= creditoespecial;
					//Chamando o  m�todo de  Saque da classe m�e, que no  caso  � a Conta
					super.saque(valor);	
					setSaldo(getSaldo()-2);
				} else{
					super.saque(valor);
					setSaldo(getSaldo()-0.3);
				}
			}
			} else {
					System.out.println("Esse valor n�o est� dispon�vel");
			
					}
		}
		
	public void deposita(double valor) {
		if(creditoespecial==0)
			super.deposita(valor);
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
				limite -= creditoespecial;
			}
			
		} 
		}
	
	}

