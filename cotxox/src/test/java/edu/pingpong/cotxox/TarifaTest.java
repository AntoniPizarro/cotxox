package edu.pingpong.cotxox;

import static org.junit.Assert.*;

import edu.pingpong.cotxox.carrera.Carrera;
import edu.pingpong.cotxox.tarifa.Tarifa;
import org.junit.Test;

public class TarifaTest{

    @Test
	public void getCosteDistanciaTest() {
        System.out.println("Test \"getCosteDistancia\"");
		double distancia;
        double estimado;
        double delta = 0.01;

        distancia = 14.6;
        estimado = 19.71;
        assertEquals(estimado, Tarifa.getCosteDistancia(distancia), delta);
        System.out.println("Test Pasado!");

        distancia = 9375.2784;
        estimado = 12656.62584;
        assertEquals(estimado, Tarifa.getCosteDistancia(distancia), delta);
        System.out.println("Test Pasado!");

        distancia = 0.0000009;
        estimado = 0.000001215;
        assertEquals(estimado, Tarifa.getCosteDistancia(distancia), delta);
        System.out.println("Test Pasado!");

        distancia = 8.56;
        estimado = 11.556;
        assertEquals(estimado, Tarifa.getCosteDistancia(distancia), delta);
        System.out.println("Test Pasado!");
	}
    @Test
    public void getCosteTiempoTest() {
        System.out.println("Test \"getCosteTiempo\"");
        int tiempo;
        double estimado;
        double delta = 0.01;

        tiempo = 10;
        estimado = 3.5;
        assertEquals(estimado, Tarifa.getCosteTiempo(tiempo), delta);
        System.out.println("Test Pasado!");

        tiempo = 116;
        estimado = 40.6;
        assertEquals(estimado, Tarifa.getCosteTiempo(tiempo), delta);
        System.out.println("Test Pasado!");

        tiempo = 95;
        estimado = 33.25;
        assertEquals(estimado, Tarifa.getCosteTiempo(tiempo), delta);
        System.out.println("Test Pasado!");

        tiempo = 8;
        estimado = 2.8;
        assertEquals(estimado, Tarifa.getCosteTiempo(tiempo), delta);
        System.out.println("Test Pasado!");
    }
    @Test
    public void getCosteTotalEsperadoTest() {
        System.out.println("Test \"getCosteTotalEsperado\"");
        Carrera carrera = new Carrera("8786543214567");
        
        int tiempo;
        double distancia;
        double estimado;
        double delta = 0.01;

        tiempo = 10;
        distancia = 35.98;
        estimado = 10 * 0.35 + 35.98 * 1.35;

        carrera.setDistancia(distancia);
        carrera.setTiempoEsperado(tiempo);

        assertEquals(estimado, Tarifa.getCosteTotalEsperado(carrera), delta);
        System.out.println("Test Pasado!");

        tiempo = 58;
        distancia = 9.23;
        estimado = 58 * 0.35 + 9.23 * 1.35;

        carrera.setDistancia(distancia);
        carrera.setTiempoEsperado(tiempo);
        
        assertEquals(estimado, Tarifa.getCosteTotalEsperado(carrera), delta);
        System.out.println("Test Pasado!");

        tiempo = 45;
        distancia = 5.23;
        estimado = 45 * 0.35 + 5.23 * 1.35;

        carrera.setDistancia(distancia);
        carrera.setTiempoEsperado(tiempo);
        
        assertEquals(estimado, Tarifa.getCosteTotalEsperado(carrera), delta);
        System.out.println("Test Pasado!");

    }

}