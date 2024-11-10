package banco;

public class Conta {
    private Integer numero;
    private Double  limite;
    private Double  saldo;

    // Construtor
    public Conta(Integer numero, Double saldoConta, Double limiteConta) {
        this.numero = numero;
        this.limite = limiteConta;
        this.saldo  = saldoConta;
    }

    // Operações bancárias
    public void debitar(Double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Débito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de débito inválido ou saldo insuficiente.");
        }
    }

    public void creditar(Double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Crédito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de crédito inválido.");
        }
    }

    public void transferir(Conta contaDestino, Double valor) {
        if (valor > 0 && valor <= saldo) {
            this.debitar(valor);
            contaDestino.creditar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Transferência inválida: saldo insuficiente ou valor negativo.");
        }
    }

    public void depositar(Double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(Double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    public void aplicarJuros(Double taxaJuros) {
        if (taxaJuros > 0) {
            Double juros = saldo * (taxaJuros / 100);
            saldo += juros;
            System.out.println("Juros de R$" + juros + " aplicados.");
        } else {
            System.out.println("Taxa de juros inválida.");
        }
    }

    public void fazerOperacao(Conta contaDestino, Double valor, String tipoOperacao) {
        if (valor > limite) {
            System.out.println("Valor de operação excede o limite.");
            return;
        }

        switch (tipoOperacao.toLowerCase()) {
            case "debito":
                debitar(valor);
                break;
            case "credito":
                creditar(valor);
                break;
            case "transferir":
                transferir(contaDestino, valor);
                break;
            case "sacar":
                sacar(valor);
                break;
            case "depositar":
                depositar(valor);
                break;
            default:
                System.out.println("Tipo de operação inválido.");
        }
    }

    // Getters e Setters
    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limiteConta) {
        this.limite = limiteConta;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldoConta) {
        this.saldo = saldoConta;
    }
}
