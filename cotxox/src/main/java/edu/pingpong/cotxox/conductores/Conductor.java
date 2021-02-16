package edu.pingpong.cotxox.conductores;

import java.util.ArrayList;

public class Conductor{

    private String nombre = null;
    private String modelo = null;
    private String matricula = null;
    private double valoracionMedia = 0d;
    private boolean ocupado = false;
    private ArrayList<Byte> valoraciones = new ArrayList<>();

    public Conductor(){};
    public Conductor(String conductor){

    }
    public String getNombre(){
        return "";
    }
    public String getModelo(){
        return "";
    }
    public void setModelo(String nuevoModelo){

    }
    public String getMatricula(){
        return "";
    }
    public void setMatricula(String nuevaMatricula){

    }
    public double getValoracion(){
        return 3;
    }
    public int getNumeroValoraciones(){
        return 3;
    }
    public void setValoracion(byte nuevaValoracion){

    }
    private double calcularValoracionMedia(){
        return 4;
    }
    public void setOcupado(boolean estado){

    }
    public boolean isOcupado(){
        return true;
    }

}