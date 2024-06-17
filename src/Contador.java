import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt() ;
        int parametroDois = terminal.nextInt();
        terminal.close();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    public class ParametrosInvalidosException extends Exception {
    
        public ParametrosInvalidosException() {
            super("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroDois > parametroUm) {
            int intervalo = parametroDois - parametroUm;
            if(intervalo > 0) {
                for (int i = 1; i <= intervalo; i++) {
                    System.out.println("Imprimindo o numero " + i);
                }
            }
        } else {
            System.out.println("Os parâmetros são iguais. Não há contagem a ser realizada");
        }

    }

}
