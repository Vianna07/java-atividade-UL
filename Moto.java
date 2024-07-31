package concessionaria;

public class Moto extends Veiculo{

	private int cilindrada;
	public Moto(int ano, String nome, String marca, String cor, float km, int cilindrada) {
		super(ano, nome, marca, cor, km);
		this.cilindrada = cilindrada;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	@Override
	public void exibirdetalhes() {
		// TODO Auto-generated method stub
		super.exibirdetalhes();
		System.out.println("Cilindrada:" + cilindrada + "Cc");
	}

	
}
