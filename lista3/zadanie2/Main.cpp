#include "Figura.hpp"
#include "Czworokat.hpp"
#include "Kolo.hpp"
#include "Szesciokat.hpp"
#include "Pieciokat.hpp"
#include "Kwadrat.hpp"
#include "Prostokat.hpp"
#include "Romb.hpp"
#include <iostream>

int main(int argc, char const *argv[])
{
    if (argc < 2){

        std::cout << argc <<" -> Niewystarcajaca ilosc argumentow  !!! ╚(•⌂•)╝\n";
        return 0;
    }

    int iloscDanych = argc-3;
    std::string typ = std::string(argv[1]);

    if (iloscDanych == 4 && typ == "c"){
        int bok1, bok2, bok3, bok4, kat = 0;
        int i = 2;
        try{
            bok1 = std::stoi(argv[i]); i++;
            bok2 = std::stoi(argv[i]); i++;
            bok3 = std::stoi(argv[i]); i++;
            bok4 = std::stoi(argv[i]); i++;
            kat = std::stoi(argv[i]);
        }
        catch(const std::invalid_argument& ex1)
        {
            if (std::string(ex1.what()) == "stoi")
                std::cout << argv[i] << " -> bledna dana" << std::endl;  
            else 
                std::cout << ex1.what() << std::endl;            
        }

        if ( ( bok1 == bok2 ) && ( bok2 == bok3 ) && ( bok3 == bok4 ) ){

            if (kat == 90){
                try{
                    Kwadrat k(bok1, bok2, bok3, bok4, kat);

                    k.dajNazwe();
                    std::cout << "Pole: " << k.obliczPole() << std::endl;
                    std::cout << "Obwod: " << k.obliczObwod() << std::endl;
                }
                catch(const std::invalid_argument& ex1)
                {
                    std::cout << ex1.what() << std::endl;            
                }
            }

            else{
                try{
                    Romb k(bok1, bok2, bok3, bok4, kat);

                    k.dajNazwe();
                    std::cout << "Pole: " << k.obliczPole() << std::endl;
                    std::cout << "Obwod: " << k.obliczObwod() << std::endl;
                }
                catch(const std::invalid_argument& ex1)
                {
                    std::cout << ex1.what() << std::endl;            
                }
            }
        }
        else if ( ( bok1 == bok2 ) && ( bok3 == bok4 ) && (kat == 90) ){
            try{
                Prostokat k(bok1, bok2, bok3, bok4, kat);
                k.dajNazwe();
                std::cout << "Pole: " << k.obliczPole() << std::endl;
                std::cout << "Obwod: " << k.obliczObwod() << std::endl;
            }
            catch(const std::invalid_argument& ex1)
            {
                std::cout << ex1.what() << std::endl;            
            }
        }
        else std::cout << "Otrzymano bledne dane" << std::endl;
    }
    else if (iloscDanych == 0){
        int dana = 0;
        try{
            dana = std::stoi(argv[2]);
        }
        catch(const std::invalid_argument& ex1)
        {
            if (std::string(ex1.what()) == "stoi")
                std::cout << argv[2] << " -> bledna dana" << std::endl;  
            else 
                std::cout << ex1.what() << std::endl;            
        }

        if (typ == "o"){
            try{
                Kolo k(dana);
                k.dajNazwe();
                std::cout << "Pole: " << k.obliczPole() << std::endl;
                std::cout << "Obwod: " << k.obliczObwod() << std::endl;
            }
            catch(const std::invalid_argument& ex1)
            {
                std::cout << ex1.what() << std::endl;            
            }
        }

        else if (typ == "p"){
            try{
                Pieciokat k(dana);
                k.dajNazwe();
                std::cout << "Pole: " << k.obliczPole() << std::endl;
                std::cout << "Obwod: " << k.obliczObwod() << std::endl;
            }
            catch(const std::invalid_argument& ex1)
            {
                std::cout << ex1.what() << std::endl;            
            }
        }

        else if (typ == "s"){
            try{
                Szesciokat k(dana);
                k.dajNazwe();
                std::cout << "Pole: " << k.obliczPole() << std::endl;
                std::cout << "Obwod: " << k.obliczObwod() << std::endl;
            }
            catch(const std::invalid_argument& ex1)
            {
                std::cout << ex1.what() << std::endl;            
            }
        }
        else std::cout << "Otrzymano bledne dane" << std::endl;
    }
    else std::cout << "Otrzymano bledne dane" << std::endl;

}
