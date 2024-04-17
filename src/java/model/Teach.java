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
public class Teach extends DBContext {

    String id, teacherid, classid, subid, studentid;

    public Teach() {
    }

    public Teach(String id, String teacherid, String classid, String subid, String studentid) {
        this.id = id;
        this.teacherid = teacherid;
        this.classid = classid;
        this.subid = subid;
        this.studentid = studentid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getSubid() {
        return subid;
    }

    public void setSubid(String subid) {
        this.subid = subid;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
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

}
