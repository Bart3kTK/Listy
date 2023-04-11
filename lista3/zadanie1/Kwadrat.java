class Kwadrat extends Czworokat  {

    public Kwadrat(int bok1, int bok2, int bok3, int bok4, int kat){
        super(bok1, bok2, bok3, bok4, kat);
        
    }

    public double obliczPole() {
        return dajBok1() * dajBok4();
    }

    public void dajNazwe(){
        System.out.println("Jestem kwadratem");
    }
    
}
