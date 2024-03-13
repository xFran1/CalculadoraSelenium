package main1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class Examen2e {
    private String nombreAsignatura;
    private String fecha;
    private String unidad;
    private String nombreYApellidos;
    private double nota1;
    private double nota2;
    private double ponderacionNota1;
    private double ponderacionNota2;
    private double notaSuperacion;

    public Examen2e(String nombreAsignatura, String fecha, String unidad, String nombreYApellidos, double nota1, double nota2, double ponderacionNota1, double ponderacionNota2, double notaSuperacion) {
        this.nombreAsignatura = nombreAsignatura;
        this.fecha = fecha;
        this.unidad = unidad;
        this.nombreYApellidos = nombreYApellidos;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.ponderacionNota1 = ponderacionNota1;
        this.ponderacionNota2 = ponderacionNota2;
        this.notaSuperacion = notaSuperacion;
    }

    //Metodos
    
    public Double notaExamen(){
        double notaExamen = 0 ;
        double nota1Ponderada = 0;
        double nota2Ponderada = 0;
        
        nota1Ponderada = nota1*ponderacionNota1;
        nota2Ponderada = nota2*ponderacionNota2;
        
        notaExamen=nota1Ponderada+nota2Ponderada;
        
        return notaExamen;
        
    } 
    
    public boolean superado(){
        Double notaExamen = notaExamen();
        
        if(notaExamen>=this.notaSuperacion){
            return true;
        }else{
            return false;
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getNombreYApellidos() {
        return nombreYApellidos;
    }

    public void setNombreYApellidos(String nombreYApellidos) {
        this.nombreYApellidos = nombreYApellidos;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getPonderacionNota1() {
        return ponderacionNota1;
    }

    public void setPonderacionNota1(double ponderacionNota1) {
        this.ponderacionNota1 = ponderacionNota1;
    }

    public double getPonderacionNota2() {
        return ponderacionNota2;
    }

    public void setPonderacionNota2(double ponderacionNota2) {
        this.ponderacionNota2 = ponderacionNota2;
    }

    public double getNotaSuperacion() {
        return notaSuperacion;
    }

    public void setNotaSuperacion(double notaSuperacion) {
        this.notaSuperacion = notaSuperacion;
    }
    
    
    
    
}
