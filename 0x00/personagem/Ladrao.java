public class Ladrao extends Personagem {

	public Ladrao(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
		super(nome, TipoPersonagem.LADRAO, inteligencia, forca, vigor, resistencia, destreza);

		if (destreza < forca || destreza < inteligencia) {
			throw new RuntimeException("Atributos invalidos para LADRAO");
		}
	}

	@Override
	public double getDanoAtaque() {
		return (getForca() * 0.5) + (getDestreza() * 0.35) + (getVigor() * 0.1) + (getInteligencia() * 0.05);
	}

}