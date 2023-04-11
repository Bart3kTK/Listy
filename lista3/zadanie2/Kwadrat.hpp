#ifndef KWADRAT_HPP
#define KWADRAT_HPP
#include "Figura.hpp"
#include "Czworokat.hpp"


class Kwadrat: public Czworokat{

    public:
        Kwadrat(int bok1, int bok2, int bok3, int bok4, int kat): 
        Czworokat(bok1, bok2, bok3, bok4, kat) {};
        virtual double obliczPole();
        virtual void dajNazwe();
};

#endif
