package exercicio1;

public class Main {
    public static void main(String[] args) {
            Circulo circulo = new Circulo(5);

            double perimetro = circulo.getPerimetro();
            System.out.println("Perímetro: " + perimetro);

            double area = circulo.getArea();
            System.out.println("Área: " + area);
        }
}