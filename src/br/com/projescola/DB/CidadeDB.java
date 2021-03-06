package br.com.projescola.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projescola.model.Cidade;
import br.com.projescola.util.ConnectionFactory;

public class CidadeDB {

	Connection con;
	PreparedStatement ps;
	
	public CidadeDB(){
		
		con = ConnectionFactory.getConnection();
	}
	public boolean insert(Cidade cidade) {
		
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("Insert into cidade(nome, qtd_habitante)");
			sb.append("value (?,?)");
			
			ps = this.con.prepareStatement(sb.toString());
			ps.setString(1, cidade.getNome());
			ps.setInt(2, cidade.getQntabitante());
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public List<Cidade> all(){
		
		List<Cidade> lstcidade = new ArrayList<>();
		String sql = "Select id, nome, qtd_habitante From CIDADE";
		
		try {
			ps = this.con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Cidade cidade = new Cidade();
				cidade.setId(rs.getInt("id"));
				cidade.setNome(rs.getString("nome"));
				cidade.setQntabitante(rs.getInt("qtd_habitante"));
				
				lstcidade.add(cidade);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lstcidade;
	}
}
