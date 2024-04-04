package classes_objetos.exercicio3;

import java.util.Scanner;


import static classes_objetos.exercicio3.Inss.valorInss;

public class Funcionario {
    String nome, cargo;
    double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double salarioLiquido(double salario) {

        double descontoLiquido =   valorInss(salario)-Irff.calculaIrff(salario);
        return descontoLiquido;
    }

}
