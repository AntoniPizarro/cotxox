package edu.pingpong.cotxox;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.awt.List;

import edu.pingpong.cotxox.carrera.Carrera;
import edu.pingpong.cotxox.conductores.Conductor;
import edu.pingpong.cotxox.conductores.PoolConductores;
import edu.pingpong.cotxox.tarifa.Tarifa;
import org.junit.Test;

public class CarreraTest {

    @Test
    public void getTarjetaCreditoTest() {
        System.out.println("Test \"getTargetaCredito\"");
        String tarjeta;
        
        tarjeta = "4675-8987-0945-7465";
        Carrera carrera = new Carrera(tarjeta);

        assertEquals(tarjeta, carrera.getTarjetaCredito());
        System.out.println("Test Pasado!");
    }
    @Test
    public void setOrigenTest() {
        System.out.println("Test \"setOrigen\"");
        String origen;

        origen = "Mi casa";
        Carrera carrera = new Carrera("4675-8987-0945-7465");
        carrera.setOrigen(origen);

        assertEquals(origen, carrera.getOrigen());
        System.out.println("Test Pasado!");
    }
    @Test
    public void setDestinoTest() {
        System.out.println("Test \"setDestino\"");
        String destino;

        destino = "Tu casa";
        Carrera carrera = new Carrera("4675-8987-0945-7465");
        carrera.setDestino(destino);

        assertEquals(destino, carrera.getDestino());
        System.out.println("Test Pasado!");
    }
    @Test
    public void setDistanciaTest() {
        System.out.println("Test \"setDistancia\"");
        double distancia;
        double delta = 0.01;

        distancia = 1234.56789;
        Carrera carrera = new Carrera("4675-8987-0945-7465");
        carrera.setDistancia(distancia);

        assertEquals(distancia, carrera.getDistancia(), delta);
        System.out.println("Test Pasado!");
    }
    @Test
    public void setTiempoEsperadoTest() {
        System.out.println("Test \"setTiempoEsperado\"");
        int tiempo;

        tiempo = 345;
        Carrera carrera = new Carrera("4675-8987-0945-7465");
        carrera.setTiempoEsperado(tiempo);

        assertEquals(tiempo, carrera.getTiempoEsperado());

        tiempo = 677;
        carrera.setTiempoEsperado(tiempo);

        assertEquals(tiempo, carrera.getTiempoEsperado());
        System.out.println("Test Pasado!");
    }
    @Test
    public void setTiempoCarreraTest() {
        System.out.println("Test \"setTiempoCarrera\"");
        int tiempo;

        tiempo = 345;
        Carrera carrera = new Carrera("4675-8987-0945-7465");
        carrera.setTiempoCarrera(tiempo);

        assertEquals(tiempo, carrera.getTiempoCarrera());

        tiempo = 677;
        carrera.setTiempoCarrera(tiempo);

        assertEquals(tiempo, carrera.getTiempoCarrera());
        System.out.println("Test Pasado!");
    }
    @Test
    public void setConductorTest() {
        System.out.println("Test \"setConductor\"");
        Carrera carrera = new Carrera("fgdhbjuyt7");
        Conductor conductor = new Conductor("Federico");

        carrera.setConductor(conductor);
        assertEquals(conductor, carrera.getConductor());
        System.out.println("Test Pasado!");
    }
    @Test
    public void asignarConductorTest() {
        System.out.println("Test \"asignarConductor\"");
        
        Carrera carrera = new Carrera("fhyuj");

        List<Conductor> listaConductores = new ArrayList<Conductor>();
        listaConductores.add(new Conductor("Ramon"));
        listaConductores.add(new Conductor("Juan"));
        listaConductores.add(null);
        listaConductores.add(new Conductor("Elisa"));
        PoolConductores poolConductores = new PoolConductores(listaConductores);

        carrera.asignarConductor(poolConductores);

        Conductor conductor = new Conductor("Roberta");

        //assertEquals();
    }
    @Test
    public void realizarPagoTest() {
        System.out.println("Test \"realizarPago\"");
        
    }
    @Test
    public void recibirPropinaTest() {
        System.out.println("Test \"recibirPropina\"");
        
    }
    @Test
    public void liberarConductorTest() {
        System.out.println("Test \"liberarConductor\"");
        
    }

}