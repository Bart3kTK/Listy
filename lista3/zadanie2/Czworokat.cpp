#include "Figura.hpp"
#include "Czworokat.hpp"



double Czworokat::obliczObwod noexcept(true)(){
    return  dajBok1() + dajBok2() + dajBok3() + dajBok4();
}

int Czworokat::dajBok1() noexcept(false){
        if (bok1 <= 0) 
        throw std::invalid_argument(std::to_string(bok1) + std::string("-> Otrzymano niedodatni bok"));
    return bok1;
}

int Czworokat::dajBok2() noexcept(false){
        if (bok2 <= 0) 
        throw std::invalid_argument(std::to_string(bok2) + std::string("-> Otrzymano niedodatni bok"));
    return bok2;
}

int Czworokat::dajBok3() noexcept(false){
        if (bok3 <= 0) 
        throw std::invalid_argument(std::to_string(bok3) + std::string("-> Otrzymano niedodatni bok"));
    return bok3;
}

int Czworokat::dajBok4() noexcept(false){
        if (bok4 <= 0) 
        throw std::invalid_argument(std::to_string(bok4) + std::string("-> Otrzymano niedodatni bok"));
    return bok4;
}

double Czworokat::dajKat() noexcept(false){
        if (kat <= 0) 
        throw std::invalid_argument(std::to_string(kat) + std::string("-> Otrzymano niedodatni kat"));
    return (kat/180.0) * M_PI;
}
