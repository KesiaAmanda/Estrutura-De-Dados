
public class Livro {
	String nome;
	int ano;
	double pre�o;
	
	public Livro(String nome, int ano, double pre�o) {
		this.nome = nome;
		this.ano = ano;
		this.pre�o = pre�o;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAno() {
		return ano;
	}
	
	public double getPre�o() {
		return pre�o;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
		
	@Override
	public String toString() {
		return "Nome: "+nome+" Ano: "+ano+" Pre�o: "+pre�o;
	}
}
