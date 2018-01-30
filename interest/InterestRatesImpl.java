package com.interest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import com.interest.model.IntRates;


public class InterestRatesImpl implements InterestRates {
	
	
	
	public ArrayList<IntRates> getDataForMonth(String date){
		ArrayList<IntRates> intRatesList = new ArrayList<IntRates>();
		String inline="";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
			Date date1 = sdf.parse(date );
			System.out.println("date .... "+date);
			System.out.println("date1 .... "+date1);
			//URL url = new URL("https://eservices.mas.gov.sg/api/action/datastore/search.json?resource_id=5f2b18a8-0883-4769-a635-879c63d3caac&filters[end_of_month]=2017-01");
			String strurl = "https://eservices.mas.gov.sg/api/action/datastore/search.json?resource_id=5f2b18a8-0883-4769-a635-879c63d3caac";
			String strDate = "&filters[end_of_month]="+date;
			strurl = strurl + strDate;
			URL url = new URL(strurl);
			
			

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			conn.connect();
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			System.out.println("getResponseCode .... "+conn.getResponseCode());
			Scanner sc1 = new Scanner(url.openStream());
			while(sc1.hasNext()){
				inline+=sc1.nextLine();
			}
			System.out.println("Output from Server .... \n");
			System.out.println(inline);
			sc1.close();
			/*BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}*/
			conn.disconnect();
			
			


		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  }catch (Exception e) {

				e.printStackTrace();

			  }
		
		
		return intRatesList;
		
	}
	
	public ArrayList<IntRates> getRatesForBanks(String date){
		ArrayList<IntRates> intRatesList = new ArrayList<IntRates>();
		try {
			
			URL url = new URL("https://eservices.mas.gov.sg/api/action/datastore/search.json?resource_id=5f2b18a8-0883-4769-a635-879c63d3caac&filters[end_of_month]=2017-01");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			System.out.println("getResponseCode .... "+conn.getResponseCode());
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			conn.disconnect();
			
			


		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  }catch (Exception e) {

				e.printStackTrace();

			  }
		
		
		return intRatesList;
	}
	public ArrayList<IntRates> getRatesForFinanceCompanies(String date){
		ArrayList<IntRates> intRatesList = new ArrayList<IntRates>();
		try {
			
			URL url = new URL("https://eservices.mas.gov.sg/api/action/datastore/search.json?resource_id=5f2b18a8-0883-4769-a635-879c63d3caac&filters[end_of_month]=2017-01");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			System.out.println("getResponseCode .... "+conn.getResponseCode());
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			conn.disconnect();
			
			


		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  }catch (Exception e) {

				e.printStackTrace();

			  }
		
		
		return intRatesList;
	}
	public HashMap compareInterestRates(ArrayList<IntRates> banks,ArrayList<IntRates> finComp){
		HashMap map = new HashMap();
		try
		{
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return map;
	}
}
