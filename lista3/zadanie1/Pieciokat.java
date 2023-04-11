public class Pieciokat extends Figura {

    private int bok;

    Pieciokat(int bok){
        if (bok < 0) throw new IllegalArgumentException(bok + "-> niedodatni bok :c");
        this.bok = bok;
    }

    public int dajBok(){
        return bok;
    }

    public double obliczPole(){
        return ( ( 5.0 / 4.0 ) * bok * bok * Math.sqrt(3.0)); 
    }

    public double obliczObwod(){
        return (5 * bok);
    }

    public void dajNazwe(){
        System.out.println("Jestem pieciokatem");
    }
}
