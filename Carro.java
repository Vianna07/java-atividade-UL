package concessionaria;

public class Carro extends Veiculo {

	private int passageiros;
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	public Carro(int ano, String nome, String marca, String cor, float km, int passageiros) {
		super(ano, nome, marca, cor, km);
		this.passageiros = passageiros;
	
		
	}
	@Override
	public void exibirdetalhes() {
		// TODO Auto-generated method stub
		super.exibirdetalhes();
		System.out.println("Passageiros:" + passageiros );
	}

}
