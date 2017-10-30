package pt.arvorerecusiva;

public class ArvoreBinaria {

	private No raiz;

	public void inserir(int valor) {
		// SE ELA TIVER VAZIA, CRIA UM NOVO NÓ
		if (raiz == null) {
			raiz = new No(valor);
		} else {
			No novo = new No(valor);
			inserir(raiz, novo);
		}
	}

	private void inserir(No arvore, No novo) {
		if (novo.valor > arvore.valor) {
			if (arvore.direito == null) {
				arvore.direito = novo;
			} else {
				inserir(arvore.direito, novo);
			}
		} else {
			if (arvore.esquerdo == null) {
				arvore.esquerdo = novo;
			} else {
				inserir(arvore.esquerdo, novo);
			}
		}
	}

	public boolean procurar(int valor) {
		return procurar(raiz, valor);
	}

	private boolean procurar(No arvore, int valor) {
		if (arvore == null)
			return false;
		if (valor == arvore.valor)
			return true;
		if (valor > arvore.valor) {
			return procurar(arvore.direito, valor);
		} else {
			return procurar(arvore.esquerdo, valor);
		}

	}

	public void imprimirEmOrdem() {
		emOrdem(raiz);
	}

	// E-R-D
	private void emOrdem(No arvore) {
		// Parada do Recursivo
		if (arvore == null)	return;
		emOrdem(arvore.esquerdo);
		System.out.println(arvore.valor);
		emOrdem(arvore.direito);
	}

	public void imprimirPreOrdem(No arvore) {
		preOrdem(raiz);
	}

	// R-E-D
	private void preOrdem(No arvore) {
		// Parada do Recursivo
		if (arvore == null)
			return;
		System.out.println(arvore.valor);
		preOrdem(arvore.esquerdo);
		preOrdem(arvore.direito);
	}

	public void imprimirPosOrdem() {
		posOrdem(raiz);
	}

	// E-D-R
	private void posOrdem(No arvore) {
		// Parada do Recursivo
		if (arvore == null)
			return;
		posOrdem(arvore.esquerdo);
		posOrdem(arvore.direito);
		System.out.println(arvore.valor);
	}

    public int soma() {
        return raiz == null ? 0 : raiz.soma();
    }
	
    @Override
    public String toString() {
        return raiz == null ? "*" : raiz.toString();
    }
}
