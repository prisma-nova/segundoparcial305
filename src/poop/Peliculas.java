package poop;

public class Peliculas {
	String nombre, director, genero;
	int duracionSeg, añoEstreno;
	
	public Peliculas() {
		
	}
	
	public Peliculas(String nombre, String director, String genero, int duracionSeg, int añoEstreno) {
		this.nombre = nombre;
		this.director = director;
		this.genero = genero;
		this.duracionSeg = duracionSeg;
		this.añoEstreno = añoEstreno;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracionSeg() {
		return duracionSeg;
	}

	public void setDuracionSeg(int duracionSeg) {
		this.duracionSeg = duracionSeg;
	}

	public int getAñoEstreno() {
		return añoEstreno;
	}

	public void setAñoEstreno(int añoEstreno) {
		this.añoEstreno = añoEstreno;
	}
	
	
	@Override
	public String toString() {
		return "Peliculas [nombre=" + nombre + ", director=" + director + ", genero=" + genero + ", duracionSeg="
				+ duracionSeg + ", añoEstreno=" + añoEstreno + "]";
	}

	public void estrenar() {
		System.out.println("\nPROYECTANDO en Cinepolis... "+nombre); 
	}
	
	
	

}
