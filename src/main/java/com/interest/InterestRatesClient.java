package com.interest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

//import org.json.simple.JSONArray;
//import org.json.simple.parser.JSONParser;





public class InterestRatesClient {
	
	public static void main(String args[]) throws IOException {
		InterestRatesImpl intImpl = new InterestRatesImpl();
		System.out.println("result "+intImpl.getDataForMonth("2017-12"));
	}
}
