import java.util.Scanner;
public class Main {
Scanner leitor = new Scanner(System.in);
    
    public static void main(String[] args) {
        Main sistema = new Main();
        sistema.controleDePeso();
    }
    public void controleDePeso(){
        System.out.println("Seja bem vindo ao nosso peso de malas!");
        System.out.println("Digite seu nome para iniciarmos ");
        String nome = leitor.next();
        System.out.println("Muito bem, "+nome+" agora o peso da sua mala!, lembrando que ela não pode passar dos 30Kg");
        float peso,pesoPermitido, multa, excesso;
        peso = leitor.nextFloat();
        pesoPermitido = 30;
        excesso = peso - pesoPermitido;
        multa = excesso * 2;
        if(pesoPermitido < peso){
            System.out.println("Sua mala passou da quantidade permitida, você tera que pagar "+multa+" reais de multa");
        }
        
        else{       
                System.out.println("Sua bagagem está dentro do limite!");
            }
        
    }
}
