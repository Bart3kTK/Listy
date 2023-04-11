#ifndef Figura_HPP
#define Figura_HPP
#include <iostream>
#include <cmath>
#include <ostream>



class Figura{
    public:
        virtual double obliczPole() = 0;
        virtual double obliczObwod() = 0;
        virtual void dajNazwe() = 0;
};

#endif
