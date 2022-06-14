package QuanLyBanHang.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperUsers implements RowMapper<Users> {
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		Users users = new Users();
		users.setId(rs.getLong("id"));
		users.setUser(rs.getString("User"));
		users.setPassword(rs.getString("Password"));
		users.setDisplay_name(rs.getString("Display_name"));
		users.setAddress(rs.getString("Address"));
		return users;
	}

}
