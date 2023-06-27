package Clases;

class Adyacente {
    int destino;
    double peso;
    Adyacente(int codAdy, double p){ destino=codAdy; peso = p; }
    public String toString(){ return destino + "(”+ peso + “)"; }
}
