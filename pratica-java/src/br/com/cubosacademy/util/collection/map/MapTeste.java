package br.com.cubosacademy.util.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapTeste {

    public static void main(String[] args) {
        Map<String,String> mapa = new HashMap<String,String>();

        mapa.put("121", "Kaique");
        mapa.put("122", "Kaique");
        mapa.put("123", "Kaique Devesa");
        mapa.put("124", "Pedro");
        //System.out.println(mapa.get("124"));
        //System.out.println(mapa);

        System.out.println(mapa.values());
        System.out.println(mapa.keySet());

        for (String nome : mapa.values()) {
            System.out.println(nome);
        }
    }
}
