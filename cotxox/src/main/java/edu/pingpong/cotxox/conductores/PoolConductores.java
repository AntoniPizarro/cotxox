package edu.pingpong.cotxox.conductores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PoolConductores {

    private List<Conductor> poolConductores = new ArrayList<Conductor>();
    
    public PoolConductores(List<Conductor> poolConductores) {
		
	}
    public List<Conductor> getPoolConductores() {
        return poolConductores;
	}
    public Conductor asignarConductor() {
        return new Conductor("Roberta");
    }

}