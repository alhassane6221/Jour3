package presentation;

import domaine.Employe;
import domaine.Manager;

public class MonApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe employe1;
		Employe employe2;
		Employe employe3;
		Employe employe4;
		Manager manager1;
		employe1 = new Employe("Bah", "Alhassane", 1998);
		employe2 = new Employe("Lamah", "Joseph", 2005);
		employe3 = new Employe("Bangoura", "Mamadama", 1874);
		employe4 = new Employe("Camara", "Mabinty", 1536);
		manager1 = new Manager("Soir¨¦", "Nouhou", 1238);
		employe1.demanderFormation("Initiation Objet avec Java");
		employe2.demanderFormation("Initialisation C++");
		employe3.demanderFormation("Initialisation Java Script");
		employe4.demanderFormation("Initialisation CSS");
		manager1.validerFormation();
	}
}
