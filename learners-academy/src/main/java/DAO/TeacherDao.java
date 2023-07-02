package DAO;

import java.sql.SQLException;
import java.util.List;

import org.json.JSONObject;

import model.SQLState;
import model.Teacher;

public interface TeacherDao {
    public List<Teacher> getAllTeachers() throws SQLException;
    public Teacher fetchOneTeacher(String id) throws SQLException;
    public SQLState updateOneTeacher(JSONObject jsonObject)throws SQLException;
    public SQLState deleteOneTeacher(JSONObject jsonObject)throws SQLException;
    public SQLState saveNewTeacher(JSONObject jsonObject)throws SQLException;
}
