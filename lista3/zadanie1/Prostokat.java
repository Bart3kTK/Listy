class Prostokat extends Czworokat  {

    public Prostokat(int bok1, int bok2, int bok3, int bok4, int kat){
        super(bok1, bok2, bok3, bok4, kat);
        
    }

    public double obliczPole() {
        if (dajBok1() != dajBok2())
            return dajBok1() * dajBok2();

        else 
            return dajBok1() * dajBok2();
    }

    public void dajNazwe(){
        System.out.println("Jestem prostokatem");
    }
    
}
