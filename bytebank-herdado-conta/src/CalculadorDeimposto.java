public class CalculadorDeimposto {
    
    private double totalImposto;

    public void registra(Tributavel t) { // Todos que implementaram a interface Tributavel podem ser utilizados, por meio deste método.
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
