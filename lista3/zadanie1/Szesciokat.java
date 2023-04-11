public class Szesciokat extends Figura {

    private int bok;

    Szesciokat(int bok){
        if (bok < 0) throw new IllegalArgumentException(bok + "-> niedodatni bok :c");
        this.bok = bok;
    }

    public int dajBok(){
        return bok;
    }

    public double obliczPole(){
        return ( ( 3.0 / 2.0 ) * bok * bok * Math.sqrt(3.0)); 
    }

    public double obliczObwod(){
        return (6 * bok);
    }

    public void dajNazwe(){
        System.out.println("Jestem szesciokatem");
    }
}
