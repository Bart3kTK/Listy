#include "Figura.hpp"
#include "Kolo.hpp"
#include <cmath>

double Kolo::obliczPole(){
    if (promien <= 0) 
        throw std::invalid_argument(std::to_string(promien) + std::string("-> Otrzymano niedodatni promien"));
    return promien * promien * M_PI ;
}

double Kolo::obliczObwod(){
    if (promien <= 0) 
        throw std::invalid_argument(std::to_string(promien) + std::string("-> Otrzymano niedodatni promien"));
    return 2 * promien * M_PI;
}

void Kolo::dajNazwe(){
    std::cout << "Jestem kolem" << std::endl;
}