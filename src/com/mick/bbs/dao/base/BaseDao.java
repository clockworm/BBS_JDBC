package com.mick.bbs.dao.base;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mick.bbs.util.JDBC;
/**
 * 持久层
 * @author 青銅渣渣
 *
 */
public class BaseDao implements DataDao {
	private PreparedStatement preStatement;

	@Override
	public ResultSet find(Serializable id, String sql) throws SQLException {
		preStatement = JDBC.getPreparedStatement(sql);
		preStatement.setObject(1, id);
		ResultSet resultset = preStatement.executeQuery();
		return resultset;
	}

	@Override
	public int add(String sql, Object... objects) throws SQLException {
		preStatement = JDBC.getPreparedStatement(sql);
		for (int i = 0; i < objects.length; i++) {
			preStatement.setObject(i + 1, objects[i]);
		}
		int flag = preStatement.executeUpdate();
		return flag;
	}

	@Override
	public int delete(Serializable id, String sql) throws SQLException {
		preStatement = JDBC.getPreparedStatement(sql);
		preStatement.setObject(1, id);
		int flag = preStatement.executeUpdate();
		return flag;
	}

	@Override
	public int update(String sql, Object... objects) throws SQLException {
		preStatement = JDBC.getPreparedStatement(sql);
		for (int i = 0; i < objects.length; i++) {
			preStatement.setObject(i + 1, objects[i]);
		}
		int flag = preStatement.executeUpdate();
		return flag;
	}

	@Override
	public ResultSet Query(String sql) throws SQLException {
		preStatement = JDBC.getPreparedStatement(sql);
		return preStatement.executeQuery();
	}

	@Override
	public ResultSet findMore(String sql, Object... objects) throws SQLException {
		preStatement = JDBC.getPreparedStatement(sql);
		for (int i = 0; i < objects.length; i++) {
			preStatement.setObject(i + 1, objects[i]);
		}
		return preStatement.executeQuery();
	}

	@Override
	public ResultSet pageQuery(String sql, int pageSize, int page, Object... objects) throws SQLException {
		PreparedStatement prestatement = JDBC.getPreparedStatement(sql);
		int i = 0;
		int start = (page - 1) * pageSize + 1;
		int end = page * pageSize;
		try {
			for (i = 0; i < objects.length; i++) {
				prestatement.setObject(i + 1, objects[i]);
			}
			prestatement.setObject(i++, start);
			prestatement.setObject(i++, end);
			ResultSet result = prestatement.executeQuery();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
