#include "LiczbyPierwsze.hpp"
#include <vector>
#include <iostream>


using namespace std;

int main(int argc, char* argv[]){
    bool start = false;
    LiczbyPierwsze* liczba;
    int n;
    if (argc < 3)
        cout << "Niewystarcajaca ilosc argumentow" << endl;
    else {
        for (int i = 1; i<argc; i++){
            
            try {int n = stoi(argv[i]);}
            catch(out_of_range a){ 
                cout << argv[i];
                cout << " - nieprawidlowa dana\n";
                continue;
            } 
            catch(invalid_argument a){
                cout << argv[i];
                cout << " - nieprawidlowa dana\n";
                continue;
            }
            if (to_string(stoi(argv[i])) != argv[i]){
                cout << argv[i];
                cout << " - nieprawidlowa dana\n";
                continue;
            }

            if (stoi(argv[i]) < 0){
                cout << argv[i];
                cout << " - nieprawidlowa dana\n";
                continue;
            }
            int n = stoi(argv[i]);
            if (i == 1){
                if (stoi(argv[i]) < 2){
                    cout << "Liczby pierwsze zaczynaja sie od 2\n"; 
                    break;
                }
                if (stoi(argv[i]) > 30000000){
                    cout << "Bardzo duza wartosc (ಠ_ಠ)\n"; 
                    break;
                }
                liczba = new LiczbyPierwsze(n);
                start = true;
                continue;
            }
            if (start == false) break;
            if (liczba->getLiczba(n) == 0){
                cout << n; 
                cout << " - zly zakres\n";
            }
            else {
                cout << n;
                cout << " - ";
                cout << liczba->getLiczba(n) << endl;
                }
                
        }   
    }

}