package two.one.drawer.entities;

import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnore;


public class Marque {
	private long id;
	private String code;
	private String libelle;
	@JsonIgnore
	private List<Machine> machines;
	
	public Marque() {
		
	}

	public Marque(long id, String code, String libelle, List<Machine> machines) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.machines = machines;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Machine> getMachines() {
		return machines;
	}

	public void setMachines(List<Machine> machines) {
		this.machines = machines;
	}
	
	
	
	
}