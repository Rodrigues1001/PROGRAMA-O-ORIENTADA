import java.util.Random;

public class Jogo {

	private static final long serialVersionUID = 1L;
	private Time casa;
	private Time fora;
	private boolean aprovada;
	
	public Time getCasa() {
		return casa;
	}
	public void setCasa(Time casa) {
		this.casa = casa;
	}
	public Time getFora() {
		return fora;
	}
	public void setFora(Time fora) {
		this.fora = fora;
	}
		
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	public void marcarJogo(Time t0, Time t1) {
		if (t0 != t1) {
			this.aprovada = true;
			this.casa = t0;
			this.fora = t1;
		} else {
			this.aprovada = false;
			this.casa = null;
			this.fora = null;
		}
	}	
		public void jogar() {
			if (this.aprovada) {
				System.out.println("Jogando em casa:");
				this.casa.apresentar();
				System.out.println("------------------------------------------------------");
				System.out.println("Jogando fora:");
				this.fora.apresentar();
				System.out.println("------------------------------------------------------");
		
			Random aleatorio = new Random();
		int vencedor = aleatorio.nextInt(3);
		switch (vencedor) {
			case 0: 
				System.out.println("O jogo empatou!");
				casa.empatarJogo();
				fora.empatarJogo();
				break;
			case 1:  
				System.out.println(this.casa.getNome() + " foi o vencedor do jogo!");
				casa.ganharJogo();
				fora.perderJogo();
				break;
			case 2: 
				System.out.println("######### VENCEDOR DA PARTIDA #########");
				System.out.println(this.fora.getNome() + " foi o vencedor o jogo!");
				System.out.println("------------------------------------------------------");
				casa.perderJogo();
				fora.ganharJogo();
				break;
	}
	} else {
		System.out.println("Esse jogo não pode aconteecer!");
		}
	}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
}

