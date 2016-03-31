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
 * @author Minerva
 */
public class DBFacade {
          private Mapper map; 
	  private Connection con;
	  
	  // Singleton start
	  private static DBFacade instance;
	 
	  private DBFacade() {
		  map 	= new Mapper();
		  con 	= DBConnector.getInstance().getConnection();  		  
	  }
	  public static DBFacade getInstance()
	  {
		  if(instance == null)
			  instance = new DBFacade();
		  return instance;
	  }
	  // Singleton end

	  public boolean createPlayer(Building p){

              return map.createPlayer(p, con);
          }
          
 
           
           public List<Building> showPlayers() 
	  {
		  return map.showPlayers2(con);	      
	  }
           


	
}
