import java.util.ArrayList;
import java.lang.Math;

public class WierszTrojkataPascala {

    private ArrayList<Integer> lista;

    public WierszTrojkataPascala(int n){

        if (n < 0)
            throw new IllegalArgumentException(n+ " -> Wiersze zaczynaja sie od 0 !!! ╚(•⌂•)╝");

        if (n > 33) 
            throw new IllegalArgumentException(n+ " -> Baaaardzo duza liczba, wiersze koncza sie na 33 (๏_๏)");

        lista = wierszTrojkata(n);
        
    }
    private ArrayList<Integer> wierszTrojkata(int n){

        ArrayList<Integer> wiersz = new ArrayList<Integer>();
        wiersz.add(1);

        for (int i = 1; i <= n; i++){
            double kolejny;
            kolejny = ((n - i + 1) *(wiersz.get(i-1)/(double)i));
            wiersz.add((int) Math.ceil(kolejny));
        }
        return wiersz;

    }

    public int wspolczynnik(int m){
        if (m < 0) 
            throw new IllegalArgumentException(m + " -> Numeracja wierszy zaczyna sie od 0 !!! ╚(•⌂•)╝");
            
        if (m  >= lista.size()) 
            throw new IllegalArgumentException(m + " -> (๏_๏) Za duzaaaaa liczba wierszy jest ich " + (lista.size() - 1) + " (๏_๏)");
        return lista.get(m);

    }


}
