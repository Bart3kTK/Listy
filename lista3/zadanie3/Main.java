
public class Main {
    public static void main(String[] args){
        
        int iloscDanych = args.length - 1;
        char typ = args[0].charAt(0);

        if (iloscDanych == 2){
            int dana1 = 0;
            int dana2 = 0;
            int i = 1;
            try{
                dana1 = Integer.parseInt(args[i]);
                i++;
                dana2 = Integer.parseInt(args[i]);
            }

            catch (NumberFormatException ex) {
                System.out.println(args[i]+" -> nieprawidlowa dana ╚(•⌂•)╝");
            }

            catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            if ( typ == 'p' ){

                try{
                Figura.DwaParametryEnum prostokat = Figura.DwaParametryEnum.PROSTOKAT;
                prostokat.dajNazwe();
                System.out.println("Pole: " + prostokat.obliczPole(dana1, dana2));
                System.out.println("Obwod: " + prostokat.obliczObwod(dana1, dana2));

                }
                catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }

            }

            else if ( typ == 'r' ){
                try{
                Figura.DwaParametryEnum romb = Figura.DwaParametryEnum.ROMB;
                romb.dajNazwe();
                System.out.println("Pole: " + romb.obliczPole(dana1, dana2));
                    System.out.println("Obwod: " + romb.obliczObwod(dana1, dana2));
    
                }
                catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
    
            }
            else System.out.println("Otrzymano bledne dane");
        }
        else if (iloscDanych == 1){
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

                    Figura.JedenParametrEnum kolo = Figura.JedenParametrEnum.KOLO;

                    kolo.dajNazwe();
                    System.out.println("Pole: " + kolo.obliczPole(dana)); 
                    System.out.println("Obwod: " + kolo.obliczObwod(dana));
                }

                catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            else if (typ == 'p'){
                try{

                    Figura.JedenParametrEnum pieciokat = Figura.JedenParametrEnum.PIECIOKAT;

                    pieciokat.dajNazwe();
                    System.out.println("Pole: " + pieciokat.obliczPole(dana)); 
                    System.out.println("Obwod: " + pieciokat.obliczObwod(dana));
                }
                catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            else if (typ == 's'){
                try {

                    Figura.JedenParametrEnum szesciokat = Figura.JedenParametrEnum.SZESCIOKAT;

                    szesciokat.dajNazwe();
                    System.out.println("Pole: " + szesciokat.obliczPole(dana)); 
                    System.out.println("Obwod: " + szesciokat.obliczObwod(dana));
                }
                catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            else if (typ == 'k'){
                try {

                    Figura.JedenParametrEnum kwadrat = Figura.JedenParametrEnum.KWADRAT;

                    kwadrat.dajNazwe();
                    System.out.println("Pole: " + kwadrat.obliczPole(dana)); 
                    System.out.println("Obwod: " + kwadrat.obliczObwod(dana));
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

