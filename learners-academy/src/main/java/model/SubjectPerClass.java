package model;

public class SubjectPerClass {
    private String classId;
    private String subjectId;
    private String className;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    private String subjectName;

    public SubjectPerClass(String classId, String subjectId, String className, String subjectName) {
        this.classId = classId;
        this.subjectId = subjectId;
        this.className = className;
        this.subjectName = subjectName;
    }
}
