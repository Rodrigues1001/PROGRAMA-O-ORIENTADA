
public class CampeonatoDeFutebol {
	public static void main(String[] args) {
		
		Time a[] = new Time[20];
		SerieB b[] = new SerieB[20];
		
		a[0] = new Time("Atletico MG", 0, 0, 0, "Serie A");
		a[1] = new Time("Flamengo", 0, 0, 0, "Serie A");
		a[2] = new Time("Palmeiras", 0, 0, 0, "Serie A");
		a[3] = new Time("Corintians", 0, 0, 0, "Serie A");
		a[4] = new Time("Fortaleza", 0, 0, 0, "Serie A");
		a[5] = new Time("Bragantino", 0, 0, 0, "Serie A");
		a[6] = new Time("Fluminense", 0, 0, 0, "Serie A");
		a[7] = new Time("Internacional", 0, 0, 0, "Serie A");
		a[8] = new Time("Ceará", 0, 0, 0, "Serie A");
		a[9] = new Time("America MG", 0, 0, 0, "Serie A");
		a[10] = new Time("Cuiabá", 0, 0, 0, "Serie A");
		a[11] = new Time("Santos", 0, 0, 0, "Serie A");
		a[12] = new Time("Athletico PR", 0, 0, 0, "Serie A");
		a[13] = new Time("São Paulo", 0, 0, 0, "Serie A");
		a[14] = new Time("Atletico GO", 0, 0, 0, "Serie A");
		a[15] = new Time("Juventude", 0, 0, 0, "Serie A");
		a[16] = new Time("Bahia", 0, 0, 0, "Serie A");
		a[17] = new Time("Grêmio", 0, 0, 0, "Serie A");
		a[18] = new Time("Sport", 0, 0, 0, "Serie A");
		a[19] = new Time("Chapecoense", 0, 0, 0, "Serie A");
		
// ------------------------------------------------------------------ //
		
		
		Jogo jg1 = new Jogo();
		
		jg1.marcarJogo(a[2], a[15]);
		jg1.jogar();
		jg1.jogar();
		jg1.jogar();
		System.out.println("------------------------------------------------------");
		System.out.println(a[2].toString());
		System.out.println(a[15].toString());

	
// ------------------------------------------------------------------ //
	
		b[0] = new SerieB("Botafogo", 0, 0, 0, "Serie B");
		b[1] = new SerieB("Coritiba", 0, 0, 0, "Serie B");
		b[2] = new SerieB("Goiás", 0, 0, 0, "Serie B");
		b[3] = new SerieB("Avaí", 0, 0, 0, "Serie B");
		b[4] = new SerieB("CRB", 0, 0, 0, "Serie B");
		b[5] = new SerieB("CSA", 0, 0, 0, "Serie B");
		b[6] = new SerieB("Guarani", 0, 0, 0, "Serie B");
		b[7] = new SerieB("Nautico", 0, 0, 0, "Serie B");
		b[8] = new SerieB("Vasco", 0, 0, 0, "Serie B");
		b[9] = new SerieB("Vila Nova", 0, 0, 0, "Serie B");
		b[10] = new SerieB("Cruzeiro", 0, 0, 0, "Serie B");
		b[11] = new SerieB("Brusque", 0, 0, 0, "Serie B");
		b[12] = new SerieB("Sampaio Correia", 0, 0, 0, "Serie B");
		b[13] = new SerieB("Ponte Preta", 0, 0, 0, "Serie B");
		b[14] = new SerieB("Operário", 0, 0, 0, "Serie B");
		b[15] = new SerieB("Remo", 0, 0, 0, "Serie B");
		b[16] = new SerieB("Londrina", 0, 0, 0, "Serie B");
		b[17] = new SerieB("Vitória", 0, 0, 0, "Serie B");
		b[18] = new SerieB("Confiança", 0, 0, 0, "Serie B");
		b[19] = new SerieB("Brasil de Pelotas", 0, 0, 0, "Serie B");
	
	
		//jg1.marcarJogo(b[0], b[1]);
		//jg1.jogar();
		
		//System.out.println(b[0].toString());
		//System.out.println(b[1].toString());
	}
}
