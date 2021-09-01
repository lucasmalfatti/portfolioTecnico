import java.util.Scanner;

public class Main
{
    Scanner sc = new Scanner(System.in);
    int n;
    
    public int digitaNumero(){
        sc = new Scanner(System.in);
        try{
            n = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Você digitou um valor inválido!\nTente novamente!");
            digitaNumero();
        }
        return n;
    }
    
	public static void main(String[] args) {
        Main pescaria = new Main();
        pescaria.atividade();        
	}
  public void atividade(){
    System.out.println("Digite seu nome!");
    String nome = sc.next();
    System.out.println("Digite seu ano de nascimento!");
    int ano = digitaNumero();
    int idade = 2021-ano;
    System.out.println("Bem vindo "+nome+" Você tem "+idade+" anos!");
  }	
}
