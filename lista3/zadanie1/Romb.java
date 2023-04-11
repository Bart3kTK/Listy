class Romb extends Czworokat  {

    public Romb(int bok1, int bok2, int bok3, int bok4, int kat){
        super(bok1, bok2, bok3, bok4, kat);
        
    }

    public double obliczPole() {
        return  (dajBok1() * dajBok2() * Math.sin(dajKat()) );

    }

    public void dajNazwe(){
        System.out.println("Jestem rombem");
    }
    
}

