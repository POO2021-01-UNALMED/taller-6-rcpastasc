package vehiculos;

import java.util.ArrayList;

public class Fabricante {

    public static ArrayList<Fabricante> fabricantes = new ArrayList<>();
    private String nombre;
    private Pais pais;
    public int ventas;

    public Fabricante() {

    }
    
    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais= pais;
        fabricantes.add(this);
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas() {
        int v = 0;
        for (Fabricante fab : fabricantes) {
            if (fab.ventas > v) {
                v = fab.ventas;
            }
        }
        Fabricante mayor = new Fabricante();
        for (Fabricante fab : fabricantes) {
            if (fab.ventas == v) {
                mayor = fab;
            }
        }
        return mayor;
    }

}