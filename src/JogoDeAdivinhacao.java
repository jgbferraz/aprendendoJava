import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        int numeroUsuario;

        Scanner leitorDoUsuario =  new Scanner(System.in);
        System.out.println("""
        Vamos iniciar nosso jogo.
        -----------------------------------------------------------------------------------
        Você precisa pensar em um número de 0 a 100.
        -----------------------------------------------------------------------------------
        Você vai ter cinco chances para tentar acertar o número.
        -----------------------------------------------------------------------------------
        Preparado? Então vamos começar!!!
        -----------------------------------------------------------------------------------
        """);
        System.out.println("Agora digite o número que você acredita ser o numero secreto?");
        for (int i = 0; i < 5; i++) {
            numeroUsuario = leitorDoUsuario.nextInt();

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("Parabéns você acertou o número secreto.");
                break;
            }else if (numeroUsuario > numeroAleatorio){
                System.out.println("O número secreto é menor que o valor que vc digitou");
            } else {
                System.out.println(" O número secreto é maior do que o valor que vc digitou");

            } if (i == 4) {
                System.out.println("-----------------------------------------------------------------------------------");
                System.out.println("Você errou o numero secreto. O número era " + numeroAleatorio);
                System.out.println("-----------------------------------------------------------------------------------");
            }

        }

    }
}
