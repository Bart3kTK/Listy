#include "WierszTrojkataPascala.hpp"
#include <vector>
#include <iostream>


int main(int argc, char* argv[]){
    // WierszTrojkataPascala* liczba;
    if (argc < 3){

        std::cout << argc <<" -> Niewystarcajaca ilosc argumentow  !!! ╚(•⌂•)╝\n";
        return 0;
    }
    try
    {
        int n = std::stoi(argv[1]);
        // WierszTrojkataPascala* liczba = new WierszTrojkataPascala(n);
        // WierszTrojkataPascala liczba(n);
        std::unique_ptr<WierszTrojkataPascala> liczba = std::make_unique(n);

        for (int i = 2; i<argc ; i++)
        {
            try
            {
                int k = std::stoi(argv[i]);

                if (std::to_string(std::stoi(argv[i])) != argv[i]){
                    std::cout << argv[i] << " -> nieprawidlowa dana :c (to nie int z zakresu 0-n) \n";
                    continue;
                }
                std::cout << k << " -> " << liczba.wspolczynnik(k) << std::endl;
            }
            catch(const std::invalid_argument& ex1)
            {
                if (std::string(ex1.what()) == "stoi")
                    std::cout << argv[i] << " -> bledna dana :c (to nie int z zakresu 0-n)" << std::endl;  
                else 
                    std::cout << ex1.what() << std::endl;
                
            }
            
        }
    }
    catch (const std::invalid_argument& ex)
    {
        if (std::string(ex.what()) == "stoi")
            std::cout << argv[1] << " -> bledna dana :c (to nie int z zakresu 0-32)" << std::endl;  
        else 
            std::cout << ex.what() << std::endl;
        return 0;
    }
}