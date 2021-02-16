package edu.pingpong.cotxox.carrera;

import edu.pingpong.cotxox.conductores.Conductor;
import edu.pingpong.cotxox.conductores.PoolConductores;
import edu.pingpong.cotxox.tarifa.Tarifa;

public class Carrera {

    private String targetaCredito = null;
    private String origen = null;
    private String destino = null;
    private double distancia = 0;
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0;
    private int propina = 0;

    Conductor conductor = new Conductor();

    public Carrera(String targeta) {
        this.targetaCredito = targeta;
    }
    public String getTarjetaCredito() {
        return targetaCredito;
    }
    public void setOrigen(String nuevoOrigen) {
        this.origen = nuevoOrigen;
    }
    public String getOrigen() {
        return this.origen;
    }
    public void setDestino(String nuevoDestino) {
        this.destino = nuevoDestino;
    }
    public String getDestino() {
        return this.destino;
    }
    public void setDistancia(double nuevaDistancia) {
        this.distancia = nuevaDistancia;
    }
    public double getDistancia() {
        return this.distancia;
    }
    public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(this); //Copiado de David :(
    }
    public int getTiempoEsperado() {
        return this.tiempoEsperado;
    }
    public void setTiempoEsperado(int nuevoTiempoEsperado) {
        this.tiempoEsperado = nuevoTiempoEsperado;
    }
    public int getTiempoCarrera() {
        return this.tiempoCarrera;
    }
    public void setTiempoCarrera(int nuevoTiempoCarrera) {
        this.tiempoCarrera = nuevoTiempoCarrera;
    }
    public void setConductor(Conductor nuevoConductor) {
        conductor = nuevoConductor;
    }
    public Conductor getConductor() {
        return conductor;
    }
    public void asignarConductor(PoolConductores conductores) {
        setConductor(conductores.asignarConductor());
    }
    public void realizarPago(double importe) {

    }
    public double getCosteTotal(){
        return this.costeTotal;
    }
    public void recibirPropina(int propina) {

    }
    public int getPropina() {
        return this.propina;
    }
    public void liberarConductor() {
        
    }

}