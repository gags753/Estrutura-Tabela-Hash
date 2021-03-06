package EstruturaHash;


public class ListaDuplamenteEncadeada<T> implements TADListaDuplamenteEncadeada<T> {
	
	private No<T> header;
	private No<T> trailer;
	private int tamanho;
	
	public ListaDuplamenteEncadeada() {
		header  = new No(null, null, null, null);
		trailer = new No(header, null, null, null);
		
		header.setProximo(trailer);
		tamanho = 0;
	}

	@Override
	public void insereValor(T valor, T descricao) {
		
		No<T> novoNo = new No<T>(null, valor, descricao, null);
		
		trailer.getAnterior().setProximo(novoNo);
		novoNo.setAnterior(trailer.getAnterior());
		novoNo.setProximo(trailer);
		trailer.setAnterior(novoNo);
		
		tamanho ++;
	}

	@Override
	public T removeValor(T valor) {
		
		if(listaVazia()) {
			System.out.println("Lista vazia");
			return null;
		}
		
		No<T> noRemovido;
		No<T> noAuxiliar = header;
		
		for (int i = 0; i < tamanho; i ++) {
			noAuxiliar = noAuxiliar.getProximo();
			if(noAuxiliar.getValor() == valor) {
				break;
			}
		}
		
		noAuxiliar.getAnterior().setProximo(noAuxiliar.getProximo());
		noAuxiliar.getProximo().setAnterior(noAuxiliar.getAnterior());
		noAuxiliar.setAnterior(null);
		noAuxiliar.setProximo(null);
		
		noRemovido = noAuxiliar;
		
		tamanho --;
		
		
		return noRemovido.getValor();
	}

	@Override
	public boolean listaVazia() {
		if(header.getProximo().equals(trailer)) {
			return true;
		}
		return false;
	}

	@Override
	public void imprimeLista() {
		
		if (listaVazia()) {
			System.out.println("lista j� vazia");
			return;
		}
		
		No<T> auxiliar = header;
		while (auxiliar != null) {
			System.out.println(auxiliar.getValor() + ": " +  auxiliar.getDescricao());
			auxiliar = auxiliar.getProximo();
		}
		
		System.out.println();
		
		
	}

}
