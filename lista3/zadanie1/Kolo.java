public class Kolo extends Figura {

    private int promien;

    Kolo(int promien){
        if (promien < 0) throw new IllegalArgumentException(promien + "-> niedodatni promien :c");
        this.promien = promien;
    }

    public int dajPromien(){
        return promien;
    }

    public double obliczPole(){
        return (promien * promien * Math.PI);
    }

    public double obliczObwod(){
        return (2 * promien * Math.PI);
    }

    public void dajNazwe(){
        System.out.println("Jestem kolem");
    }
}
