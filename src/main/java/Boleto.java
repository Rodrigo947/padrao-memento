import java.util.ArrayList;
import java.util.List;

public class Boleto {
    
    private float valor;
    private BoletoEstado estado;
    private List<BoletoEstado> memento = new ArrayList<>();

    public Boleto() {
        this.estado = BoletoEstadoCriado.getInstance();
    }

    public void setEstado(BoletoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }
    
    public boolean criar() {
        return estado.criar(this);
    }
    
    public boolean pagar() {
        return estado.pagar(this);
    }
    
    public boolean vencer() {
        return estado.vencer(this);
    }
    
    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public BoletoEstado getEstado() {
        return estado;
    }
    public List<BoletoEstado> getEstados() {
        return this.memento;
    }
}
