package classes_objetos.exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu cargo: ");
        String cargo = scanner.nextLine();

        System.out.println("Digite seu salário Bruto: ");
        double salario = scanner.nextDouble();


        Funcionario funcionario = new Funcionario(nome, cargo, salario);
        System.out.println("O VALOR DO SALARIO LIQUIDO É " + funcionario.salarioLiquido(salario));

    }

}
