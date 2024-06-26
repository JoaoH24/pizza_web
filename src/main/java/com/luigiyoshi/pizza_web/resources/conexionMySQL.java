package com.luigiyoshi.pizza_web.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import  java.sql.SQLException;

/**
 *
 * @author Joao
 */
public class conexionMySQL {
    public String driver = "com.mysql.cj.jdbc.Driver";
    public String nameDatabase = "proyectopoo_pizzas";
    public String hostname = "localhost";
    public String port = "3306";
    public String username = "root";
    public String password = "joa24sil";
    
    public String url = "jdbc:mysql://" + hostname + ":" + port +"/" + nameDatabase;
    
    public Connection conectMySQL() {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    
}

/*
* String qSql = "SELECT * FROM cliente";
*
*

// Instancias la clase que hemos creado anteriormente
private ConexionMySQL SQL = new ConexionMySQL();
// Llamas al método que tiene la clase y te devuelve una conexión
private Connection conn = SQL.conectarMySQL();
// Query que usarás para hacer lo que necesites
private String sSQL =   "";

// Query
sSQL =  "INSERT INTO USERS (first_name, last_name) VALUES (?, ?)";
// PreparedStatement
PreparedStatement pstm = conn.prepareStatement(sSQL);

        String query = "insert into Students values(?,?)";
 
        // Prepare Statement
        PreparedStatement myStmt
            = con.prepareStatement(query);
 
        // Set Parameters
        myStmt.setInt(1, 21);
        myStmt.setString(2, 'Prajjwal');

        myStmt.setInt(1, 20);
        myStmt.setString(2, 'Prateek');
 
        // Execute SQL query
        ResultSet myRs = myStmt.executeQuery();
 
        System.out.println('Age      Name');
 
        // Display function to show the Resultset
        while (myRs.next()) {
            String Name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println(Name + "     " + age);
        }
*/
