
public class LiczbyPierwsze {
    private boolean czyPierwsza[];
    private int iloscPierwszych = 0;
    private int pierwsze[];
    private int id;

    public LiczbyPierwsze(int n){


        czyPierwsza = new boolean[n+1];         //
        for (int i = 0; i<=n ; i++)             // Tworzenie tablicy boolean od 0 do n
            czyPierwsza[i] = true;              // 
        
        czyPierwsza[0] = false;                 //liczby pierwsze zaczynaja sie od 2
        czyPierwsza[1] = false;                 //zatem wywalamy 0 i 1

        for (int i = 2; i<=n; i++){             //
            if (czyPierwsza[i] == true){        // Algorytm sita
                iloscPierwszych ++;             //     +
                for (int k = 2*i; k<=n; k+=i){  // Zliczanie znalezionych liczb pierwszych
                    czyPierwsza[k] = false;     //
                }
            }
        }

        pierwsze = new int[iloscPierwszych];                    //
        id = 0;                                                 //

        for (int i=0; i<=n; i++){                               // Tworzenie tablicy liczb pierwszych
            if(czyPierwsza[i] == true && id<iloscPierwszych){   //
                pierwsze[id]=i;                                 //
                id ++;                                          //
            }
        }
    }


    public String getLiczba(int m){
        if (m > iloscPierwszych-1)
            return "Liczba spoza zakresu";
        return Integer.toString(pierwsze[m]);
    }
}
