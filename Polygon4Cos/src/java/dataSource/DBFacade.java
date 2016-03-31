/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import domain.Building;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author
 */
public class DBFacade {

    private Mapper map;
    private Connection con;

    // Singleton start
    private static DBFacade instance;

    private DBFacade() {
        map = new Mapper();
        con = DBConnector.getInstance().getConnection();
    }

    public static DBFacade getInstance() {
        if (instance == null) {
            instance = new DBFacade();
        }
        return instance;
    }
    // Singleton end

    public boolean createBuilding(Building p) {

        return map.createBuilding(p, con);
    }

//    public List<Building> showBuildings() {
//        return map.showBuildings(con);
//    }
//
//    public boolean createGoal(Goal g) {
//
//        return map.createGoal(g, con);
//    }
//
//    public boolean createMatch(Match match) {
//        return map.createMatch(match, con);
//    }
//
//    public boolean deleteGoal(Goal g) {
//        return map.deleteGoal(g, con);
//    }
}
