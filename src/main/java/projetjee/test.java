package projetjee;

import java.sql.SQLException;
import java.util.List;

public class test {

	public static void main(String[] args) throws SQLException {
		System.out.println("hahahahaha");
		UtilisateurImpl utilisateurTestInstance= new UtilisateurImpl();
		List<Utilisateur> utilisateurTestInstanceMethod = utilisateurTestInstance.listUsers();
		for (Utilisateur p : utilisateurTestInstanceMethod) {
		System.out.println(" email : " + p.getEmail() + " id : "+ p.getIdUtilisateur() + " password : "+ p.getPassword());
		}
		System.out.println("hohohohohoh");

	}

}
