package models;

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
    
    
}
