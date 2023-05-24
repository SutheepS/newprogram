package com.insert;

import java.sql.Connection;
import java.sql.Statement;

import com.connect.TableConnect;

public class InsertTable {
	
	public void ins() {
		Connection c = null;
	      Statement stmt = null;
	      
	      TableConnect tc = new TableConnect();
	      c=tc.con();
	      
	      try {
	         
	         stmt = c.createStatement();
//	         String sql = "INSERT INTO schools (ID,NAME,AGE,ADDRESS,SALARY) "
//	            + "VALUES (10, 'Paul', 32, 'California', 20000.00 );";
//	         stmt.executeUpdate(sql);
//
//	         sql = "INSERT INTO schools (ID,NAME,AGE,ADDRESS,SALARY) "
//	            + "VALUES (9, 'Allen', 25, 'Texas', 15000.00 );";
//	         stmt.executeUpdate(sql);
//
	         String sql = "INSERT INTO schools (ID,NAME,AGE,ADDRESS,SALARY) "
	            + "VALUES (4, 'Teddy', 23, 'Norway', 20000.00 );";
	         stmt.executeUpdate(sql);
//
//	         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
//	            + "VALUES (4, 'Mark', 25, 'Rich-Mond ', 65000.00 );";
//	         stmt.executeUpdate(sql);

	         stmt.close();
	         //c.commit();
	         c.close();
	      } catch (Exception e) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Records created successfully");
	}

}
