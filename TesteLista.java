package EstruturaHash;

public class TesteLista {

	public static void main(String[] args) {
		
		TADListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<String>();
		
		lista.insereValor("Livro", "Objeto com folhas");
		lista.imprimeLista();
		
		lista.removeValor("Livro");
		lista.imprimeLista();
		
	}

}
