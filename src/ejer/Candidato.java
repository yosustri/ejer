package ejer;

public class Candidato {
	
	private String nombre;
	private String apellido;
	private Partido partido;
	private ListaDistritos distrito;
	
	public Candidato(String pNombre, String pApellido, Partido pAartido, ListaDistritos pDistrito){
		setNombre(nombre);
		setApellido(apellido);
		setPartido(partido);
		setDistrito(pDistrito);
	}
	
	public ListaDistritos getDistrito() {
		return distrito;
	}

	public void setDistrito(ListaDistritos distrito) {
		this.distrito = distrito;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	
}
