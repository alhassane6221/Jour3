package domaine;

public class Manager {
	private String nom;
	private String prenom;
	private int id;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void demanderFormation(String theme) {

	}
	public Manager(String nom, String prenom, int id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}

	public void validerFormation() {
		System.out.println("le manager " + this.prenom + " " + this.nom + "Valide les demandes "
				+"de formation de ses employ¨¦s");
	}
	public Manager() {
		 
	}
	
	
}
