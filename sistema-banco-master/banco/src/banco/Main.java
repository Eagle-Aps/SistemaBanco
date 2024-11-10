package banco;

public class Main {
    public static void main(String[] args) {
        // Criação dos clientes
        Cliente cliente1 = new Cliente(1, "Pedro", "123.234.527-20");
        Cliente cliente2 = new Cliente(2, "Carla", "123.456.789-00");

        // Criação das contas
        Conta conta1 = new Conta(cliente1.getNumero(), 23580.75, 5000.00);
        ContaEspecial contaEspecial1 = new ContaEspecial(cliente2.getNumero(), 15800.00, 5002.00, 1.5);
        ContaEstudantil contaEstudantil1 = new ContaEstudantil(cliente1.getNumero(), 21110.00, 2000.00, 2.0, false);

        // Exibição dos dados das contas
        System.out.println("==== Dados de cliente 1 ===");
        System.out.println(" Número do Cliente:          " + cliente1.getNumero());
        System.out.println(" Nome do Cliente:            " + cliente1.getNome());
        System.out.println(" CPF do Cliente:             " + cliente1.getCpf());
        System.out.println();
        
        System.out.println("==== Dados de contas do cliente 1 ===");
        System.out.println(" Saldo da Conta normal:      R$" + conta1.getSaldo());
        System.out.println(" Limite da Conta Estudantil: R$" + contaEstudantil1.getLimite());
        System.out.println(" Saldo da Conta Estudantil:  R$" + contaEstudantil1.getSaldo());
        System.out.println();
        
        System.out.println("==== Dados de cliente 2 ===");
        System.out.println(" Número do Cliente:          " + cliente2.getNumero());
        System.out.println(" Nome do Cliente:            " + cliente2.getNome());
        System.out.println(" CPF do Cliente:             " + cliente2.getCpf());
        System.out.println();
        
        System.out.println("==== Dados de contas do cliente 2 ===");
        System.out.println(" Limite da Conta Especial: R$" + contaEspecial1.getLimite());
        System.out.println(" Saldo da Conta Especial:  R$" + contaEspecial1.getSaldo());
        System.out.println();

        // Realizando operações na Conta Especial
        System.out.println("==== Realizando operações na conta especial ===");
        contaEspecial1.fazerOperacao(conta1, 300.00, "debito");
        contaEspecial1.fazerOperacao(conta1, 1500.00, "credito");
        contaEspecial1.fazerOperacao(conta1, 2000.00, "transferir");
        System.out.println(" Saldo da Conta Especial após operações: R$" + contaEspecial1.getSaldo());
        System.out.println();
        
        // Aplicando juros na Conta Especial
        System.out.println("==== Aplicando juros a conta especial ===");
        contaEspecial1.aplicarJurosNoCredito();
        System.out.println(" Saldo da Conta Especial após aplicar juros: R$" + contaEspecial1.getSaldo());
        System.out.println();

        // Realizando operações na Conta Estudantil
        System.out.println("==== Realizando operações na conta estudantil ===");
        contaEstudantil1.fazerOperacao(conta1, 500.00, "debito");
        contaEstudantil1.fazerOperacao(conta1, 1000.00, "credito");
        contaEstudantil1.fazerOperacao(conta1, 1500.00, "transferir");
        System.out.println(" Saldo da Conta Estudantil após operações: R$" + contaEstudantil1.getSaldo());
        System.out.println();
        
        // Aplicando juros na Conta Estudantil
        System.out.println("==== Aplicando juros a conta estudantil ===");
        contaEstudantil1.aplicarJurosNoCredito();
        System.out.println(" Saldo da Conta Estudantil após aplicar juros: R$" + contaEstudantil1.getSaldo());
        System.out.println();
        
        // Sacando
        System.out.println("=== Sacando dinheiro das contas ===");
        conta1.fazerOperacao(conta1, 216.00, "sacar");
        contaEstudantil1.fazerOperacao(conta1, 525.00, "sacar");
        contaEspecial1.fazerOperacao(conta1, 314.00, "sacar");
        System.out.println();
        
        // Depositando
        System.out.println("=== Depositando dinheiro nas contas ===");
        conta1.fazerOperacao(conta1, 31.00, "depositar");
        contaEstudantil1.fazerOperacao(conta1, 45.00, "depositar");
        contaEspecial1.fazerOperacao(conta1, 92.00, "depositar");
        System.out.println();
        
        // Saldo final após todas as operações
        System.out.println("=== Saldo final de cada conta ===");
        System.out.println(" Saldo final conta normal do cliente 1:     R$" + conta1.getSaldo());
        System.out.println(" Saldo final conta estudantil do cliente 1: R$" + contaEstudantil1.getSaldo());
        System.out.println(" Saldo final conta especial do cliente 2:   R$" + contaEspecial1.getSaldo());
    }
}
