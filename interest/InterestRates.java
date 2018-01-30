package com.interest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import com.interest.model.IntRates;

//import org.json.simple.JSONArray;
//import org.json.simple.parser.JSONParser;





public interface InterestRates {
	
	
	
	public ArrayList<IntRates> getDataForMonth(String date);
	public ArrayList<IntRates> getRatesForBanks(String date);
	public ArrayList<IntRates> getRatesForFinanceCompanies(String date);
	public HashMap compareInterestRates(ArrayList<IntRates> banks,ArrayList<IntRates> finComp);
}
