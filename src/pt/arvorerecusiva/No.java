package pt.arvorerecusiva;

public class No {
	
	public int valor;
	public No direito;
	public No esquerdo;
	
	public No(int valor) {
		this.valor = valor;
	}
	
	public int soma() {
        return valor
                + (direito == null ? 0 : direito.soma())
                + (esquerdo == null ? 0 : esquerdo.soma());
    }

    @Override
    public String toString() {
        return (esquerdo == null ? "*" : "(" + esquerdo + ")")
                + valor
                + (direito == null ? "*" : "(" + direito + ")");
    }
}

