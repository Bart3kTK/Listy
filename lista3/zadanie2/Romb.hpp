#ifndef Romb_HPP
#define Romb_HPP
#include "Figura.hpp"
#include "Czworokat.hpp"



class Romb: public Czworokat{

    public:
        Romb(int bok1, int bok2, int bok3, int bok4, int kat): 
        Czworokat(bok1, bok2, bok3, bok4, kat) {};
        virtual double obliczPole();
        virtual void dajNazwe();
};

#endif
