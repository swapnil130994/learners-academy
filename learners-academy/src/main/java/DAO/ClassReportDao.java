package DAO;

import java.sql.SQLException;
import java.util.List;

import org.json.JSONObject;

import model.ClassFull;
import model.Clss;
import model.SQLState;
import model.Student;

public interface ClassReportDao {
    public List<ClassFull> getAllStudents() throws SQLException;
    public List<Clss> getAllClasses() throws SQLException;
    public Student fetchOneStudent(String id) throws SQLException;
    public SQLState updateOneStudent(JSONObject jsonObject)throws SQLException;
    public SQLState deleteOneStudent(JSONObject jsonObject)throws SQLException;
    public SQLState saveNewStudent(JSONObject jsonObject)throws SQLException;
}
