#include "Figura.hpp"
#include "Czworokat.hpp"
#include "Prostokat.hpp"

double Prostokat::obliczPole(){
    return dajBok1() * dajBok3();
}

void Prostokat::dajNazwe(){
    std::cout << "Jestem prostokatem" << std::endl;
}


