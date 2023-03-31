public class zadanie3 {

    /* Zwraca najwiekszy wlasciwy dzieknik n */
    public static int div(int n){
        for(int i = n/2; i>=2; i-= 1){ //petla od n/2 do 2
            if (n%i == 0)
                return i;
        }
        return 1;
    }
    public static void main(String[] args){
        for (int i = 0; i<args.length; i++){

            /*Sprawdzanie czy liczba jest z zakresu int*/
            try { int n = Integer.parseInt(args[i]); }
            catch (NumberFormatException ex) {
                System.out.println(args[i]+" nie jest liczba calkowita z zakrsu int");
                continue;
            }
            /*Sprawdzanie czy liczba jest naturalna i dodatnia*/
            if (Integer.parseInt(args[i]) <= 0){
                System.out.println(args[i] + " to nie jest to liczba naturalna");
                continue;
            }

            /*Zwracanie dzielnika przy spelnieniu powyzszych warunkow */
            if ((Integer.parseInt(args[i])) == 1)
                System.out.print("1 nie posiada wlasciwego dzielnika\n");
            else{
            System.out.print(args[i] + " najwiekszy wlasciwy dzielnik to ");
            System.out.println(div(Integer.parseInt(args[i])));
            }
        }

    }   

}