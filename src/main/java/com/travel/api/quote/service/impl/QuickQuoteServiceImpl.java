package com.travel.api.quote.service.impl;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.api.exceptionHandling.util.FmkException;
import com.travel.api.insurance.entity.InsuranceEntity;
import com.travel.api.insurance.repository.InsuranceRepository;
import com.travel.api.quote.reponse.QuickQuoteResponse;
import com.travel.api.quote.request.InsuredDetailsRequest;
import com.travel.api.quote.request.QuickQuoteRequest;
import com.travel.api.quote.service.QuickQuoteService;

@Service
public class QuickQuoteServiceImpl implements QuickQuoteService{
	
	@Autowired
	InsuranceRepository insureRepository;

	@Override
	public List<QuickQuoteResponse> getQuickQuote(QuickQuoteRequest quickQuoteRequest) throws FmkException {
		// TODO Auto-generated method stub
		long daysBetween = ChronoUnit.DAYS.between(quickQuoteRequest.getPolicyStartDate(), quickQuoteRequest.getPolicyEndDate());
		
		InsuranceEntity insuranceEntity= insureRepository.findById(quickQuoteRequest.getIdPlan()).get();
		
		if(insuranceEntity==null) {
			throw new FmkException("Plan Id Is Invalid");
		}
		
		List<QuickQuoteResponse> quickQuoteResponses= new ArrayList<>();
		
		for (InsuredDetailsRequest insuredDetailsRequest : quickQuoteRequest.getInsuredDetailsRequests()) {
			LocalDate currentDate = LocalDate.now();
			String data= insuranceEntity.getInsurancePlanData();
	        // Calculate period between DOB and current date
	        Period period = Period.between(insuredDetailsRequest.getInsuredDOB(), currentDate);
	        int age= period.getYears();
	        
	        QuickQuoteResponse quickQuoteResponse = new QuickQuoteResponse();
	        if(insuranceEntity.getIdInsurance()==1)
	        {
	        	quickQuoteResponse= calculateAmountforStandardPolicy(data, age, quickQuoteRequest.getSumInsured(),daysBetween);
	        }
	        else if(insuranceEntity.getIdInsurance()==2)
	        {
	        	quickQuoteResponse= calculateAmountforEnhancedPolicy(data, age, quickQuoteRequest.getSumInsured(),daysBetween);
	        }
	        else if(insuranceEntity.getIdInsurance()==3)
	        {
	        	quickQuoteResponse= calculateAmountforPremiumPolicy(data, age, quickQuoteRequest.getSumInsured(),daysBetween);
	        }
	       
	        quickQuoteResponses.add(quickQuoteResponse);
		}
		
		
		return quickQuoteResponses;
	}
	
	private QuickQuoteResponse calculateAmountforPremiumPolicy(String data, int age, int sumInsured, long daysBetween) {
		// TODO Auto-generated method stub
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
            	if(sumInsured==100000)
            	{
            		perDayPricePreExisting=values[5];
            		perDayPriceWithoutPreExisting=values[4];
            		break;
            	}
            	else if(sumInsured==150000)
            	{
            		perDayPricePreExisting=values[7];
            		perDayPriceWithoutPreExisting=values[6];
            		break;
            	}else if(sumInsured==300000)
            	{
            		perDayPricePreExisting=values[9];
            		perDayPriceWithoutPreExisting=values[8];
            		break;
            	}
            	else {
            		System.out.println("Please Select correct amount");
            	}
            }
        }
        QuickQuoteResponse quickQuoteResponse= new QuickQuoteResponse();
        quickQuoteResponse.setCostwithoutPreExisting(perDayPriceWithoutPreExisting*daysBetween);
        quickQuoteResponse.setCostWithPreExisting(perDayPricePreExisting*daysBetween);
        return quickQuoteResponse;
        
	}

	private QuickQuoteResponse calculateAmountforEnhancedPolicy(String data, int age, int sumInsured,
			long daysBetween) throws FmkException {
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
            if(age>70)
            {
            	throw new FmkException("Premimum policy is not available for age 70 and greater");
            }
            if(age>startAge&&age<endAge)
            {
            	 if(age>startAge&&age<endAge)
                 {
                 	if(sumInsured==25000)
                 	{
                 		perDayPricePreExisting=values[1];
                 		perDayPriceWithoutPreExisting=values[0];
                 		break;
                 	}
                 	else if(sumInsured==50000)
                 	{
                 		perDayPricePreExisting=values[3];
                 		perDayPriceWithoutPreExisting=values[2];
                 		break;
                 	}
                 	else if(sumInsured==100000)
                 	{
                 		perDayPricePreExisting=values[5];
                 		perDayPriceWithoutPreExisting=values[4];
                 		break;
                 	}
                 	else if(sumInsured==150000)
                 	{
                 		perDayPricePreExisting=values[7];
                 		perDayPriceWithoutPreExisting=values[6];
                 		break;
                 	}
                 	else {
                 		System.out.println("Please Select correct amount");
                 	}
                 }
            	
            }
        }
        QuickQuoteResponse quickQuoteResponse= new QuickQuoteResponse();
        quickQuoteResponse.setCostwithoutPreExisting(perDayPriceWithoutPreExisting*daysBetween);
        quickQuoteResponse.setCostWithPreExisting(perDayPricePreExisting*daysBetween);
        return quickQuoteResponse;
	}

	private QuickQuoteResponse calculateAmountforStandardPolicy(String data,int age, int suminsured, long daysBetween) {
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
            	if(suminsured==25000)
            	{
            		perDayPricePreExisting=values[1];
            		perDayPriceWithoutPreExisting=values[0];
            		break;
            	}
            	else if(suminsured==50000)
            	{
            		perDayPricePreExisting=values[3];
            		perDayPriceWithoutPreExisting=values[2];
            		break;
            	}
            	else if(suminsured==100000)
            	{
            		perDayPricePreExisting=values[5];
            		perDayPriceWithoutPreExisting=values[4];
            		break;
            	}
            	else {
            		System.out.println("Please Select correct amount");
            	}
            }
        }
        QuickQuoteResponse quickQuoteResponse= new QuickQuoteResponse();
        quickQuoteResponse.setCostwithoutPreExisting(perDayPriceWithoutPreExisting*daysBetween);
        quickQuoteResponse.setCostWithPreExisting(perDayPricePreExisting*daysBetween);
        return quickQuoteResponse;
        
	}

}
