package lecturaescritura;

import escritura.EscribirFicheiro;
import lectura.Lectura;

import java.io.File;
import java.util.LinkedList;

public class LecturaEscitura {

    public void escribirPares(File ficheiroNumeros, String ficheiroPares) {
        Lectura lectura = new Lectura();
        EscribirFicheiro escritura = new EscribirFicheiro();

        LinkedList<Integer> listaNumeros = lectura.leerNumeros(ficheiroNumeros);
        for (Integer listaNumero : listaNumeros) {
            if ((listaNumero % 2) == 0) {
                escritura.escribirNumeros("pares.txt", listaNumero, true);
            }
        }
    }
}
