import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        int numeroDigitado = 0;

        Scanner leitorUsuario = new Scanner(System.in);
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        System.out.println("Digite um número inteiro");
        numeroDigitado = leitorUsuario.nextInt();
       //System.out.println(numeroDigitado);
        if (numeroDigitado > 0) {
            System.out.println("Número Positivo!!!");
        } else if (numeroDigitado == 0) {
            System.out.println("Número digitado foi o zero e zero é neutro!!!");
        }else {
            System.out.println("Número Negativo");
        }

        System.out.println("***********************************************");
        System.out.println("***********************************************");
        System.out.println("***********************************************");
    }
}
