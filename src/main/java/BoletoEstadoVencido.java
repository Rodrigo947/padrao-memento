public class BoletoEstadoVencido extends BoletoEstado {

    private BoletoEstadoVencido() {}
    private static BoletoEstadoVencido instance = new BoletoEstadoVencido();
    public static BoletoEstadoVencido getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Pago";
    }
    public boolean pagar(Boleto boleto) {
        boleto.setEstado(BoletoEstadoPago.getInstance());
        return true;
    }

    public boolean cancelar(Boleto boleto) {
        boleto.setEstado(BoletoEstadoCancelado.getInstance());
        return true;
    }

}
