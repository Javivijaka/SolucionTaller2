package com.clases;

import java.util.ArrayList;
import java.util.List;

public class BeneficiosCovid19 {
    //Debe ser el numero entero aleatorio puedes usar la funcion ramdom para esto
    private String id;
    private String nombre;
    private Float valorSubsidio;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getValorSubsidio() {
        return valorSubsidio;
    }

    public void setValorSubsidio(Float valorSubsidio) {
        this.valorSubsidio = valorSubsidio;
    }

    //Completar clase

    //Implementar un metodo que retorne el mejor beneficio comparando los valores de todos los beneficios
    public Float getMejorbeneficios(List<BeneficiosCovid19>lista){
        float max = new Float(1);
        for (int i =0;i<lista.size();i++){
            if (lista.get(i).getValorSubsidio() > max){
                max = lista.get(i).getValorSubsidio();
            }
        }
        return max;
    }

    public String getMejorId(List<BeneficiosCovid19>lista, float x){
        String id = null;
        for (int i =0;i<lista.size();i++){
            if (lista.get(i).getValorSubsidio() == x){
                id = lista.get(i).getId();
            }
        }
        return id;
    }

    public String getMejorBen(List<BeneficiosCovid19>lista, float y){
        String Ben = null;
        for (int i =0;i<lista.size();i++){
            if (lista.get(i).getValorSubsidio() == y){
                Ben = lista.get(i).getNombre();
            }
        }
        return Ben;
    }

    @Override
    public String toString() {
        return "BeneficiosCovid19{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", valorSubsidio=" + valorSubsidio +
                '}';
    }
}
