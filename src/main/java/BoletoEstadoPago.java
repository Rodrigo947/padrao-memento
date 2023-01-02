public class BoletoEstadoPago extends BoletoEstado {

    private BoletoEstadoPago() {}
    private static BoletoEstadoPago instance = new BoletoEstadoPago();
    public static BoletoEstadoPago getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pago";
    }


}
