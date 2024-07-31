package concessionaria;

public class Veiculo {

	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getKm() {
		
		return km;
		
	}
	public void setKm(float km) {
		this.km = km;
	}
	private int ano;
	public void exibirdetalhes() {
		System.out.println("Nome:" + nome);
		System.out.println("Marca:" + marca);
		System.out.println("Cor:" + cor);
		System.out.println("Ano:" + ano);
		System.out.println("Quilometragem:" + km + "km");
		
	}
	public Veiculo(int ano, String nome, String marca, String cor, float km) {
		super();
		this.ano = ano;
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.km = km;
	}
	private String nome;
	private String marca;
	private String cor; 
	private float km;
	
	
}
