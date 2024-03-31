import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
import static java.lang.Integer.parseInt;


public class Lotofacil {

    public static void main(String[] args) throws IOException {
        menu();

    }

    private static void menu() throws IOException {
        int opcao = -1;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("*******MENU APOSTAS****");
            System.out.println(" Opção 1 : Quero apostar de 0 a 100! ");
            System.out.println(" Opção 2 : Quero apostar de A á Z! ");
            System.out.println(" Opção 3 : Quero apostar em par ou ímpar!");
            System.out.println(" Opção 0 : Sair ");
            System.out.println(" Faça sua aposta! ");
            opcao = in.nextInt();
            switch (opcao) {

                case 1:
                    System.out.println(" Opção 1 : 0 a 100 escolhida! ");
                    opcao1();
                    break;

                case 2:
                    System.out.println(" Opção 2 : A á Z escolhida! ");
                    opcao2();
                    break;

                case 3:
                    System.out.println(" Opção 3 : Par ou Ímpar escolhida! ");
                    opcao3();
                    break;

                case 0:
                    System.out.println(" Opção 0 escolhida! ");
                    break;
                default:
                    System.out.println(" O número escolhido não existe! ");

            }
        }while (opcao != 0);
        
    }

    private static void opcao1() {
        Scanner scn = new Scanner(System.in);
        Random secreto = new Random();

        int chute;
        int numeroMaximo = 100;
        int numeroSecreto = secreto.nextInt(100);

        System.out.println(" Digite um número de 0 á 100 ");
        chute= scn.nextInt();

         if(chute > numeroMaximo){
             System.out.println(" NÚMERO INVALIDO! DIGITE UM NÚMERO DE 0 A 100 ");

        }

         else if (chute == numeroSecreto) {
             System.out.println(" VOCÊ ACERTOU E GANHOU : 1000 REAIS!");

         }
         else {
                 System.out.println(" Que pena! O número sorteado foi : " + numeroSecreto);
             }
        }

    private static void opcao2() throws IOException {

        Scanner scn = new Scanner(System.in);


        char letraPremiada = 'A';

        System.out.println(" Digite uma letra de A a Z ");
        int letra = Character.toUpperCase(System.in.read());

             // verificando se é uma Letra ou não e também comparando se a Letra é a Premiada ou não.
            if(Character.isLetter((char) letra)) {

                if(letra == letraPremiada){
                    System.out.println(" Você ganhou R$ 500,00 reais");
                }
                else{
                    System.out.println(" Que pena! A letra sorteada foi : " + letraPremiada);
                }
            }
             else{
            System.out.println(" Aposta Invalida ");
        }
        }


    private static void opcao3() {

        Scanner scn= new Scanner(System.in);

        int numerochute;

        System.out.println(" Digite um número ");
         numerochute = scn.nextInt();

         if( (numerochute % 2) == 0) {
             System.out.println(" Você ganhou R$ 100,00 reais. ");
         }
         else{
             System.out.println(" Que pena! O número digitado é ímpar e a premiação foi para números pares. ");
         }



    }


}