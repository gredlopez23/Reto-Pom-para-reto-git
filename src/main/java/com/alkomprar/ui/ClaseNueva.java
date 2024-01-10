package com.alkomprar.ui;

public class ClaseNueva {
    public static void main(String[] args) {

        Albanil albanil = new Albanil();
        albanil.setId("102030");
        albanil.setNombre("Rafa Peres");
        albanil.setHorasTrabajadas(40);
        albanil.setSalario(1000F);

        Arquitecto arquitecto = new Arquitecto();
        arquitecto.setId("98907");
        arquitecto.setNombre("Perdo Gonzales");
        arquitecto.setSalario(3000000F);


        System.out.println("Salario Albañil " +  albanil.getSalario());
        System.out.println("Salario Arquitecto " +  arquitecto.getSalario());
        System.out.println("nombre arquitecto " +  arquitecto.getNombre());

    }
}
