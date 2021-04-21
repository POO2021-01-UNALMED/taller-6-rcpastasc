package vehiculos;

import java.util.ArrayList;


public class Pais {

    private String nombre;
    private static ArrayList<Pais> paises = new ArrayList();
    public int ventas;

    public Pais() {

    }

    public Pais(String nombre) {
        this.nombre = nombre;
        paises.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Pais paisMasVendedor() {
        int v = 0;
        for (Pais pais : paises) {
            if (pais.ventas > v) {
                v = pais.ventas;
            }
        }
        Pais mayor = new Pais();
        for (Pais pais : paises) {
            if (pais.ventas == v) {
                mayor = pais;
                
            }
        }
        return mayor;
    }
}