public abstract class BoletoEstado {
    
    public abstract String getEstado();

    public boolean criar(Boleto boleto) {
        return false;
    }

    public boolean pagar(Boleto boleto) {
        return false;
    }

    public boolean vencer(Boleto boleto) {
        return false;
    }

    public boolean cancelar(Boleto boleto) {
        return false;
    }
}
