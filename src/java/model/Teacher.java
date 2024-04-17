/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class Teacher extends DBContext {

    String teacherid, teachername, gender, address, birthdate,password, phonenumber, gmail;

    public Teacher() {
        connectDB();
    }

    public Teacher( String gmail, String password) {
        this.password = password;
        this.gmail = gmail;
        connectDB();
    }

    public Teacher(String teacherid, String teachername, String gender, String address, String birthdate, String phonenumber, String gmail) {
        this.teacherid = teacherid;
        this.teachername = teachername;
        this.gender = gender;
        this.address = address;
        this.birthdate = birthdate;
        this.phonenumber = phonenumber;
        this.gmail = gmail;
        connectDB();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
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

    public boolean checkTeacher() {
        try {
            String strSQL = "select * from giangvien "
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
            System.out.println(" checkTeacher:" + e.getMessage());
        }
        return false;
    }

    public void getTeacherbyAccount() {
        try {
            String strSQL = "select * from giangvien "
                    + "where gmail=? ";
            stm = cnn.prepareStatement(strSQL);
            stm.setString(1, gmail);
//            rs = stm.executeQuery(strSQL);
            rs = stm.executeQuery();
            while (rs.next()) {
                this.setTeacherid(rs.getString(1));
                this.setTeachername(rs.getString(2));
                this.setGender(String.valueOf(rs.getBoolean(3)));
                this.setAddress(rs.getString(4));
                this.setBirthdate(String.valueOf(rs.getDate(5)));
                this.setPassword(rs.getString(6));
                this.setPhonenumber(rs.getString(7));
                this.setGmail(rs.getString(8));
            }
        } catch (Exception e) {
            System.out.println(" getTeacherbyAccount:" + e.getMessage());
        }
    }
}
