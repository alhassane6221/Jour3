package domaine;

public class Employe {

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
		System.out.println("l'employ¨¦ " + this.prenom + " " + "demande la formation " + theme);
	}

	public Employe(String nom, String prenom, int id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}

	public Employe() {

	}
	

	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nom : " + this.nom + "     prenom : " + this.prenom + "      Id : " + this.id;
	}

	}


