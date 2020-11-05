package com.clientes;

import com.clases.BeneficiosCovid19;
import com.clases.Clientes;

import java.net.BindException;
import java.util.*;


public class Main {

    private static Object Float;

    public static void main(String[] args) {

        //Asignamos el valor a las listas
        List<BeneficiosCovid19> lista1 = new ArrayList<>();
        for (int i=0;i<3;i++){
            BeneficiosCovid19 Beneficios1= new BeneficiosCovid19();
            Beneficios1.setId(getIdBeneficio());
            Beneficios1.setNombre("Beneficio Vendedores" + i );
            Beneficios1.setValorSubsidio((float)getValor());
            lista1.add(Beneficios1);
        }

        List<BeneficiosCovid19> lista2 = new ArrayList<>();
        for (int a=0;a<2;a++){
            BeneficiosCovid19 Beneficios2= new BeneficiosCovid19();
            Beneficios2.setId(getIdBeneficio());
            Beneficios2.setNombre("Beneficio Musicos" + a);
            Beneficios2.setValorSubsidio((float)getValor());
            lista2.add(Beneficios2);
        }


        //Se valida el mejor beneficio y se imprime el reporte con la información

        Main.Comparar(lista1,lista2);

    }

    //Metodo que retorna el reporte de comparación de las 2 listas

    private static void Comparar(List<BeneficiosCovid19>lista1,List<BeneficiosCovid19>lista2){
        BeneficiosCovid19 Beneficioa = new BeneficiosCovid19();

        Clientes Cliente1 = new Clientes();
        Cliente1.setNombre("Alfonsina Perez");
        Cliente1.setCedula("1125684589");
        Cliente1.setListaBeneficios(lista1);

        Clientes Cliente2 = new Clientes();
        Cliente2.setNombre("Pedro Hernandez");
        Cliente2.setCedula("1025685459");
        Cliente2.setListaBeneficios(lista2);

        float mejor1 = Beneficioa.getMejorbeneficios(lista1);
        float mejor2 = Beneficioa.getMejorbeneficios(lista2);
        float max = (mejor1>mejor2)?mejor1:mejor2;
        if (max == mejor1) {
                String id = Beneficioa.getMejorId(lista1, max);
                String Ben = Beneficioa.getMejorBen(lista1, max);
                System.out.println("El cliente con mejor beneficios es: "+ Cliente1.getNombre()+" "+"con cedula: "+
                        Cliente1.getCedula());
                System.out.println("El id es: " + id);
                System.out.println("El nombre: " + Ben);
                System.out.println("El mejor Valor: " + max);
        } else {
                String id = Beneficioa.getMejorId(lista2, max);
                String Ben = Beneficioa.getMejorBen(lista2, max);
                System.out.println("El cliente con mejor beneficios es: "+ Cliente2.getNombre()+" "+"con cedula: "+
                        Cliente2.getCedula());
                System.out.println("El id: " + id);
                System.out.println("El nombre: " + Ben);
                System.out.println("El mejor Valor: " + max);
        }

    }

    //Metodo que retorna el Id del beneficio de manera aleatoria
    private static String getIdBeneficio(){
       Integer Rd = new Integer(1);
       Rd = (int)(2000*Math.random());
        return Rd.toString();
    }

    //Metodo que retorna el Valor de Subsidio del beneficio de manera aleatoria
    private static Integer getValor(){
        Integer Rv = (int)(40000*Math.random());
        return Rv;
    }


}
