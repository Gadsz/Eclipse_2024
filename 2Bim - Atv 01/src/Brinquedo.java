
public class Brinquedo {
	// Atributos
	private String nome;
	private String faixaEtaria;
	private float preco;
	
	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
        if (faixaEtaria.equals("0 a 2") || faixaEtaria.equals("3 a 5") || 
                faixaEtaria.equals("6 a 10") || faixaEtaria.equals("acima de 10")) {
                this.faixaEtaria = faixaEtaria;
            } else {
                throw new IllegalArgumentException("Faixa etária inválida. Valores permitidos: '0 a 2', '3 a 5', '6 a 10', 'acima de 10'.");
            }
        }

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	// Construtor
	public Brinquedo(String nome, String faixaEtaria, float preco) {
		this.nome = nome;
		setFaixaEtaria(faixaEtaria);
		this.preco = preco;
	}
	
	public Brinquedo() {
	}
	
	public Brinquedo(String nome) {
		this.nome = nome;
	}
	
	public Brinquedo(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void mostrar() {
		System.out.println("Nome: " + nome);
		System.out.println("Faixa Etária: " + faixaEtaria);
		System.out.println("Preço: " + preco);
	}
}