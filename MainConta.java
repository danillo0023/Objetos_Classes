package classes_objetos.exercicio2;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(123456, "João Silva", 1000);
        System.out.println(conta);
        conta.realizaDeposito(500);
        System.out.println(conta);
        conta.realizaSaque(300);
        System.out.println(conta);
        conta.realizaSaque(1500);
    }
}
