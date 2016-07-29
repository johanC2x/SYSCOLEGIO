/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Date;

/**
 *
 * @author EDWARD
 */
public class Alumno {
    private int idalumno;
    private String nombres;
    private String apellidos;
    private String dni;
    private String sexo;
    private Date fechanac;
    private String nompadre,nommadre,nomapoderado,telefono,celular,direccion,distrito,estado;

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNompadre() {
        return nompadre;
    }

    public void setNompadre(String nompadre) {
        this.nompadre = nompadre;
    }

    public String getNommadre() {
        return nommadre;
    }

    public void setNommadre(String nommadre) {
        this.nommadre = nommadre;
    }

    public String getNomapoderado() {
        return nomapoderado;
    }

    public void setNomapoderado(String nomapoderado) {
        this.nomapoderado = nomapoderado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Alumno() {
    }

    public Alumno(int idalumno, String nombres, String apellidos, String dni, String sexo, Date fechanac, String nompadre,String nommadre, String nomapoderado, String telefono, String celular, String direccion, String distrito, String estado) {
        this.idalumno = idalumno;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.sexo = sexo;
        this.fechanac = fechanac;
        this.nompadre = nompadre;
        this.nommadre=nommadre;
        this.nomapoderado = nomapoderado;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.distrito = distrito;
        this.estado = estado;
    }
    public String[] DatostoArray()
    {
        String[] lista= new String[14];
        lista[0]=String.valueOf(idalumno);
        lista[1]=nombres;
        lista[2]=apellidos;
        lista[3]=dni;
        lista[4]=sexo;
        lista[5]=Formatos.sdtfecha.format(fechanac);
        lista[6]=nompadre;
        lista[7]=nommadre;
        lista[8]=nomapoderado;
        lista[9]=telefono;
        lista[10]=celular;
        lista[11]=direccion;
        lista[12]=distrito;
        lista[13]=estado;
        return lista;
    }
    
    
    
}
