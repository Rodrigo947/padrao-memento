public class BoletoEstadoCriado extends BoletoEstado {

    private BoletoEstadoCriado() {}
    private static BoletoEstadoCriado instance = new BoletoEstadoCriado();
    public static BoletoEstadoCriado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Criado";
    }

    public boolean pagar(Boleto boleto) {
        boleto.setEstado(BoletoEstadoPago.getInstance());
        return true;
    }

    public boolean vencer(Boleto boleto) {
        boleto.setEstado(BoletoEstadoVencido.getInstance());
        return true;
    }

    public boolean cancelar(Boleto boleto) {
        boleto.setEstado(BoletoEstadoCancelado.getInstance());
        return true;
    }
}

