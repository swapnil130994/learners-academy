package DAO;

import java.sql.SQLException;
import java.util.List;

import org.json.JSONObject;

import model.Clss;
import model.SQLState;

public interface ClssDao {
    public List<Clss> getAllClasses() throws SQLException;
    public Clss fetchOneClass(String id) throws SQLException;
    public SQLState updateOneClass(JSONObject jsonObject)throws SQLException;
    public SQLState deleteOneClass(JSONObject jsonObject)throws SQLException;
    public SQLState saveNewClass(JSONObject jsonObject)throws SQLException;
}
