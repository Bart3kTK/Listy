public class Test {
    public static void main(String[] args){
        boolean start = false;
        LiczbyPierwsze liczba = new LiczbyPierwsze(2);

        for (int i = 0; i<args.length; i++){

            /*Sprawdzanie czy liczba jest z zakresu int*/
            try { int n = Integer.parseInt(args[i]); }
            catch (NumberFormatException ex) {
                System.out.println(args[i]+"- nieprawidlowa dana");
                continue;
            }

            
            
            if (i == 0){

                if (Integer.parseInt(args[0]) < 2){
                    System.out.println("Liczby pierwsze zaczynaja sie od 2");
                    break;   
                }
                if (Integer.parseInt(args[0]) > 20000000){
                    System.out.println("Baaaardzo duza liczba (ಠ_ಠ) ");
                    break;   
                }
                liczba = new LiczbyPierwsze(Integer.parseInt(args[0]));
                start = true;
                continue;
                
            }
                /*Sprawdzanie czy liczba jest naturalna*/
            if (Integer.parseInt(args[i]) < 0){
                System.out.println(args[i] + " jest to ujemna liczba");
                continue;
            }
            if (start == false) break;
            else System.out.println(args[i] + " - " + liczba.getLiczba(Integer.parseInt(args[i])));
                
            
        }

    
    }
}
