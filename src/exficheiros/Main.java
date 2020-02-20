package exficheiros;

import escritura.EscribirFicheiro;
import lectura.Lectura;
import lecturaescritura.LecturaEscitura;

import java.io.File;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
		LecturaEscitura obx = new LecturaEscitura();
		EscribirFicheiro escritura = new EscribirFicheiro();
		obx.escribirPares(new File("num.txt"), "pares.txt");

		/*Lectura obxLec = new Lectura();
	    EscribirFicheiro obxExc = new EscribirFicheiro();
		obxExc.escribirNumeros("num.txt", true);
		for (int i = 0; i < 999; i++) {
			obxExc.escribirObxetos("xogadores.txt");
		}*/

	    /*File f = new File("palabras.txt");
	    File f2 = new File("/home/local/DANIELCASTELAO/dcancelasgarcia/Escritorio/palabras2.txt");
	    //obxLec.lerLineas(f2);
		obxLec.lerPalabrasUsoDeLimitadores(f);
		LinkedList<Integer> lista  =obxLec.leerNumeros(f);
		for (Integer v :lista) {
			System.out.println("** "+v);
		}
		obxLec.lerObxetos(f);*/
    }
}
