package projetjee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UtilisateurImpl implements Iutilisateur {

	@Override
	public List<Utilisateur> listUsers() throws SQLException {
		List<Utilisateur> prods= new ArrayList<Utilisateur>();
        Connection conn=SingletonConnection.getConnection();
        try {
        	PreparedStatement ps= conn.prepareStatement("select * from utilisateur");
        	ResultSet rs = ps.executeQuery();
	        	while (rs.next()) {
	        		Utilisateur u = new Utilisateur();
		        	u.setIdUtilisateur(rs.getLong("id"));
		        	u.setEmail(rs.getString("email"));
		        	u.setPassword(rs.getString("password"));
		        	prods.add(u);
	        	}
	        	} catch (SQLException e) {
	        		e.printStackTrace();
	        	}
	    return prods;
        	

    }

}
