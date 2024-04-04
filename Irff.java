package classes_objetos.exercicio3;

public class Irff {
    public static double calculaIrff(double salario) {
        double impostoIrrf;
        double parcelaDeduzir;

        if (salario <= 1903.98) {
            impostoIrrf = 0;
            parcelaDeduzir = 0;
        } else if (salario <= 2826.65) {
            impostoIrrf = 0.075;
            parcelaDeduzir = 142.80;
        } else if (salario <= 3751.05) {
            impostoIrrf = 0.15;
            parcelaDeduzir = 354.80;
        } else if (salario <= 4664.68) {
            impostoIrrf = 0.225;
            parcelaDeduzir = 636.13;
        } else {
            impostoIrrf = 0.275;
            parcelaDeduzir = 869.36;
        }
        System.out.println("IRFF "+ (salario * impostoIrrf) + parcelaDeduzir);
        return (salario * impostoIrrf) + parcelaDeduzir;
    }
}

