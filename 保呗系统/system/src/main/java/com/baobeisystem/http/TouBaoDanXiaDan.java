package com.baobeisystem.http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

/**
 * 投保单下单
 * @author WJH
 * @version 1.0
 */
public class TouBaoDanXiaDan {

	private static String getxml(Object object){
		StringBuffer sb=new StringBuffer();
		
        sb.append("<?xml version='1.0' encoding='UTF-8'?>");  
        sb.append("<request>");  
        sb.append("<requestHead>");
        sb.append("<consumerSeqNo>ZHKJ151282201507210000000003</consumerSeqNo>");
        sb.append("<consumerID>zhihuikeji</consumerID>");
        sb.append("<requestType>QuoteToProposal</requestType>");
        sb.append("<passWord></passWord>");
        sb.append("<channelType>01</channelType>");  
        sb.append("<product>01</product>");  
        sb.append("<regionCode>310000</regionCode>");  
        sb.append("<version></version>"); 
        sb.append("</requestHead>"); 
        sb.append("<requestBody>");
        sb.append("<seqNo>FAMILYCAR151282201507210000000002</seqNo>");
        sb.append("<proposalNoCI></proposalNoCI>");
        sb.append("<proposalNoBI></proposalNoBI>");
        sb.append("<quotationNoCI></quotationNoCI>");
        sb.append("<quotationNoBI></quotationNoBI>");
        sb.append("<orderNo></orderNo>");
        sb.append("<privys>");
        sb.append("<privy>");
        sb.append("<insuredFlag></insuredFlag>");
        sb.append("<insuredName></insuredName>");
        sb.append("<insuredNature></insuredNature>");
        sb.append("<unitType></unitType>");
        sb.append("<identifyType></identifyType>");
        sb.append("<identifyNumber></identifyNumber>");
        sb.append("<mobile></mobile>");
        sb.append("<carRelation></carRelation>");
        sb.append("</privy>");
        sb.append("</privys>");
        sb.append("<engages>");
        sb.append("<engage>");
        sb.append("<clauseCode></clauseCode>");
        sb.append("<clauseNo></clauseNo>");
        sb.append("<clauseDesc></clauseDesc>");
        sb.append("<riskType></riskType>");
        sb.append("</engage>");
        sb.append("</engages>");
        sb.append("<appliAddress></appliAddress>");
        sb.append("<sumPremiun></sumPremiun>");
        sb.append("<issueCode></issueCode>");
        sb.append("<issueCodeTime></issueCodeTime>");
        sb.append("</requestBody>");
        sb.append("</request>");
        
		return sb.toString();
	}
    public static void testPost(String urlStr) {  
    	try {  
            URL url = new URL(urlStr);  
            URLConnection con = url.openConnection();  
            con.setDoOutput(true);  
            con.setRequestProperty("Pragma:", "no-cache");  
            con.setRequestProperty("Cache-Control", "no-cache");  
            con.setRequestProperty("Content-Type", "text/xml");  
            con.setRequestProperty("charset", "utf-8");
            
            OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());      
            String xmlInfo = getxml(out);  
            System.out.println("urlStr=" + urlStr); 
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
