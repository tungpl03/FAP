/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Feedback extends DBContext {

    String fbid, classId, teacherId, studentId, punctuality, teaching_skills, topic_coverage, teacher_support, response_time, comment, subId, studentName, className, teacherName;
    int diem, editnumber;

    public Feedback(String fbid, String classId, String teacherId, String studentId, String punctuality, String teaching_skills, String topic_coverage, String teacher_support, String response_time, String comment, String subId, String studentName, String className, String teacherName, int diem, int editnumber) {
        this.fbid = fbid;
        this.classId = classId;
        this.teacherId = teacherId;
        this.studentId = studentId;
        this.punctuality = punctuality;
        this.teaching_skills = teaching_skills;
        this.topic_coverage = topic_coverage;
        this.teacher_support = teacher_support;
        this.response_time = response_time;
        this.comment = comment;
        this.subId = subId;
        this.studentName = studentName;
        this.className = className;
        this.teacherName = teacherName;
        this.diem = diem;
        this.editnumber = editnumber;
        connectDB();
    }

    public int getEditnumber() {
        return editnumber;
    }

    public void setEditnumber(int editnumber) {
        this.editnumber = editnumber;
    }

    public Feedback(String fbid, String punctuality, String teaching_skills, String topic_coverage, String teacher_support, String response_time, String comment, int diem) {
        this.fbid = fbid;
        this.punctuality = punctuality;
        this.teaching_skills = teaching_skills;
        this.topic_coverage = topic_coverage;
        this.teacher_support = teacher_support;
        this.response_time = response_time;
        this.comment = comment;
        this.diem = diem;
        connectDB();
    }

    public Feedback(String fbid, String classId, String teacherId, String studentId, String punctuality, String teaching_skills, String topic_coverage, String teacher_support, String response_time, String comment, String subId, String studentName, String className, String teacherName, int diem) {
        this.fbid = fbid;
        this.classId = classId;
        this.teacherId = teacherId;
        this.studentId = studentId;
        this.punctuality = punctuality;
        this.teaching_skills = teaching_skills;
        this.topic_coverage = topic_coverage;
        this.teacher_support = teacher_support;
        this.response_time = response_time;
        this.comment = comment;
        this.subId = subId;
        this.studentName = studentName;
        this.className = className;
        this.teacherName = teacherName;
        this.diem = diem;
        connectDB();
    }

    public Feedback(String fbid, String punctuality, String teaching_skills, String topic_coverage, String teacher_support, String response_time, String comment) {
        this.fbid = fbid;
        this.punctuality = punctuality;
        this.teaching_skills = teaching_skills;
        this.topic_coverage = topic_coverage;
        this.teacher_support = teacher_support;
        this.response_time = response_time;
        this.comment = comment;
        connectDB();
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public Feedback() {
        connectDB();
    }

    public Feedback(String studentId) {
        this.studentId = studentId;
        connectDB();
    }

    public Feedback(String fbid, String punctuality, String teaching_skills, String topic_coverage, String teacher_support, String response_time, String comment, int diem, int editnumber) {
        this.fbid = fbid;
        this.punctuality = punctuality;
        this.teaching_skills = teaching_skills;
        this.topic_coverage = topic_coverage;
        this.teacher_support = teacher_support;
        this.response_time = response_time;
        this.comment = comment;
        this.diem = diem;
        this.editnumber = editnumber;
        connectDB();
    }

    public Feedback(String fbid, String classId, String teacherId, String studentId, String punctuality, String teaching_skills, String topic_coverage, String teacher_support, String response_time, String comment, String subId, String studentName, String className, String teacherName) {
        this.fbid = fbid;
        this.classId = classId;
        this.teacherId = teacherId;
        this.studentId = studentId;
        this.punctuality = punctuality;
        this.teaching_skills = teaching_skills;
        this.topic_coverage = topic_coverage;
        this.teacher_support = teacher_support;
        this.response_time = response_time;
        this.comment = comment;
        this.subId = subId;
        this.studentName = studentName;
        this.className = className;
        this.teacherName = teacherName;
        connectDB();
    }

    public Feedback(String fbid, String classId, String teacherId, String studentId, String punctuality, String teaching_skills, String topic_coverage, String teacher_support, String response_time, String comment, String subId, String studentName, String className) {
        this.fbid = fbid;
        this.classId = classId;
        this.teacherId = teacherId;
        this.studentId = studentId;
        this.punctuality = punctuality;
        this.teaching_skills = teaching_skills;
        this.topic_coverage = topic_coverage;
        this.teacher_support = teacher_support;
        this.response_time = response_time;
        this.comment = comment;
        this.subId = subId;
        this.studentName = studentName;
        this.className = className;
        connectDB();
    }

    public Feedback(String fbid, String classId, String teacherId, String studentId, String punctuality, String teaching_skills, String topic_coverage, String teacher_support, String response_time, String comment, String subId) {
        this.fbid = fbid;
        this.classId = classId;
        this.teacherId = teacherId;
        this.studentId = studentId;
        this.punctuality = punctuality;
        this.teaching_skills = teaching_skills;
        this.topic_coverage = topic_coverage;
        this.teacher_support = teacher_support;
        this.response_time = response_time;
        this.comment = comment;
        this.subId = subId;
        connectDB();
    }

    public Feedback(String fbid, String classId, String teacherId, String studentId, String punctuality, String teaching_skills, String topic_coverage, String teacher_support, String response_time, String comment, String subId, String studentName) {
        this.fbid = fbid;
        this.classId = classId;
        this.teacherId = teacherId;
        this.studentId = studentId;
        this.punctuality = punctuality;
        this.teaching_skills = teaching_skills;
        this.topic_coverage = topic_coverage;
        this.teacher_support = teacher_support;
        this.response_time = response_time;
        this.comment = comment;
        this.subId = subId;
        this.studentName = studentName;
        connectDB();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getFbid() {
        return fbid;
    }

    public void setFbid(String fbid) {
        this.fbid = fbid;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getPunctuality() {
        return punctuality;
    }

    public void setPunctuality(String punctuality) {
        this.punctuality = punctuality;
    }

    public String getTeaching_skills() {
        return teaching_skills;
    }

    public void setTeaching_skills(String teaching_skills) {
        this.teaching_skills = teaching_skills;
    }

    public String getTopic_coverage() {
        return topic_coverage;
    }

    public void setTopic_coverage(String topic_coverage) {
        this.topic_coverage = topic_coverage;
    }

    public String getTeacher_support() {
        return teacher_support;
    }

    public void setTeacher_support(String teacher_support) {
        this.teacher_support = teacher_support;
    }

    public String getResponse_time() {
        return response_time;
    }

    public void setResponse_time(String response_time) {
        this.response_time = response_time;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    //khai bao cac thanh phan xu ly db
    Connection cnn;
//    Statement stm;// thuc hien lenh sql
    PreparedStatement stm;
    ResultSet rs; //luu tru va xu ly du lieu

    private void connectDB() {
//        cnn = (new DBContext()).connection;
        cnn = connection;
        if (cnn != null) {
            System.out.println("Connect success");
        } else {
            System.out.println("Connect fail");
        }
    }

    public ArrayList<Feedback> getFblist() {
        ArrayList<Feedback> data = new ArrayList<Feedback>();
        try {
            String strSQL = "select f.*, s.name, c.classname from feedback f join sinhvien s on f.studentId = s.studentId join class c on f.classId = c.classId where s.studentId = ?";
            stm = cnn.prepareStatement(strSQL);
            stm.setString(1, studentId);
            rs = stm.executeQuery();
            while (rs.next()) {
                String fbid = String.valueOf(rs.getInt(1));
                String classId = rs.getString(13);
                String teacherID = rs.getString(3);
                String studentID = rs.getString(4);
                String punctuality = rs.getString(5);
                String teaching_skills = rs.getString(6);
                String topic_coverage = rs.getString(7);
                String teacher_support = rs.getString(8);
                String response_time = rs.getString(9);
                String comment = rs.getString(10);
                String subId = rs.getString(11);
                String studentName = rs.getString(12);
                Feedback f = new Feedback(fbid, classId, teacherID, studentID, punctuality, teaching_skills, topic_coverage, teacher_support, response_time, comment, subId, studentName);
                data.add(f);
            }
        } catch (Exception e) {
            System.out.println("getListCategory:" + e.getMessage());
        }
        return data;
    }

    public void getFeedbackById() {
        try {
            String strSQL = "select f.*, c.classname from feedback f join class c on f.classId = c.classId "
                    + "where fbid=? ";
            stm = cnn.prepareStatement(strSQL);
            stm.setString(1, fbid);
//            rs = stm.executeQuery(strSQL);
            rs = stm.executeQuery();
            while (rs.next()) {
                this.setFbid(String.valueOf(rs.getInt(1)));
                this.setClassId(String.valueOf(rs.getInt(2)));
                this.setTeacherId(rs.getString(3));
                this.setStudentId(rs.getString(4));
                this.setPunctuality(rs.getString(5));
                this.setTeaching_skills(rs.getString(6));
                this.setTopic_coverage(rs.getString(7));
                this.setTeacher_support(rs.getString(8));
                this.setResponse_time(rs.getString(9));
                this.setComment(rs.getString(10));
                this.setSubId(rs.getString(11));
                this.setClassName(rs.getString(12));
            }
        } catch (Exception e) {
            System.out.println(" getTeacherbyAccount:" + e.getMessage());
        }
    }

    public ArrayList<Feedback> getListFeedbackByTeacherID() {
        ArrayList<Feedback> data = new ArrayList<Feedback>();
        try {
            String strSQL = "select f.*, t.teacherName, c.classname from feedback f join giangvien t on f.teacherId = t.teacherId join class c on f.classId = c.classId where t.teacherId = ?";
            stm = cnn.prepareStatement(strSQL);
            stm.setString(1, teacherId);
            rs = stm.executeQuery();
            while (rs.next()) {
                String fbid = String.valueOf(rs.getInt(1));
                String classId = rs.getString(14);
                String teacherID = rs.getString(3);
                String studentID = rs.getString(4);
                String punctuality = rs.getString(5);
                String teaching_skills = rs.getString(6);
                String topic_coverage = rs.getString(7);
                String teacher_support = rs.getString(8);
                String response_time = rs.getString(9);
                String comment = rs.getString(10);
                String subId = rs.getString(11);
                int diem = rs.getInt(12);
                String teacherName = rs.getString(13);
                Feedback f = new Feedback(fbid, classId, teacherID, studentID, punctuality, teaching_skills, topic_coverage, teacher_support, response_time, comment, subId, studentName, className, teacherName, diem);
                data.add(f);
            }
        } catch (Exception e) {
            System.out.println("getListCategory:" + e.getMessage());
        }
        return data;
    }

    public boolean updateFeedback() {
        try {
            String strSQL = "UPDATE [dbo].[feedback]"
                    + "   SET [punctuality] = ?"
                    + "      ,[teaching_skills] = ?"
                    + "      ,[topic_coverage] = ?"
                    + "      ,[teacher_support] = ?"
                    + "      ,[response_time] = ?"
                    + "      ,[comment] = ?"
                    + "      ,[diem] = ?"
                    + " WHERE fbid = ?";
            stm = cnn.prepareStatement(strSQL);
            stm.setString(1, punctuality);
            stm.setString(2, teaching_skills);
            stm.setString(3, topic_coverage);
            stm.setString(4, teacher_support);
            stm.setString(5, response_time);
            stm.setString(6, comment);
            stm.setInt(8, Integer.parseInt(fbid));
            stm.setInt(7, diem);
            stm.execute();
            return true;
        } catch (Exception e) {
            System.out.println("UpdateProduct:" + e.getMessage());
            return false;
        }
    }

    public void updateComment() {
        try {
            String strSQL = "UPDATE [dbo].[feedback]"
                    + "   SET [comment] = ?"
                    + " WHERE fbid = ?";
            stm = cnn.prepareStatement(strSQL);
            stm.setString(1, comment);
            stm.setInt(2, Integer.parseInt(fbid));
            stm.execute();
        } catch (Exception e) {
            System.out.println("UpdateProduct:" + e.getMessage());
        }
    }

    public int getEditnumberbyId() {
        try {
            String strSQL = "select editnumber from feedback "
                    + "where fbid=? ";
            stm = cnn.prepareStatement(strSQL);
            stm.setString(1, fbid);
            rs = stm.executeQuery();
            while (rs.next()) {
                this.setEditnumber(rs.getInt(1));
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(" getTeacherbyAccount:" + e.getMessage());
        }
        return 0;
    }

    public void updateEditnumber() {
        try {
            String strSQL = "UPDATE [dbo].[feedback]"
                    + "   SET [editnumber] = ?"
                    + " WHERE fbid = ?";
            stm = cnn.prepareStatement(strSQL);
            stm.setInt(1, editnumber);
            stm.setInt(2, Integer.parseInt(fbid));
            stm.execute();
        } catch (Exception e) {
            System.out.println("UpdateProduct:" + e.getMessage());
        }
    }

}
