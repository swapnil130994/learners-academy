package DAO;

import java.sql.SQLException;

import model.User;

public interface LoginDao {
    public boolean verifyCredentials(User user) throws SQLException;

}
