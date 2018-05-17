package br.com.projescola.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projescola.model.Aluno;
import br.com.projescola.model.Cidade;
import br.com.projescola.util.ConnectionFactory;

public class AlunoDB {

	Connection con;
	PreparedStatement ps;
	
	public AlunoDB(){
		
		con = ConnectionFactory.getConnection();
	}
	public boolean insert(Aluno aluno) {
		
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("Insert into Aluno(nome, nota, telefone, idcidade)");
			sb.append("value (?,?,?,?)");
			
			ps = this.con.prepareStatement(sb.toString());
			ps.setString(1, aluno.getNome());
			ps.setInt(2, aluno.getNota());
			ps.setString(3, aluno.getTelefone());
			ps.setInt(4, aluno.getCidade().getId());
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public List<Aluno> all(){
		
		List<Aluno> lstaluno = new ArrayList<>();
		String sql = "Select a.nome, a.nota, a.telefone, c.nome From ALUNO a, CIDADE c where a.id=c.id";
		
		try {
			ps = this.con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				
				Aluno a = new Aluno();
				a.setNome(rs.getString("a.nome"));
				a.setNota(rs.getInt("a.nota"));
				a.setTelefone(rs.getString("a.telefone"));
				a.setCidade( new Cidade(rs.getString("c.nome")));
				
				lstaluno.add(a);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lstaluno;
	}
}
