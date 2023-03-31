
public class LiczbyPierwsze {
    private boolean czyPierwsza[];
    private int iloscPierwszych = 0;
    private int pierwsze[];

    public LiczbyPierwsze(int n){


        czyPierwsza =  boolTablica(n);
        
        czyPierwsza[0] = false;                 //liczby pierwsze zaczynaja sie od 2
        czyPierwsza[1] = false;                 //zatem wywalamy 0 i 1

        czyPierwsza = sitoTablica(czyPierwsza, n);


        iloscPierwszych = iloscTrue(czyPierwsza, n);

        pierwsze = trueNaPierwsze(czyPierwsza, n, iloscPierwszych);


        
    }
    private int[] trueNaPierwsze(boolean czyPierwsza[], int n, int iloscPierwszych){

        //Tablice boolean zamiania na tablice int przy wartosci true 
        int pierwsze[] = new int[iloscPierwszych];
        int id = 0;
        for (int i=0; i<=n; i++)
            if(czyPierwsza[i] == true && id<iloscPierwszych){
                pierwsze[id]=i;
                id ++;}
        return pierwsze;
        
    }
    private boolean[] sitoTablica(boolean tab[], int n){            //
        for (int i = 2; i<=n; i++)                                  //
            if (tab[i] == true)                                     // Algorytm sita
                for (int k = 2*i; k<=n; k+=i)                       //
                    czyPierwsza[k] = false;                         //
        return czyPierwsza;                                         //
            
        
    }

    private boolean[] boolTablica(int n){           //
        boolean[] czyPierwsza = new boolean[n+1];   //
        for (int i = 0; i<=n ; i++)                 // Tworzenie tablicy boolean od 0 do n
            czyPierwsza[i] = true;                  //
        return czyPierwsza;                         //
    }

    private int iloscTrue(boolean tab[], int n){    //
        int ilosc = 0;                              //
        for (int i = 2; i<=n; i++)                  // Zliczanie wartosci true w tablicy
            if (tab[i] == true) ilosc ++;           //
        return ilosc;                               //
    }

    public String getLiczba(int m){                 //
        if (m > iloscPierwszych-1)                  //  Metoda zwracajaca m-ta liczbe
            return "Liczba spoza zakresu";          //  pierwsza wygenerowana przez
        return Integer.toString(pierwsze[m]);       //  program
    }
}
