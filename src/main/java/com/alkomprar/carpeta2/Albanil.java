package com.alkomprar.carpeta2;

public class Albanil extends Trabajador {

    private int horasTrabajadas;
    private Float Salario;

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public Float getSalario() {
        return Salario;
    }

    @Override
    public void setSalario(Float salario) {
        Salario = salario * getHorasTrabajadas();
    }
}
