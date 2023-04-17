package projetjee;
import java.io.Serializable;
public class Utilisateur implements Serializable{
private Long idUtilisateur;
private String email;
private String password;

public Long getIdUtilisateur() {
	return idUtilisateur;
}
public void setIdUtilisateur(Long idUtilisateur) {
	this.idUtilisateur = idUtilisateur;
}


public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}