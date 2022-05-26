
public final class SerieB extends Time {
	
	private static final long serialVersionUID = 1L;
	
	public SerieB(String no, int vi, int de, int emp, String serie) {
		super(no, vi, de, emp, serie);
	}
	
	@Override
	public void apresentar() {
		System.out.println(this.getNome() + ".");
		System.out.println("Com: " + this.getVitorias() + " vitórias!");
		System.out.println("Com: " + this.getEmpates() + " empates!");
		System.out.println("Com: " + this.getDerrotas() + " derrotas!");
		System.out.println("Está jogando pela serie B!");
	}
	
	@Override
	public void setSerie() {
		if (this.getSerie() == "Serie B");
			this.serie = "Serie B";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
