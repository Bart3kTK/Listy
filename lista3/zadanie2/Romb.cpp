#include "Figura.hpp"
#include "Czworokat.hpp"
#include "Romb.hpp"


double Romb::obliczPole(){
    return dajBok1() * dajBok1()* sin(dajKat());
}

void Romb::dajNazwe(){
    std::cout << "Jestem rombem" << std::endl;
}


