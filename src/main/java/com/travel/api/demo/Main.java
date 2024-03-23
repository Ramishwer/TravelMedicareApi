package com.travel.api.demo;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Main {
	
//	@Autowired
//	InsuranceRepository insRepository;
	
    public static void main(String[] args) {
        String data = "[{\"row_data\":\"0,TO,25,1.41,1.89,1.67,2.23,2.17,2.90\"},{\"row_data\":\"26,TO,35,1.61,2.15,1.91,2.54,2.48,3.30\"},{\"row_data\":\"36,TO,40,1.61,2.15,1.91,2.54,2.48,3.30\"},{\"row_data\":\"41,TO,54,2.01,2.68,2.38,3.17,3.09,4.12\"},{\"row_data\":\"55,TO,59,2.01,2.68,2.38,3.17,3.09,4.12\"},{\"row_data\":\"60,TO,64,2.40,3.20,2.84,3.79,3.69,4.92\"},{\"row_data\":\"65,TO,69,3.07,4.10,3.64,4.85,4.73,6.30\"},{\"row_data\":\"70,TO,74,4.24,5.65,5.02,6.69,6.52,8.69\"},{\"row_data\":\"75,TO,79,5.27,7.03,6.24,8.32,8.11,10.81\"},{\"row_data\":\"80,TO,84,8.61,11.48,10.20,13.60,13.25,17.66\"},{\"row_data\":\"85,TO,89,11.37,0,13.47,0,17.49,0\"}]";
//        InsuranceEntity insuranceEntity= new InsuranceEntity();
//        insuranceEntity= 
        LocalDate startDate = LocalDate.of(2024, 3, 21);
        LocalDate endDate = LocalDate.of(2024, 7, 20);
        LocalDate dob = LocalDate.of(1965, 5, 24);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Number Of Days= "+daysBetween);
        Scanner sc = new Scanner(System.in);
        int sumissured=sc.nextInt();
     // Get current date
        LocalDate currentDate = LocalDate.now();

        // Calculate period between DOB and current date
        Period period = Period.between(dob, currentDate);
        int age= period.getYears();
        // Return years from the period
        System.out.println("age ="+ period.getYears());

        
        JSONArray jsonArray = new JSONArray(data);
        double perDayPricePreExisting=0;
        double perDayPriceWithoutPreExisting=0;
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String rowData = jsonObject.getString("row_data");
            String[] rowDataArray = rowData.split(",");

            int startAge = Integer.parseInt(rowDataArray[0]);
            int endAge = Integer.parseInt(rowDataArray[2]);
            double[] values = new double[rowDataArray.length - 3];
            for (int j = 0; j < values.length; j++) {
                values[j] = Double.parseDouble(rowDataArray[j + 3]);
            }
            if(age>startAge&&age<endAge)
            {
            	if(sumissured==25000)
            	{
            		perDayPricePreExisting=values[1];
            		perDayPriceWithoutPreExisting=values[0];
            		break;
            	}
            	else if(sumissured==50000)
            	{
            		perDayPricePreExisting=values[3];
            		perDayPriceWithoutPreExisting=values[2];
            		break;
            	}
            	else if(sumissured==100000)
            	{
            		perDayPricePreExisting=values[5];
            		perDayPriceWithoutPreExisting=values[4];
            		break;
            	}
            	else {
            		System.out.println("Please Select correct amount");
            	}
            }
//            System.out.println("Start Age: " + startAge);
//            System.out.println("End Age: " + endAge);
//            System.out.println("Values: " + java.util.Arrays.toString(values));
//            System.out.println("Price Of Pre Existing" +perDayPricePreExisting*daysBetween);
//            System.out.println("Price Of Without Pre Existing" +perDayPriceWithoutPreExisting*daysBetween);
            System.out.println();
        }
        System.out.println("Price Of Pre Existing" +perDayPricePreExisting*daysBetween);
        System.out.println("Price Of Without Pre Existing" +perDayPriceWithoutPreExisting*daysBetween);
        
    }
}

