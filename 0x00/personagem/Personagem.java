import java.util.Objects;

public abstract class Personagem {

	private String nome;
	private TipoPersonagem tipo;
	private int inteligencia;
	private int forca;
	private int vigor;
	private int resistencia;
	private int destreza;

	public Personagem() {
	}

	public Personagem(String nome, TipoPersonagem tipo, int inteligencia, int forca, int vigor, int resistencia,
			int destreza) {
		setNome(nome);
		setTipo(tipo);
		setInteligencia(inteligencia);
		setForca(forca);
		setVigor(vigor);
		setResistencia(resistencia);
		setDestreza(destreza);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoPersonagem getTipo() {
		return tipo;
	}

	public void setTipo(TipoPersonagem tipo) {
		this.tipo = tipo;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getVigor() {
		return vigor;
	}

	public void setVigor(int vigor) {
		this.vigor = vigor;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public abstract double getDanoAtaque();

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Personagem that = (Personagem) o;
		return inteligencia == that.inteligencia && forca == that.forca && vigor == that.vigor
				&& resistencia == that.resistencia && destreza == that.destreza && Objects.equals(nome, that.nome)
				&& tipo == that.tipo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, tipo, inteligencia, forca, vigor, resistencia, destreza);
	}

	@Override
	public String toString() {
		return String.format(
				"Personagem { nome = %s, tipo = %s, inteligencia = %d, forca = %d, vigor = %d, resistencia = %d, destreza = %d, dano ataque = %.2f }",
				getNome(), getTipo(), getInteligencia(), getForca(), getVigor(), getResistencia(), getDestreza(),
				getDanoAtaque());
	}

}