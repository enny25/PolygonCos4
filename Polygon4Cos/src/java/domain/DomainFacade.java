/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import dataSource.DBFacade;
import java.util.List;

/**
 *
 * @author Minerva
 */
public class DomainFacade {
    private Building newBuilding;       
    private DBFacade dbf;
 
    private DomainFacade()
    {
        newBuilding = null;       
        dbf = DBFacade.getInstance();
    }

    public static DomainFacade getInstance()
    {
         return new DomainFacade();
    }
    //----------------------

    public Building createBuilding(String name, String address, int buildingID, double size )
    {
        newBuilding = new Building(name, address, buildingID, size);

        boolean status = dbf.createPlayer(newBuilding);
        if (!status)
        {
            newBuilding = null;
        }

        return newBuilding;
    }
    
   
    
     
    
     
     public List<Building> showBuildings(){
        List <Building> allBuildings = dbf.showPlayers();
        return allBuildings;
    }
     
         
}