package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
    public static void main(String[] args) {
        String jdbcUrl="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
        String user="hbstudent";
        String pass="Upendra1@+";
        try{
            System.out.println("connecting to database"+jdbcUrl);
            Connection myConn= DriverManager.getConnection(jdbcUrl,user,pass);
            System.out.println("sucesss");
        }
        catch (Exception e){
         e.printStackTrace();
        }
    }
}
