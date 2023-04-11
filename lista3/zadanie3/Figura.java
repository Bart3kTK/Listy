

public class Figura{

    public interface JedenParametr{
        double obliczPole(int dana);
        double obliczObwod(int dana);
        void dajNazwe();
    }

    public interface DwaParametry{
        double obliczPole(int bok1, int bok2);
        double obliczObwod(int bok1, int bok2); 
        void dajNazwe();
    }

    enum JedenParametrEnum implements JedenParametr{

        KOLO{
            public double obliczPole(int dana){
                if (dana <= 0) throw new IllegalArgumentException(dana + "-> Otrzymano zla dana");
                return dana * dana * Math.PI;
            }

            public double obliczObwod(int dana){
                if (dana <= 0) throw new IllegalArgumentException(dana + "-> Otrzymano zla dana");
                return 2 * Math.PI * dana;
            }
            public void dajNazwe(){
                System.out.println("Jestem kolem");
            }
        },
        KWADRAT{
            public double obliczPole(int dana){
                if (dana <= 0) throw new IllegalArgumentException(dana + "-> Otrzymano zla dana");
                return dana * dana;
            }

            public double obliczObwod(int dana){
                if (dana <= 0) throw new IllegalArgumentException(dana + "-> Otrzymano zla dana");
                return 4 * dana;
            }
            public void dajNazwe(){
                System.out.println("Jestem kwadratem");
            }
        },
        PIECIOKAT{
            public double obliczPole(int dana){
                if (dana <= 0) throw new IllegalArgumentException(dana + "-> Otrzymano zla dana");
                return 5.0 / 4 * dana * dana * Math.sqrt(3.0);
            }

            public double obliczObwod(int dana){
                if (dana <= 0) throw new IllegalArgumentException(dana + "-> Otrzymano zla dana");
                return 5*dana;
            }
            public void dajNazwe(){
                System.out.println("Jestem pieciokatem");
            }
        },
        SZESCIOKAT{
            public double obliczPole(int dana){
                if (dana <= 0) throw new IllegalArgumentException(dana + "-> Otrzymano zla dana");
                return 3.0 / 2 * dana * dana * Math.sqrt(3.0);
            }

            public double obliczObwod(int dana){
                if (dana <= 0) throw new IllegalArgumentException(dana + "-> Otrzymano zla dana");
                return 5*dana;
            }
            public void dajNazwe(){
                System.out.println("Jestem szesciokatem");
            }
        };
    }
    enum DwaParametryEnum implements DwaParametry{

        PROSTOKAT{

            public double obliczPole(int dana1, int dana2){
                if (dana1 <= 0 || dana2 <= 0) throw new IllegalArgumentException(dana1 + " / " + dana2 + "-> Otrzymano zle dane");
                return dana1 * dana2;
            }
    
            public double obliczObwod(int dana1, int dana2){
                if (dana1 <= 0 || dana2 <= 0) throw new IllegalArgumentException(dana1 + " / " + dana2 + "-> Otrzymano zle dane");
                return 2*dana1 + 2*dana2;
            }
            public void dajNazwe(){
                System.out.println("Jestem prostokatem");
            }
        },
        ROMB{

            public double obliczPole(int dana1, int dana2){
                if (dana1 <= 0 || dana2 <= 0) throw new IllegalArgumentException(dana1 + " / " + dana2 + "-> Otrzymano zle dane");
                return dana1 * dana1 * Math.sin(Math.toRadians(dana2));
            }
    
            public double obliczObwod(int dana1, int dana2){
                if (dana1 <= 0 || dana2 <= 0) throw new IllegalArgumentException(dana1 + " / " + dana2 + "-> Otrzymano zle dane");
                return 4* dana1;
            }
            public void dajNazwe(){
                System.out.println("Jestem rombem");
            }
        }


    }
}
