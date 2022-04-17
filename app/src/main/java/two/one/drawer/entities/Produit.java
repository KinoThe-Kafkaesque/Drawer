package two.one.drawer.entities;

import java.util.Date;

public class Produit {


	private long id;
	private String code;
	private String nom;
	private Date dateAchat;
	private double prix;
	
	public Produit() {
	}

	public Produit(long id, String code, String nom, Date dateAchat, double prix) {
		this.id = id;
		this.code = code;
		this.nom = nom;
		this.dateAchat = dateAchat;
		this.prix = prix;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	
}
