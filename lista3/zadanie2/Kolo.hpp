#ifndef KOLO_HPP
#define KOLO_HPP
#include "Figura.hpp"
#include <cmath>

class Kolo : public Figura{
    private:
        int promien;

    public:
    
        Kolo(int danyPromien) : promien(danyPromien) {};
        virtual double obliczPole();
        virtual double obliczObwod();
        virtual void dajNazwe();
};

#endif
