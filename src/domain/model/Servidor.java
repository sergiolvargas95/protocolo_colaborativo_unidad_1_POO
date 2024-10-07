//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package domain.model;

public class Servidor {
    private int id;
    private String nombre;
    private String direccionIp;

    public Servidor() {
    }

    public Servidor(int id, String nombre, String direccionIp) {
        this.id = id;
        this.nombre = nombre;
        this.direccionIp = direccionIp;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionIp() {
        return this.direccionIp;
    }

    public void setDireccionIp(String direccionIp) {
        this.direccionIp = direccionIp;
    }

    public String toString() {
        return "Servidor {id=" + this.id + ", nombre='" + this.nombre + "', direccionIp='" + this.direccionIp + "'}";
    }
}
