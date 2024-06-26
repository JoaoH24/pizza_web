package models;

import com.luigiyoshi.pizza_web.resources.conexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author joao
 */
public class modelCliente {
    String nombreApellido;
    String DNI;
    String email;
    String telefono;

    public modelCliente(String nombreApellido, String DNI, String email, String telefono) {
        this.nombreApellido = nombreApellido;
        this.DNI = DNI;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    /* SELECT query */
    public static void verClientes(/*String nombreApellido, String DNI, String email, String telefono*/) throws SQLException {
        conexionMySQL SQL = new conexionMySQL();
        Connection conec = SQL.conectMySQL();
        
        String query = "SELECT * FROM cliente;";
        PreparedStatement myStmt = conec.prepareStatement(query);
        
        ResultSet myResponse = myStmt.executeQuery();
        
        System.out.println("ID \t Cliente \t Email \t Teléfono \t Dirección");
        while (myResponse.next()) {
            System.out.println(myResponse.getString("id_cliente") + "\t" +myResponse.getString("nombre") + "\t" + myResponse.getString("email") + "\t" + myResponse.getString("telefono") + "\t" + myResponse.getString("direccion"));
        }
    }

    /* INSERT query */
    public static void crearCliente(String nombreApellido, String email, int telefono, String direccion) throws SQLException {
        conexionMySQL SQL = new conexionMySQL();
        Connection conec = SQL.conectMySQL();
        
        String query = "INSERT INTO cliente (nombre, email, telefono, direccion) VALUES (?,?,?,?);";
        PreparedStatement myStmt = conec.prepareStatement(query);
        myStmt.setString(1, nombreApellido);
        myStmt.setString(2, email);
        myStmt.setInt(3, telefono);
        myStmt.setString(4, direccion);
        
        myStmt.executeUpdate();
    }
}
