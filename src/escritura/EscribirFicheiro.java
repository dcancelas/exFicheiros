package escritura;

import lectura.Xogador;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirFicheiro {

    PrintWriter escribir = null;
    FileWriter ficheiro;

    public void escribirNumeros(String nomeFicheiro, int numero, boolean continuar) {
        try {
            ficheiro = new FileWriter(nomeFicheiro, continuar);
            escribir = new PrintWriter(ficheiro);
            escribir.println(numero);
        }catch (IOException ex) {
            System.out.println("Erro escribirNumeros "+ex.toString());
        }finally {
            escribir.close();
        }
    }
    public void escribirObxetos(String nomeFicheiro) {
        try {
            Xogador x1 = new Xogador("Pedro", 6);
            Xogador x2 = new Xogador("Rafa", 12);
            ficheiro = new FileWriter(nomeFicheiro, true);
            escribir = new PrintWriter(ficheiro);
            escribir.println(x1.getNome()+", "+x1.getDorsal());
            escribir.println(x2.getNome()+", "+x2.getDorsal());
        }catch (IOException ex) {
            System.out.println("Erro "+ex.toString());
        }finally {
            escribir.close();
        }
    }
}
