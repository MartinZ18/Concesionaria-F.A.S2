
package Fundamentos.de.Analisis.de.Sistemas.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "modelos") // Define explícitamente el nombre de la tabla en la base de datos como "modelos"
public class Modelo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String version;
    private String carroceria;
    private String motor;
    private String transmision;
    private int cantPuertas;

    public Modelo() {
    }
    // Constructor con parámetros para inicializar un objeto Modelo con atributos dados
    public Modelo(String nombre, String version, String carroceria, String motor, String transmision, int cantPuertas) {
        this.nombre = nombre;
        this.version = version;
        this.carroceria = carroceria;
        this.motor = motor;
        this.transmision = transmision;
        this.cantPuertas = cantPuertas;
    }
    // Métodos getters y setters para acceder y modificar cada campo
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
    
    /*
     * Método toString sobrescrito para representar el objeto Modelo
     * como una cadena de texto con todos sus atributos principales.
     */
    @Override
    public String toString() {
        return "Modelo{" + "id=" + id + ", nombre=" + nombre + ", version=" + version + ", carroceria=" + carroceria + ", motor=" + motor + ", transmision=" + transmision + ", cantPuertas=" + cantPuertas + '}';
    }
    
    
    
}
