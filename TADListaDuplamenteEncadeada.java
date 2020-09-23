package EstruturaHash;

public interface TADListaDuplamenteEncadeada<T> {
	
	//Métodos principais
	
	public void insereValor(T valor, T descricao);
	public T removeValor(T valor);
	
	//Métodos secundários
	
	public boolean listaVazia();
	public void imprimeLista();
	
	

}
