#include "Figura.hpp"
#include "Czworokat.hpp"
#include "Kwadrat.hpp"


double Kwadrat::obliczPole(){
    return dajBok1() * dajBok1();
}

void Kwadrat::dajNazwe(){
    std::cout << "Jestem kwadratem" << std::endl;
}




