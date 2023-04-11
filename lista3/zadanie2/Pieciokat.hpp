#ifndef PIECIOKAT_HPP
#define PIECIOKAT_HPP
#include "Figura.hpp"


class Pieciokat : public Figura{
    private:
        int bok;

    public:
        Pieciokat(int danyBok) : bok(danyBok) {};
        virtual double obliczPole();
        virtual double obliczObwod();
        virtual void dajNazwe();
};

#endif
