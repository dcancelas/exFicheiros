package lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lectura {
    Scanner sc;

    public void lerLineas(File fich) {
        try {
            sc = new Scanner(fich);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }catch (FileNotFoundException ex) {
            System.out.println("Erro lerLineas "+ex.toString());
        }
    }
    public void lerPalabra(File fich) {
        try {
            sc = new Scanner(fich);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        }catch (FileNotFoundException ex) {
            System.out.println("Erro lectura palabra "+ex.toString());
        }
    }
    public void lerPalabrasUsoDeLimitadores(File fich) {
        try {
            sc = new Scanner(fich).useDelimiter(",\\s*");
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        }catch (FileNotFoundException ex) {
            System.out.println("Erro lectura palabra "+ex.toString());
        }
    }
    public LinkedList<Integer> leerNumeros(File fich) {
        LinkedList<Integer> listaNumeros = new LinkedList<>();
        try {
            sc = new Scanner(fich);
            while (sc.hasNextInt()) {
                Integer valor = sc.nextInt();
                listaNumeros.add(valor);
            }
        }catch (FileNotFoundException ex) {
            System.out.println("Erro lectura numeros "+ex.toString());
        }
        return listaNumeros;
    }
    public void lerObxetos(File fich) {
        String nome, cadea;
        int dorsal;

        try {
            sc = new Scanner(fich);
            while (sc.hasNextLine()) {
                cadea = sc.nextLine();
                String[] datos = cadea.split(",");
                nome = datos[0];
                dorsal = Integer.parseInt(datos[1]);
                Xogador x = new Xogador(nome, dorsal);
                System.out.println("// "+x);

              /*Se teño un ArrayList lista
                lista.add(x);
                lista.add(new Xogador(datos[0], Integer.parseInt(datos[1])));*/
            }
        }catch (FileNotFoundException ex) {
            System.out.println("Erro lectura obxetos "+ex.toString());
        }finally {
            sc.close();
        }
    }
}
