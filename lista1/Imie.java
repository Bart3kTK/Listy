class MojBlad1 extends Exception {};


public class Imie {
    private String imie;

    public Imie(String imie){
        this.imie = imie;

    }

    public void setImie(String a) throws MojBlad1{
        if (a.length() < 3 || a == "Bob") throw new MojBlad1();
        imie = a;
    }
    public void getImie(){
        System.out.println(imie);
    }
}
