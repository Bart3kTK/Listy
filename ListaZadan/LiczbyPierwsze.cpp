#include "LiczbyPierwsze.hpp"
#include <vector>
#include <iostream>


using namespace std;

vector<int> pierwsze;

vector<int> LiczbyPierwsze::sito(int n){

    vector<int> czyPierwsza;
    for (int i = 0; i<=n; i++)
        czyPierwsza.push_back(true);

    czyPierwsza[0] = false;
    czyPierwsza[1] = false;

    vector<int> pierwsze;

    for (int i = 0; i<= n; i++){
        if (czyPierwsza[i] == true){
            pierwsze.push_back(i);
            for (int k = 2*i; k<=n; k+=i)
                czyPierwsza[k] = false;
        }
    }

    return pierwsze;

}

LiczbyPierwsze::LiczbyPierwsze(int n){
    pierwsze = sito(n);
};

         
int LiczbyPierwsze::getLiczba(int m){
    if (m>pierwsze.size())
        return 0;
    return pierwsze[m];
};


