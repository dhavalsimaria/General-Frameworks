/**
 * 
 */
package com.dhaval.general;

import java.io.File;

/**
 * @author a611021
 *
 */
public class CreateSudoDir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String user = "A611021:Dhs_mar17";
		//NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(user);
		File file = new File("C:/Users/A611021/jdbc-jdbc");
        if(!file.exists()){
            if (file.mkdirs()) {
                System.out.println("Directory is created!");
            } 
            else{
                System.out.println("Failed to create directory!");
            }
        } else{
        	System.out.println("File exists!");
        }

	}

}
