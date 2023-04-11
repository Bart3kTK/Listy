#ifndef SZESCIOKAT_HPP
#define SZESCIOKAT_HPP
#include "Figura.hpp"


class Szesciokat : public Figura{
    private:
        int bok;

    public:
        Szesciokat(int danyBok) : bok(danyBok) {};
        virtual double obliczPole();
        virtual double obliczObwod();
        virtual void dajNazwe();
};

#endif
