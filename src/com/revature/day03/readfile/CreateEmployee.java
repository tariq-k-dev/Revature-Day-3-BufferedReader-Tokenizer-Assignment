package com.revature.day03.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CreateEmployee {

	public static void main(String[] args) {
		HashMap<String, Employee> empMap = new HashMap<String, Employee>();
		Employee emp = new Employee();
		ArrayList<String> empFields = new ArrayList<String>();
		
		try {
			BufferedReader br = new BufferedReader( new FileReader("employee_colon_delimited.txt"));
			String strLine = "";
			StringTokenizer st = null;

			while( (strLine = br.readLine()) != null) {
				st = new StringTokenizer(strLine, ":");

				while(st.hasMoreElements()) {
					empFields.add((String) st.nextElement());				
				}
				
				emp.setEmployeeId(empFields.get(0));
				emp.setFirstName(empFields.get(1));
				emp.setLastName(empFields.get(2));
				emp.setRole(empFields.get(3));
				
				// set HashMap values
				empMap.put(empFields.get(0), emp);
				
				// clear ArrayList
				empFields.clear();
				emp = new Employee();
			}
			
			// Close BufferedReader Resource
			br.close();
		}
		catch(Exception e) {
			System.out.println("Exception while reading text file: " + e); 
		}
		
		// Iterate over HashMap
		for (Map.Entry<String, Employee> entry : empMap.entrySet()) {
			Employee empElem = entry.getValue();
			System.out.println(empElem.toString());
		}
		
	}
}
