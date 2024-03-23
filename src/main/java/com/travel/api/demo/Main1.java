package com.travel.api.demo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String json = "[{\"row_data\":\"0,TO,25,0,0,0,0,0,3.78,0,4.76,0,5.86\"},{\"row_data\":\"26,TO,35,0,0,0,0,0,4.31,0,5.43,0,6.68\"},{\"row_data\":\"36,TO,40,0,0,0,0,0,4.31,0,5.43,0,6.68\"},{\"row_data\":\"41,TO,54,0,0,0,0,0,5.38,0,6.78,0,8.34\"},{\"row_data\":\"55,TO,59,0,0,0,0,0,5.38,0,6.78,0,8.34\"},{\"row_data\":\"60,TO,64,0,0,0,0,0,6.42,0,6.78,0,9.95\"},{\"row_data\":\"65,TO,69,0,0,0,0,0,8.22,0,10.36,0,12.74\"},{\"row_data\":\"70,TO,74,0,0,0,0,0,0,0,0,0,0\"},{\"row_data\":\"75,TO,79,0,0,0,0,0,0,0,0,0,0\"},{\"row_data\":\"80,TO,84,0,0,0,0,0,0,0,0,0,0\"},{\"row_data\":\"85,TO,89,0,0,0,0,0,0,0,0,0,0\"}]";

	        try {
	            JSONArray jsonArray = new JSONArray(json);
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
	                System.out.println("Start Age: " + startAge);
	                System.out.println("End Age: " + endAge);
	                System.out.println("Values: " + java.util.Arrays.toString(values));
	                System.out.println();
	            }
	        } catch (JSONException e) {
	            e.printStackTrace();
	        }
	}

}
