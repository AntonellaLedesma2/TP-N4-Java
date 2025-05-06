package paquete;

public class prueba {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		persona1.setNombre("Agustina");
		persona1.setEdad(17);
		int aux=persona1.getEdad();
		char letra='a';
		System.out.println("Nombre: "+persona1.getNombre()+" edad: "+persona1.getEdad());
		
		
		if(persona1.sosMayor()==true)
			System.out.println(persona1.getNombre()+"Es mayor de edad");
		else
			System.out.println(persona1.getNombre()+" es menor de edad.");
		
		System.out.println("Cantidad de veces que aparece ("+letra+") en el nombre: "+persona1.repeticionesDeLetra(letra));
	}
	
}
