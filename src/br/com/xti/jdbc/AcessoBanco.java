package br.com.xti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AcessoBanco {

	public static void main(final String[] args) throws Exception {

		final String sql = "select codigo, nome, sexo, email from pessoa";
		final String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try( final Connection con = DriverManager.getConnection(url, "xti", "xti123");
				PreparedStatement stm = con.prepareStatement(sql);
				ResultSet rs = stm.executeQuery()){

			while (rs.next()) {
				System.out.println(rs.getString("nome"));
			}
		}

	}

}
