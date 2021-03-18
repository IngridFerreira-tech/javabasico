package modulo1;
/*
 * Classe demostrativa de variáveis e constantes
 * 
 * versão 1.0
 * 
 * autor: Ingrid Ferreira
 * 
 */
public class Variaveis_Constantes1 {

	public static void main(String[] args) {
		//Criação de constantes
		
				final double ACELERACAO_GRAVIDADE_TERRA = 9.80665;
				
				//Criação de variáveis
				
				String nome="José";
				
				int idade=48;
				
				double peso=73.4,altura=1.73;
				
				char sexo='m',cnh='a';
				
				boolean doadorOrgaos=true;
				
				System.out.println("Nome: "+nome);
				System.out.println("Idade: "+idade);
				System.out.println("Peso: "+peso);
				System.out.println("Altura: "+altura);
				System.out.println("Sexo: "+sexo);
				System.out.println("Habilitação: "+cnh);
				System.out.println("Doador de orgãos: "+doadorOrgaos);
				System.out.println("Gravidade na terra é: "+ACELERACAO_GRAVIDADE_TERRA+"m/s2");

	}

}
