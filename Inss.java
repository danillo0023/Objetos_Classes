package classes_objetos.exercicio3;

public class Inss {
    public static double valorInss(double salario) {
        double aliquotaInss;
        if (salario <= 1751.81) {
            aliquotaInss = 0.08;
        } else if (salario <= 2919.72) {
            aliquotaInss = 0.09;
        } else if (salario <= 5839.45) {
            aliquotaInss = 0.11;
        } else {
            aliquotaInss = 0.12;
        }
        return salario - (salario * aliquotaInss);
    }
}
