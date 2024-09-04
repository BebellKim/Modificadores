package Modificadores;

import java.util.Scanner;

public class Pessoa_Automovel {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		// objeto Pessoa criado
		Pessoa pessoa= new Pessoa ();
		
		String cor, nome;
		int velocidade;
		
		System.out.println("Informe a cor do carro");
		cor = ler.next();
		
		System.out.println("Informe o nome do carro");
		nome = ler.next();
		
		System.out.println("Informe a velocidade do carro");
		velocidade = ler.nextInt();
		
		
		// método compracarro
		pessoa.compracarro(cor,nome,velocidade);
		
		
		//Retorno
		Automovel carro = pessoa.getAutomovel();
		
		System.out.println("O carro tem o nome de " +carro.getNome()+ " da cor " + carro.getCor() +" que atinge a velocidade de " + carro.getvelocidade());
	}

}
