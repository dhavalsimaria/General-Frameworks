package com.dhaval.general;
/**
 * @author Dhaval
 */
public class SO_semicolon {

	public void semiColonMethod(){
		/*Fahrzeughalter[ ] fzh = new Fahrzeughalter[ ] { 
			    new Fahrzeughalter("Riese", "Goliath"),
			    new Fahrzeughalter("Berty","Vogts"),
			    new Fahrzeughalter("Uwe", "Seeler")
			};

			Fahrzeug[ ] fz = new Fahrzeug [ ] { 
			    new Fahrzeug(fzh[0],16),
			    new Pkw(fzh[1],4,5),
			    new Motorrad (fzh[2])
			};*/

		User[] usr = new User[]{
				new User("Dhaval", "Simaria"),
				new User("John", "Doe"),
				new User("Jane", "Doe")
		};
		
			for(int j = 0; j < usr.length; j++) {
			   System.out.println("Das Fahrzeug von" + usr[j] + " ist ein "+ usr[j].getFirstName( )+".");
			}

			for(int i = 0; i < usr.length; i++) {
			    System.out.println("Das Fahrzeug ist ein" + usr[i] + " ist ein "+ ".");
			    System.out.println("Es gehört " + usr[i].getLastName( )+".");
			}
	}
}
