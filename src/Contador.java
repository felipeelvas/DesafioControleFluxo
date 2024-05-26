import java.util.Scanner;

public class Contador {
    public  static  void  main(String[] args){
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o Primeiro parâmetro");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametro2 = terminal.nextInt();

        try{
            //chamando o método contendo a lógica de contagem
            contar(parametro1, parametro2);
        }
        catch (ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve se maior que o primeiro.");
        }
    }
    static void  contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametro1 >= parametro2) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametro2 - parametro1;
        for (int i = 0; i <= contagem; i++);
        System.out.println("Imprima o número: " + contagem);
    }
        public static class ParametrosInvalidosException extends Exception{

    }
}

