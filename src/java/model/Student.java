/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Student extends DBContext {

    String studentid, name, gender, address, birthdate, phonenumber, gmail, lop, password;

    public Student() {
        connectDB();
    }

    public Student(String gmail, String password) {
        this.gmail = gmail;
        this.password = password;
        connectDB();
    }

    public Student(String studentid, String name, String gender, String address, String birthdate, String phonenumber, String gmail, String lop, String password) {
        this.studentid = studentid;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthdate = birthdate;
        this.phonenumber = phonenumber;
        this.gmail = gmail;
        this.lop = lop;
        this.password = password;
        connectDB();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
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

    public boolean checkStudent() {
        try {
            String strSQL = "select * from sinhvien "
                    + "where gmail=? and password=?";
            stm = cnn.prepareStatement(strSQL);
            stm.setString(1, gmail);
            stm.setString(2, password);
//            rs = stm.executeQuery(strSQL);
            rs = stm.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(" checkStudent:" + e.getMessage());
        }
        return false;
    }

    public void getStudentbyAccount() {
        try {
            String strSQL = "select s.*, c.classname from sinhvien s join class c on s.class = c.classId "
                    + "where gmail=? ";
            stm = cnn.prepareStatement(strSQL);
            stm.setString(1, gmail);
//            rs = stm.executeQuery(strSQL);
            rs = stm.executeQuery();
            while (rs.next()) {
                this.setStudentid(rs.getString(1));
                this.setName(rs.getString(2));
                this.setGender(String.valueOf(rs.getBoolean(3)));
                this.setAddress(rs.getString(4));
                this.setBirthdate(String.valueOf(rs.getDate(5)));
                this.setPhonenumber(rs.getString(6));
                this.setGmail(rs.getString(7));
                this.setLop(rs.getString(10));
            }
        } catch (Exception e) {
            System.out.println(" getStudentbyAccount:" + e.getMessage());
        }
    }

    public void getStudentbySid() {
        try {
            String strSQL = "select s.*, c.classname from sinhvien s join class c on s.class = c.classId "
                    + "where studentId=? ";
            stm = cnn.prepareStatement(strSQL);
            stm.setString(1, gmail);
//            rs = stm.executeQuery(strSQL);
            rs = stm.executeQuery();
            while (rs.next()) {
                this.setStudentid(rs.getString(1));
                this.setName(rs.getString(2));
                this.setGender(String.valueOf(rs.getBoolean(3)));
                this.setAddress(rs.getString(4));
                this.setBirthdate(String.valueOf(rs.getDate(5)));
                this.setPhonenumber(rs.getString(6));
                this.setGmail(rs.getString(7));
                this.setLop(rs.getString(10));
            }
        } catch (Exception e) {
            System.out.println(" getStudentbyAccount:" + e.getMessage());
        }
    }
}
