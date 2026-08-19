public class objVehiculo {
    private string Marca;
    private string Tipo;
    private int Cilindraje;
    private int PagoAnterior;
    private int PagoActual;
    private int NumerodelaCelda;
    public objVehiculo(string marca, string tipo, int cilindraje, int pagoAnterior, int pagoActual,
            int numerodelaCelda) {
        Marca = marca;
        Tipo = tipo;
        Cilindraje = cilindraje;
        PagoAnterior = pagoAnterior;
        PagoActual = pagoActual;
        NumerodelaCelda = numerodelaCelda;
    }
    public string getMarca() {
        return Marca;
    }
    public void setMarca(string marca) {
        Marca = marca;
    }
    public string getTipo() {
        return Tipo;
    }
    public void setTipo(string tipo) {
        Tipo = tipo;
    }
    public int getCilindraje() {
        return Cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        Cilindraje = cilindraje;
    }
    public int getPagoAnterior() {
        return PagoAnterior;
    }
    public void setPagoAnterior(int pagoAnterior) {
        PagoAnterior = pagoAnterior;
    }
    public int getPagoActual() {
        return PagoActual;
    }
    public void setPagoActual(int pagoActual) {
        PagoActual = pagoActual;
    }
    public int getNumerodelaCelda() {
        return NumerodelaCelda;
    }
    public void setNumerodelaCelda(int numerodelaCelda) {
        NumerodelaCelda = numerodelaCelda;
    }
    public objVehiculo() {
    }

} 

