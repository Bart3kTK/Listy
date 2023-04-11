
public class Main {
    public static void main(String[] args){
        
        int iloscDanych = args.length - 2;
        char typ = args[0].charAt(0);

        if (iloscDanych == 4 && typ == 'c'){
            int dane[] = new int[5];

            for ( int i = 0; i < 5; i++){
                try{ dane[i] = Integer.parseInt(args[i+1]);}

                catch (NumberFormatException ex) {
                    System.out.println(args[i+1]+" -> nieprawidlowa dana ╚(•⌂•)╝");
                }

                catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            }

            int bok1 = dane[0];
            int bok2 = dane[1];
            int bok3 = dane[2];
            int bok4 = dane[3];
            int kat = dane[4];

            if ( ( bok1 == bok2 ) && ( bok2 == bok3 ) && ( bok3 == bok4 ) ){

                if (kat == 90){
                    try{
                        Figura kwadrat = new Kwadrat(bok1, bok2, bok3, bok4, kat);

                        kwadrat.dajNazwe();
                        System.out.println("Pole: " + kwadrat.obliczPole());
                        System.out.println("Obwod: " + kwadrat.obliczObwod());

                    }
                    catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }

                }

                else{

                    try{
                        Figura romb = new Romb(bok1, bok2, bok3, bok4, kat);

                        romb.dajNazwe();
                        System.out.println("Pole: " + romb.obliczPole());
                        System.out.println("Obwod: " + romb.obliczObwod());

                    }
                    catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                }    

            }
            else if ( ( bok1 == bok2 ) && ( bok3 == bok4 ) && (kat == 90) ){
                try{
                    Figura prostokat = new Prostokat(bok1, bok2, bok3, bok4, kat);

                    prostokat.dajNazwe();
                    System.out.println("Pole: " + prostokat.obliczPole());
                    System.out.println("Obwod: " + prostokat.obliczObwod());

                }
                catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            else System.out.println("Otrzymano bledne dane");

        }



        else if (iloscDanych == 0){
            int dana = 0;
            try{
                dana = Integer.parseInt(args[1]);
            }
            catch (NumberFormatException ex) {
                System.out.println(args[1]+" -> nieprawidlowa dana ╚(•⌂•)╝");
            }

            catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
            
            if (typ == 'o'){
                try {

                    Figura kolo = new Kolo(dana);

                    kolo.dajNazwe();
                    System.out.println("Pole: " + kolo.obliczPole()); 
                    System.out.println("Obwod: " + kolo.obliczObwod());
                }
                catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }

            }
            else if (typ == 'p'){
                try{

                    Figura pieciokat = new Pieciokat(dana);

                    pieciokat.dajNazwe();
                    System.out.println("Pole: " + pieciokat.obliczPole()); 
                    System.out.println("Obwod: " + pieciokat.obliczObwod());
                }
                catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            else if (typ == 's'){
                try {

                    Figura szesciokat = new Szesciokat(dana);

                    szesciokat.dajNazwe();
                    System.out.println("Pole: " + szesciokat.obliczPole()); 
                    System.out.println("Obwod: " + szesciokat.obliczObwod());
                }
                catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            else System.out.println("Otrzymano bledne dane");
        }
        else System.out.println("Otrzymano bledne dane");
    }
}

