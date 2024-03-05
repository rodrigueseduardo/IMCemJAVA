import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a calculadora de IMC!");

        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o seu peso em kilogramas: ");
            double peso = Double.parseDouble(scanner.nextLine());

            System.out.println("Digite a sua altura em metros: ");
            double altura = Double.parseDouble(scanner.nextLine());

            // cálculo do IMC chamando o método criado abaixo
            double imc = calcularIMC(peso, altura);

            // exibe o IMC e a categoria de peso
            System.out.println("\nSeu IMC é: " + imc);

            if (imc < 18.5)
                System.out.println("Abaixo do peso");
            else if (imc < 25)
                System.out.println("Peso normal");
            else if (imc < 30)
                System.out.println("Sobrepeso");
            else
                System.out.println("Obesidade");

            // pergunta ao usuário se deseja realizar o cálculo novamente
            System.out.print("\nDeseja que o cálculo seja realizado novamente? (S/N): ");
            String resposta = scanner.nextLine().toUpperCase();

            continuar = resposta.equals("S");
        }

        System.out.println("\nObrigado por utilizar minha calculadora de IMC!");
    }

    static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}
