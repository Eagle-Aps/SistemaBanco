package banco;

public class ContaEstudantil extends Conta {
    private Double  taxaJuros;
    private Boolean isTaxaIsenta;

    // Construtor
    public ContaEstudantil(Integer numero, Double saldo, Double limite, Double taxaJuros, Boolean isTaxaIsenta) {
        super(numero, saldo, limite);
        this.taxaJuros = taxaJuros;
        this.isTaxaIsenta = isTaxaIsenta;
    }

    public void aplicarJurosNoCredito() {
        if (!isTaxaIsenta) {
            aplicarJuros(taxaJuros);
        }
    }

    // Getters e Setters
    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxa) {
        this.taxaJuros = taxa;
    }

    public Boolean getIsTaxaIsenta() {
        return isTaxaIsenta;
    }

    public void setIsTaxaIsenta(Boolean isTaxaIsenta) {
        this.isTaxaIsenta = isTaxaIsenta;
    }
}
