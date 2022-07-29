package modulo2.sesion8;

import java.util.HashMap;

public class Mapas {

    public static void main(String[] args) {
        prueba_mapa();
    }

    public static void prueba_mapa() {

        HashMap<Integer, String> mapa = new HashMap<Integer, String>();
        mapa.put(1, "Primer item");
        mapa.put(0, "Otra cosa");
        mapa.put(2, "Otra cosa");
        mapa.put(2, "Algo ");

        System.out.println(mapa); // mapa.tostring();

        System.out.println(mapa.get(2));
        
        System.out.println(mapa.keySet());
        
        System.out.println(mapa.values());
        

    }

}
