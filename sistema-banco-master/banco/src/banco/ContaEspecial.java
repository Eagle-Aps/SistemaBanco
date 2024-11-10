
package banco;

public class ContaEspecial extends Conta {
    private Double taxaJuros;

    // Construtor
    public ContaEspecial(Integer numero, Double saldo, Double limite, Double taxaJuros) {
        super(numero, saldo, limite);
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJurosNoCredito() {
        aplicarJuros(taxaJuros);
    }

    // Getters e Setters
    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxa) {
        this.taxaJuros = taxa;
    }
}