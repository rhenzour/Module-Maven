package tn.insat.gl4;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;



public class App 
{
	 // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost:3306/BanqueDB";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "password";
	   
	   private static Logger logger = Logger.getLogger(App.class.getName());  
	   
    public static void main( String[] args )
    {
    	    
        	
//         Log4j logging levels    
//        	TRACE,
//        	DEBUG,
//        	INFO,
//        	WARN,
//        	ERROR and
//        	FATAL    	
        	  	
          //  logger.log(Level.INFO,  "Mon message LOG : Hello World!" );
        	// logger.info("Mon message LOG : Hello World!" );
    	  Connection conn = null;
    	   Statement stmt = null;
    	   try{
    	      //STEP 2: Register JDBC driver
    	      Class.forName("com.mysql.jdbc.Driver");

    	      //STEP 3: Open a connection
    	      logger.info("Connecting to database...");
    	      conn = DriverManager.getConnection(DB_URL,USER,PASS);

    	      //STEP 4: Execute a query
    	      logger.info("Creating statement...");
    	      stmt = conn.createStatement();
    	      String sql;
    	      sql = "SELECT * FROM Comptes";
    	      ResultSet rs = stmt.executeQuery(sql);

    	      //STEP 5: Extract data from result set
    	      while(rs.next()){
    	         //Retrieve by column name
    	         String numero  = rs.getString("numero");
    	         String proprio = rs.getString("proprietaire");
    	         BigDecimal solde = rs.getBigDecimal("solde");    	  

    	         //Display values
    	         System.out.print("===> Numero : " + numero);
    	         System.out.print(", Proprietaire: " + proprio);
    	         System.out.println(", Solde: " + solde);
    	        
    	       
    	      }
    	      logger.info("SQL Statement has been run successfully.");
    	      //STEP 6: Clean-up environment
    	      rs.close();
    	      stmt.close();
    	      conn.close();
    	   }catch(SQLException se){
    		   logger.error(se.getMessage());
    	   }catch(Exception e){
    	      //Handle errors for Class.forName
    		   logger.error(e.getMessage());
    	    
    	   }finally{
    	      //finally block used to close resources
    	      try{
    	         if(stmt!=null)
    	            stmt.close();
    	      }catch(SQLException se2){
    	      }// nothing we can do
    	      try{
    	         if(conn!=null)
    	            conn.close();
    	      }catch(SQLException se){
    	    	  logger.error(se.getMessage());
    	      }//end finally try
    	   }//end try
    	   logger.info("Fin du programme !");
    	
    }//end main
}
    	   
