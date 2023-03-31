#ifndef WierszTrojkataPascala_HPP
#define WierszTrojkataPascala_HPP
#include <vector>



class WierszTrojkataPascala{
    private:
        std::vector<int> lista;
        std::vector<int> wierszTrojkata(int n) noexcept(true);

    public:
        WierszTrojkataPascala(int n) noexcept(false);
        int wspolczynnik(int m) const noexcept(false);
};

#endif
