package com.clases;

import java.util.List;

public class Clientes {
    private String nombre;
    private String cedula;
    private List<BeneficiosCovid19> ListaBeneficios;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public List<BeneficiosCovid19> getListaBeneficios() {
        return ListaBeneficios;
    }
    public void setListaBeneficios(List<BeneficiosCovid19> listaBeneficios) {
        ListaBeneficios = listaBeneficios;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", ListaBeneficios=" + ListaBeneficios +
                '}';
    }

}



