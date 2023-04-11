public abstract class Czworokat extends Figura{

        private int bok1;
        private int bok2;
        private int bok3;
        private int bok4;
        private double kat;

    public Czworokat(final int bok1, final int bok2,final int bok3, final int bok4, int kat){
        if (bok1 <= 0 || bok2 <= 0 || bok3 <= 0 || bok4 <= 0) 
            throw new IllegalArgumentException("Otrzymano ujemny bok");

        if (kat < 0 || kat > 180)
            throw new IllegalArgumentException(kat + " -> Otrzymano kat spoza zakresu (0, 180)");

            
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
        this.bok4 = bok4;
        this.kat = (kat / 180.0 * Math.PI); //kat w radianach

    }
    public abstract double obliczPole();
    public abstract void dajNazwe();

    public double obliczObwod(){
        return (bok1 + bok2 + bok3 + bok4);
    }

    public int dajBok1(){
        return bok1;
    }
    public int dajBok2(){
        return bok2;
    }
    public int dajBok3(){
        return bok3;
    }
    public int dajBok4(){
        return bok4;
    }
    public double dajKat(){
        return kat;
    }




}
