#include "Figura.hpp"
#include "Szesciokat.hpp"
#include <cmath>



double Szesciokat::obliczPole(){
    if (bok <= 0) 
        throw std::invalid_argument(std::to_string(bok) + std::string("-> Otrzymano niedodatni promien"));
    return (3/2.0) * bok * bok * sqrt(3.0);
}

double Szesciokat::obliczObwod(){
    if (bok <= 0) 
        throw std::invalid_argument(std::to_string(bok) + std::string("-> Otrzymano niedodatni bok"));
    return 6*bok;
}

void Szesciokat::dajNazwe(){
    std::cout << "Jestem szesciokatem" << std::endl;
}