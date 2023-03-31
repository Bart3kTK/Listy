
public class Test {
    public static void main(String[] args){
        try{ int n = Integer.parseInt(args[0]);
            WierszTrojkataPascala wiersz = new WierszTrojkataPascala(n);

            for (int i = 1; i < args.length; i++){
                try
                {
                    System.out.println(args[i] + " -> " +wiersz.wspolczynnik(Integer.parseInt(args[i])));
                }
                catch (NumberFormatException ex) {
                    System.out.println(args[i]+" -> nieprawidlowa dana ╚(•⌂•)╝");
                }
                catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        catch (NumberFormatException ex) {
            System.out.println(args[0]+" -> nieprawidlowa dana ╚(•⌂•)╝");
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
