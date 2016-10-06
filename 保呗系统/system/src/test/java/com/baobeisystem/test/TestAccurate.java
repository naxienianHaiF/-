package com.baobeisystem.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import org.junit.Test;

import com.baobeisystem.file.FileUtils;

public class TestAccurate {

	@Test
	public void test() throws IOException{

		String xmlInfo=FileUtils.readFile("src/test/java/com/baobeisystem/test/11.txt");
//		System.out.println(xmlInfo);
    	try {  
    		String url1="http://120.55.174.144:7106/";
            URL url = new URL(url1);  
            URLConnection con = url.openConnection();  
            con.setDoOutput(true);  
            con.setRequestProperty("Pragma:", "no-cache");  
            con.setRequestProperty("Cache-Control", "no-cache");  
            con.setRequestProperty("Content-Type", "text/xml");  
            con.setRequestProperty("charset", "utf-8");
            
            OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());      
            out.write(xmlInfo);
            out.flush();  
            out.close();  
            BufferedReader br = new BufferedReader(new InputStreamReader(con  
                    .getInputStream(),"utf-8")); 
			
            String line = "";
            for (line = br.readLine(); line != null; line = br.readLine()) {
            	System.out.println(line);
            } 
        } catch (Exception e) {  
            e.printStackTrace();  
        } 
    }
		
	
	
}
