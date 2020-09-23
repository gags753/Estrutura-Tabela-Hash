package EstruturaHash;

public interface TADListaDuplamenteEncadeada<T> {
	
	//M�todos principais
	
	public void insereValor(T valor, T descricao);
	public T removeValor(T valor);
	
	//M�todos secund�rios
	
	public boolean listaVazia();
	public void imprimeLista();
	
	

}
