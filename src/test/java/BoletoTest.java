import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoletoTest {

    @Test
    void deveArmazenarEstados() {
        Boleto boleto = new Boleto();
        boleto.setEstado(BoletoEstadoCriado.getInstance());
        boleto.setEstado(BoletoEstadoPago.getInstance());
        assertEquals(2, boleto.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Boleto boleto = new Boleto();
        boleto.setEstado(BoletoEstadoCriado.getInstance());
        boleto.setEstado(BoletoEstadoPago.getInstance());
        boleto.restauraEstado(0);
        assertEquals(BoletoEstadoCriado.getInstance(), boleto.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Boleto boleto = new Boleto();
        boleto.setEstado(BoletoEstadoCriado.getInstance());
        boleto.setEstado(BoletoEstadoVencido.getInstance());
        boleto.setEstado(BoletoEstadoPago.getInstance());
        boleto.setEstado(BoletoEstadoCancelado.getInstance());
        boleto.restauraEstado(2);
        assertEquals(BoletoEstadoPago.getInstance(), boleto.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Boleto boleto = new Boleto();
            boleto.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}