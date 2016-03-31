/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import dataSource.DBFacade;
import java.util.List;

public class DomainFacade {

    private Building newBuilding;
    private DBFacade dbf;

    private DomainFacade() {
        newBuilding = null;
        dbf = DBFacade.getInstance();
    }

    public static DomainFacade getInstance() {
        return new DomainFacade();
    }
    //----------------------

    public Building createBuilding(String name, String address, int customerID, double size) {
        newBuilding = new Building(name, address, customerID, size);

        boolean status = dbf.createBuilding(newBuilding);
        if (!status) {
            newBuilding = null;
        }

        return newBuilding;
    }

//     public List<Building> showBuildings(){
//        List <Building> allBuildings = dbf.showBuildings();
//        return allBuildings;
//}
}
