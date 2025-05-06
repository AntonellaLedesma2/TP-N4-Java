package paquete;

public class Persona {
	
private String nombre;
private int edad;
private String email;

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public boolean sosMayor() {
	boolean flag=false;
	if(this.edad>=18)
		flag=true;
	else
		flag=false;
	return flag;
}

public int repeticionesDeLetra(char letra) {
	int contador=0;
	
	for(int i=0;i<nombre.length();i++) {
		if(Character.toLowerCase(nombre.charAt(i)) == letra)
			contador++;	
	}
	return contador;
}

}
