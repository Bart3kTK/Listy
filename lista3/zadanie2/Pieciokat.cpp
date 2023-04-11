#include "Figura.hpp"
#include "Pieciokat.hpp"
#include <cmath>


double Pieciokat::obliczPole(){
    if (bok <= 0) 
        throw std::invalid_argument(std::to_string(bok)+ std::string("-> Otrzymano niedodatni bok"));
    return (5/4.0) * bok * bok * sqrt(3.0);
}

double Pieciokat::obliczObwod(){
    if (bok <= 0) 
        throw std::invalid_argument(std::to_string(bok) + std::string("-> Otrzymano niedodatni bok"));
    return 5*bok;
}

void Pieciokat::dajNazwe(){
    std::cout << "Jestem pieciokatem" << std::endl;
}