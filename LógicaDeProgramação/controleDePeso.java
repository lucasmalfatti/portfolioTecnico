import java.util.Scanner;

public class Main
{
    Scanner sc = new Scanner(System.in);
    
	public static void main(String[] args) {
        Main pescaria = new Main();
        pescaria.controleDePeso();
	}
	
	public void controleDePeso(){
	    System.out.println("Digite seu nome!");
	    String nome = sc.next();
	    System.out.println(nome+", Seja bem vindo ao sistema de controle de peso!");
	    float multa, peso, pesoPermitido, excesso;
        System.out.println("Digite o peso permitido!");
		pesoPermitido = sc.nextFloat();
        System.out.println("Digite o peso pescado!");
		peso = sc.nextFloat();
		if(pesoPermitido < peso){
		    excesso = peso - pesoPermitido;
		    multa = excesso * 4;   
		    System.out.println("Houve excesso de "+excesso+"kg, com multa de R$"+multa);
		}
		else{
		    System.out.println("O pescador não vai pagar nada!");
		}
	}
}
