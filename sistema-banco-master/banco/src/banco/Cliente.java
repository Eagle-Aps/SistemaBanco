package banco;

public class Cliente {
	  private Integer numero;
    private String  nome;
    private String  cpf;

    //Construtor
    public Cliente(Integer numero, String nome, String cpf) {
    	this.numero = numero;
        this.nome = nome;
        this.cpf  = cpf;
    }

    //getters e setter
    public Integer getNumero() {
    	return numero;
    }

    public void setNumero(Integer numero) {
    	this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
