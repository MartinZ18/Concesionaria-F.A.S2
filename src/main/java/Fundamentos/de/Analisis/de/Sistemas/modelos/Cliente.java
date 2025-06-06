
package Fundamentos.de.Analisis.de.Sistemas.modelos;



import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Basic // Anotación estándar para columnas básicas (implícita, se puede omitir)
    private String nombre;
    private String apellido;
    private String  telefono;
    private Integer dni;
    private String calle;
    private String  numeroCalle;
    private String correoElectronico;
    
    @Temporal(TemporalType.DATE) // Indica que el campo se almacena solo con fecha (sin hora
    private LocalDate fechaNacimiento; // Fecha de nacimiento del client
    // Constructor vacío requerido por JPA
    public Cliente() {
    }

    // Constructor con parámetros para inicializar un objeto Cliente
    public Cliente(int DNI, String nombre, String Apellido, String  Telefono, String calle, String  NumeroCalle, String CorreoElectronico, LocalDate FechaNacimiento) {
        this.dni = DNI;
        this.nombre = nombre;
        this.apellido = Apellido;
        this.telefono = Telefono;
        this.calle = calle;
        this.numeroCalle = NumeroCalle;
        this.correoElectronico = CorreoElectronico;
        this.fechaNacimiento = FechaNacimiento;
    }
    // Getters y setters para acceder y modificar los atributos de la clas
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }


    public String  getTelefono() {
        return telefono;
    }

    public void setTelefono(String  Telefono) {
        this.telefono = Telefono;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String  getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(String  NumeroCalle) {
        this.numeroCalle = NumeroCalle;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.correoElectronico = CorreoElectronico;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.fechaNacimiento = FechaNacimiento;
    }
    
    
}


