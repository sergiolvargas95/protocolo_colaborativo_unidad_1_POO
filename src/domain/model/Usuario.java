// Source code is decompiled from a .class file using FernFlower decompiler.
package domain.model;

import java.time.LocalDate;
import java.util.List;

public class Usuario {
   private int id;
   private String nombre;
   private String apellido;
   private String correo;
   private String contrasena;
   private LocalDate fechaNacimiento;
   private List<Libro> librosDescargados;

   public Usuario() {
   }

   public Usuario(int id, String nombre, String apellido, String correo, String contrasena, LocalDate fechaNacimiento, List<Libro> librosDescargados) {
      this.id = id;
      this.nombre = nombre;
      this.apellido = apellido;
      this.correo = correo;
      this.contrasena = contrasena;
      this.fechaNacimiento = fechaNacimiento;
      this.librosDescargados = librosDescargados;
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

   public String getApellido() {
      return this.apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   public String getCorreo() {
      return this.correo;
   }

   public void setCorreo(String correo) {
      this.correo = correo;
   }

   public String getContrasena() {
      return this.contrasena;
   }

   public void setContrasena(String contrasena) {
      this.contrasena = contrasena;
   }

   public LocalDate getFechaNacimiento() {
      return this.fechaNacimiento;
   }

   public void setFechaNacimiento(LocalDate fechaNacimiento) {
      this.fechaNacimiento = fechaNacimiento;
   }

   public List<Libro> getLibrosDescargados() {
      return this.librosDescargados;
   }

   public void setLibrosDescargados(List<Libro> librosDescargados) {
      this.librosDescargados = librosDescargados;
   }

   public String toString() {
      return "Usuario{id=" + this.id + ", nombre='" + this.nombre + "', apellido='" + this.apellido + "', correo='" + this.correo + "', contrasena='" + this.contrasena + "', fechaNacimiento=" + this.fechaNacimiento + ", librosDescargados=" + this.librosDescargados + "}";
   }
}
