package projetjee;

import java.sql.SQLException;
import java.util.List;

public interface Iutilisateur {
//	public List<Utilisateur> getProduitsParMotCle(String mc);
//	public void getUtilisateur(Utilisateur u);
	public List<Utilisateur> listUsers() throws SQLException;

}
