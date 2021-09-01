import javax.swing.JOptionPane;

class Main {
  static float numero;
  static float f;//foco
  static float p;//distancia entre o objeto e a vertice 
  static float y;//altura do objeto
  public static void main(String[] args) {
    faz();
  }
  public static void faz (){
    f = digitador("digite o valor do foco"); 
    while (f == 0 ){
      f = digitador("0 é um numero invalido para o foco/nPor favor digite um numero diferente de 0");
    }
    p = digitador ("digite o valor da distacia ");
    while (p > 0){
     p = digitador("0 é um numero invalido para a distancia /nPor favor escreva um numero diferente de 0");
    }
    y = digitador("digite o tamanho o objeto ");
    while (y == 0 ){
    p = digitador("o objeto nao exites/nPor favor digite o tamanho do objeto"); 
    }
  }
  public static float digitador(String mensagem ){
    try{
      numero = Float.parseFloat(JOptionPane.showInputDialog( mensagem ));
    }
    catch (Exception e){
      JOptionPane.showMessageDialog(null,"voce digitou algo errado");
      digitador (mensagem);

    }
    return numero;
  }
}
