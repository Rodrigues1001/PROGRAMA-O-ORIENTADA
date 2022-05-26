
public  class Time {
	private String nome;
	private int vitorias;
	private int derrotas;
	protected int empates;
	public String serie;
	
	
	private static final long serialVersionUID = 1L;
	
	public void apresentar() {;
		System.out.println(this.getNome() + ".");
		System.out.println("Com: " + this.getVitorias() + " vitórias!");
		System.out.println("Com: " + this.getEmpates() + " empates!");
		System.out.println("Com: " + this.getDerrotas() + " derrotas!");
		
	}
	
	public Time(String no, int vi, int de, int emp, String serie) {
		this.nome = no;
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = emp;
		this.serie = serie;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String no) {
		nome = no;
	}
	
	
	public int getVitorias() {
		return vitorias;
	}
	
	public void setVitorias(int vi) {
		vitorias = vi;
	}
	
	public int getDerrotas() {
		return derrotas;
	}
	
	
	public void setDerrotas(int de) {
		derrotas = de;
	}
	
	public int getEmpates() {
		return empates;
	}
	
	public void setEmpates(int emp) {
		empates = emp;
	}
		
	public String getSerie() {
		return serie;
	}

	public void setSerie() {
		if (this.getSerie() == "Serie A");
			this.serie = "Serie A";
	}	  
		

	public void ganharJogo() {
		this.setVitorias(getVitorias() + 1);
	}
	
	public void perderJogo() {
		this.setDerrotas(getDerrotas() + 1);
	}
	
	public void empatarJogo() {
		this.setEmpates(getEmpates() + 1 );
	}

	@Override
	public String toString() {
		return "O " + nome + ", com " + vitorias + " vitorias, " + derrotas + " derrotas, " + empates
				+ " empates e está na série  " + serie  + " do campeonato brasileiro!" + "\n ----------------------------------------------------------------------------------------------------------";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
