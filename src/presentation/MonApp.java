package presentation;

import java.util.Scanner;

import domaine.Employe;

public class MonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clav = new Scanner(System.in);
		Employe [] emps = new Employe[100];
		String rep =  "oui";
		int i = 0;
		while(rep.equals("oui") ){
			Employe emp1 = new Employe();
			System.out.println("Saisisez le nom");
			emp1.setNom(clav.next());
			
			System.out.println("Saisisez le prenom");
			 
			emp1.setPrenom(clav.next());
			System.out.println("Saisisez votre ID");
			 
			emp1.setId(clav.nextInt());
			System.out.println("Voulez vous Entrez les infos d'un autre employ¨¦?");
			rep = clav.next();
			emps[i] = emp1;
			i++;
		}
		System.out.println("Bien termin¨¦");
		for(int o = 0; o < i; o++) {
			System.out.println(emps[o]);
		}
		clav.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} 
