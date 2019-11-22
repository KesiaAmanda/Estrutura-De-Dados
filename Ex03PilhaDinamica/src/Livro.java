
public class Livro {
	String nome;
	int ano;
	double pre�o;
	Livro anterior;
	
	public Livro(String nome, int ano, double pre�o) {
		this.nome = nome;
		this.ano = ano;
		this.pre�o = pre�o;
	}
	
	public Livro getAnterior() {
		return anterior;
	}
	
	public void setAnterior(Livro anterior) {
		this.anterior = anterior;
	}
	
	@Override
	public String toString() {
		return "Nome: "+nome+" Ano: "+ano+" Pre�o: "+pre�o;
	}
}
