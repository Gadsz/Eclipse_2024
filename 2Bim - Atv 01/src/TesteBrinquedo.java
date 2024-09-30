public class TesteBrinquedo {
	public static void main(String[] args) {
		try {
			// Testando o construtor de nome, faixa etária e preço
			Brinquedo brinquedo1 = new Brinquedo("Carrinho", "3 a 5", 25.50f);
			brinquedo1.mostrar();

			// Testando set de faixa etária inválida
			Brinquedo brinquedo2 = new Brinquedo("Boneca", 30.00f);
			brinquedo2.setFaixaEtaria("10 a 15");
			brinquedo2.mostrar();

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		// Testando construtor somente nome e preço
		Brinquedo brinquedo3 = new Brinquedo("Avião", 45.00f);
		brinquedo3.setFaixaEtaria("3 a 5");
		brinquedo3.mostrar();
		
		// Testando construtor somente nome
		Brinquedo brinquedo4 = new Brinquedo("Pipa");
		brinquedo4.mostrar();
		
		// Testando construtor vazio
		Brinquedo brinquedo5 = new Brinquedo();
		brinquedo5.setNome("Quebra-Cabeça");
		brinquedo5.setFaixaEtaria("3 a 5");
		brinquedo5.setPreco(15.00f);
		brinquedo5.mostrar();
	}
}