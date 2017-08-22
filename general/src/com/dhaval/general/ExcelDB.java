/**
 * 
 */
package com.dhaval.general;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author DhavalSimaria
 *
 */
public class ExcelDB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {

	        Fillo fillo = new Fillo();
	        Connection connection = fillo
	                .getConnection("E:\\Projects\\POC\\Documents\\Optima\\Docs\\Optima_Other.xlsx");
	        String strQuery = "Select * from Optima_Data where Property='Holiday Inn Express London - Wandsworth'";
	        Recordset recordset = connection.executeQuery(strQuery);
	        while (recordset.next()) {
	            System.out.println(recordset.getField("Rate"));
	        }
	    } catch (FilloException e) {
	        System.out.println(e.getMessage());
	    }
		
		
		
		/*try {
	        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	        Connection conn = DriverManager
	                .getConnection("jdbc:odbc:Driver={Microsoft Excel Driver (*.xls, *.xlsx, *.xlsm, *.xlsb)};"
	                        + "Dbq=E:\\Projects\\POC\\Documents\\Optima\\Docs\\Optima_Data.xlsm;");

	        Statement stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery("SELECT SN,IR FROM [Sheet1$]");

	        if (rs != null) {
	            while (rs.next()) {
	                System.out.println(rs.getInt("AllTXN_Issued"));
	            }
	        }
	        rs.close();

	        conn.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }*/

	}

}
