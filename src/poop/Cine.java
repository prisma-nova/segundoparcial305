package poop;

public class Cine {

	public static void main(String[] args) {
		Peliculas sitio=new Peliculas();
		sitio.setNombre("Titanic");
		sitio.setDirector("James Cameron");
		sitio.setGenero("Dramatico");
		sitio.setDuracionSeg(11640);
		sitio.setAñoEstreno(1998);
		
		System.out.println(sitio.toString());
		
		Peliculas cartelera1=new Peliculas("Nimona","Nick Bruno","Fantastico",6006,2023);
		
		Peliculas cartelera2=new Peliculas("Nimona","Troy Quane","Fantastico",6006,2023);
		
		System.out.println("\n"+cartelera1.toString());
		System.out.println(cartelera2.toString());
		
		System.out.println(sitio.getNombre());
		System.out.println(sitio.getGenero());
		
		System.out.println(cartelera1.getNombre());
		System.out.println(cartelera1.getGenero());
		
		sitio.estrenar();
		
		cartelera1.estrenar();
		
		cartelera2.estrenar();

	}

}
