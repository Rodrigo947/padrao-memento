public class BoletoEstadoCancelado extends BoletoEstado {

    private BoletoEstadoCancelado() {}
    private static BoletoEstadoCancelado instance = new BoletoEstadoCancelado();
    public static BoletoEstadoCancelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelado";
    }

}
