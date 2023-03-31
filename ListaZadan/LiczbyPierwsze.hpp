#ifndef LiczbyPierwsze_HPP
#define LiczbyPierwsze_HPP

using namespace std;

class LiczbyPierwsze{
    private:
        std::vector<int> primes;
        vector<int> sito(int n);

    public:
        LiczbyPierwsze(int n);
        int getLiczba(int m);
};

#endif
