#ifndef CZWOROKAT_HPP
#define CZWOROKAT_HPP



class Czworokat: public Figura{
    private:
    int bok1, bok2, bok3, bok4, kat;

    public:
    Czworokat(int &danyBok1, int &danyBok2, int &danyBok3, int &danyBok4, int &danyKat) noexcept(true):
    bok1(danyBok1), bok2(danyBok2), bok3(danyBok3), bok4(danyBok4), kat(danyKat) {} ;
        virtual double obliczObwod();
        int dajBok1();
        int dajBok2();
        int dajBok3();
        int dajBok4();
        double dajKat();
};

#endif
