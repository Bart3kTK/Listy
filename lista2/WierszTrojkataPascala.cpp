#include "WierszTrojkataPascala.hpp"
#include <vector>
#include <string>
#include <iostream>
#include <cmath>

std::vector<int> lista;

WierszTrojkataPascala::WierszTrojkataPascala(int n) noexcept(false)
{
    if ( n < 0) throw std::invalid_argument(std::to_string(n) + std::string("-> nr wiersza musi byc dodatnia"));
    if ( n > 33) throw std::invalid_argument(std::to_string(n) + std::string("-> nr wiersza musi byc rowny 33 lub mniejszy"));

    lista = wierszTrojkata(n);
}

std::vector<int> WierszTrojkataPascala::wierszTrojkata(int n) noexcept(true){

    std::vector<int> wiersz;
    wiersz.push_back(1);

    for (int i = 1; i <= n; i++)
        {
        double kolejny = ((n - i + 1) *(wiersz.at(i-1)/(double)i));
        wiersz.push_back( (int) ceil(kolejny));
        
        }
    return wiersz;
}

int WierszTrojkataPascala::wspolczynnik(int m) const noexcept(false){
    if (m < 0) throw std::invalid_argument(std::to_string(m) + std::string("-> id wiersza zaczyna sie od 0"));
    if (m >= lista.size() ) throw std::invalid_argument(std::to_string(m) + std::string("-> wspolczynniki koncza sie na ")+std::to_string(lista.size()-1));

    return lista.at(m);
}
