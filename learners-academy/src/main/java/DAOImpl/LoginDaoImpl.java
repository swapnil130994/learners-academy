package DAOImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DAO.LoginDao;
import db.DbConnection;
import model.Clss;
import model.User;

public class LoginDaoImpl implements LoginDao {
	List<Clss> classes = new ArrayList<>();
    Clss clase = null;
    Connection conn;

    public LoginDaoImpl() throws SQLException, ClassNotFoundException {
        DbConnection databaseConnection = DbConnection.getInstance();
        this.conn = databaseConnection.getConnection();
    }


    public boolean verifyCredentials(User user) {
        boolean authorized = false;
        ResultSet rs;
        Statement st = null;

        try {
            st = this.conn.createStatement();
            String sql = "select users.user_password " +
                    "from users " +
                    "where users.user_id = '" + user.getUserId() + "'" +
                    " and users.user_password = '" + user.getPassword() + "'";

            System.out.println(sql);
            rs = st.executeQuery(sql);

            if (rs.next()) {
                authorized = true;
            }
            st.close();
        } catch (SQLException e) {
            authorized = false;
        } finally {
            return authorized;
        }
    }
}
