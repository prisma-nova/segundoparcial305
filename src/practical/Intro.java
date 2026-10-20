package practical;

public class Intro {

	public static void main(String[] args) {
		System.out.println("hola");
		System.out.println("\tKRIS");
		System.out.println("[] {} ();\t.'\"\\");
		System.out.println("CECYTO\nCECYTEM\nTECAMAC");
		
		//tipos de dato entero
		byte edad=25;
		short anio=2026;
		int grande=13456;
		long muygrande=12345673400000L;
		System.out.println("\nByte="+edad+"\nShort="+anio+"\nInt="+grande+"\nLong="+muygrande);
		
		//tipo de dato decimal
		float uno=1.34657f;
		double dos=2.33456;
		System.out.println("\nFloat="+uno+"\nDouble="+dos);
		
		char letra='a';
		char letra2='#';
		boolean si=true;
		System.out.println("\nLetra="+letra+"\nLetra2="+letra2+"\nBoolean si="+si);
		
		String nombre ="kris rivera palestina";
		System.out.println("\n"+nombre);
		System.out.println(nombre.length());
		System.out.println(nombre.toUpperCase());
		System.out.println(nombre.charAt(5));
		System.out.println(nombre.substring(0, 4));
		
		//nomenclatura de variables
		
		//variables=camelCase
		int gatosNegros;
		String reglaAuto;
		boolean funcionaBien;
		double resultadoDivision;
		short letrasNombre;
		
		//clases=PascalCase
		//class HolaMundo
		//class EjemploCasa
		//class WorldMachine
		//class DeltaruneChapter1
		
		//Variable constante, no cambia de valor
		final double PI=3.1416;
		
	}

}
