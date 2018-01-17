package br.com.xti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaCRUD {

	public void transferir(final Connection con, final Conta origem, final Conta destino, final double valor)
			throws SQLException {
		if (origem.saldo >= valor) {
			try {
				con.setAutoCommit(false);

				/* SAQUE */
				origem.saldo -= valor;
				this.alterar(con, origem);

				/* DEPÓSITO */
				destino.saldo += valor;
				this.alterar(con, destino);

				con.commit();
			} catch (final Exception e) {
				con.rollback();
			}
		}
	}

	public void criar(final Connection con, final Conta conta) throws SQLException {
		final String sql = "insert into conta values(?, ?, ?)";
		try (PreparedStatement stm = con.prepareStatement(sql)) {
			stm.setInt(1, conta.numero);
			stm.setString(2, conta.cliente);
			stm.setDouble(3, conta.saldo);
			stm.executeUpdate();
		}
	}

	public List<Conta> findAll(final Connection con) throws SQLException {
		final List<Conta> lista = new ArrayList<>();
		final String sql = "select numero, cliente, saldo from conta";
		try (PreparedStatement stm = con.prepareStatement(sql); ResultSet rs = stm.executeQuery()) {
			while (rs.next()) {
				lista.add(new Conta(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}
		}
		return lista;
	}

	public void alterar(final Connection con, final Conta conta) throws SQLException {
		final String sql = "update conta set cliente=?, saldo=? where numero=?";
		try (PreparedStatement stm = con.prepareStatement(sql)) {
			stm.setString(1, conta.cliente);
			stm.setDouble(2, conta.saldo);
			stm.setInt(3, conta.numero);
			stm.executeUpdate();
		}
	}

	public void excluir(final Connection con, final Conta conta) throws SQLException {
		final String sql = "delete conta where numero=?";
		try (PreparedStatement stm = con.prepareStatement(sql)) {
			stm.setInt(1, conta.numero);
			stm.executeUpdate();
		}
	}

	public static void main(final String[] args) throws SQLException {

		final String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try (Connection con = DriverManager.getConnection(url, "xti", "xti123")) {
			final ContaCRUD crud = new ContaCRUD();

			List<Conta> contas = crud.findAll(con);
			for (final Conta conta : contas) {
				System.out.println(conta);
			}

			final Conta origem = contas.get(0);
			final Conta destino = contas.get(1);
			crud.transferir(con, origem, destino, 1000);

			contas = crud.findAll(con);
			for (final Conta conta : contas) {
				System.out.println(conta);
			}

		}

	}
}
