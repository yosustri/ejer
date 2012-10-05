package ejer;

public class Lectura {
	private String nombre;
	private String apellido;
	private String partido;
	private String distrito;
	private String municipio;
	private String provincia;
	
	public Lectura(String pNombre, String pApellido, String pPartido, String pDistrito, String pMunicipio, String pProvincia){
		setNombre(pNombre);
		setApellido(pApellido);
		setPartido(pPartido);
		setDistrito(pDistrito);
		setMunicipio(pMunicipio);
		setProvincia(pProvincia);
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

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	
}
