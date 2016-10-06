package com.baobeisystem.entity.xiadan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

/**
 * 投保下单
 * @author WJH
 */
public class QuoteToProposal {

	/**
	 * 返回xml类型的报文
	 * @return返回xml类型的报文
	 * @author WJH
	 */
	private static String getxml(QuoteToXD qXd){
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
        sb.append("<proposalNoCI>").append("</proposalNoCI>");
        sb.append("<proposalNoBI>").append("</proposalNoBI>");
        sb.append("<quotationNoCI>").append("</quotationNoCI>");
        sb.append("<quotationNoBI>").append("</quotationNoBI>");
        sb.append("<orderNo>").append("</orderNo>");
        
        sb.append("<privys>");
        PrivyDTOToXD[] p=qXd.getPrivys();
        for(int i=0;i<p.length;i++){
        	sb.append("<privy>");
        	sb.append("<insuredFlag>").append(p[i].getInsuredFlag()).append("</insuredFlag>");
        	sb.append("<insuredName>").append(p[i].getInsuredName()).append("</insuredName>");
        	sb.append("<insuredNature>").append(p[i].getInsuredNature()).append("</insuredNature>");
        	sb.append("<unitType>").append(p[i].getUnitType()).append("</unitType>");
        	sb.append("<identifyType>").append(p[i].getIdentifyType()).append("</identifyType>");
        	sb.append("<identifyNumber>").append(p[i].getIdentifyNumber()).append("</identifyNumber>");
        	sb.append("<mobile>").append(p[i].getMobile()).append("</mobile>");
        	sb.append("<carRelation>").append(p[i].getCarRelation()).append("</carRelation>");
        	sb.append("</privy>");
        }
        sb.append("</privys>");
        
        sb.append("<engages>");
        sb.append("<engage>");
        sb.append("<clauseCode>").append("</clauseCode>");
        sb.append("<clauseNo>").append("</clauseNo>");
        sb.append("<clauseDesc>").append("</clauseDesc>");
        sb.append("<riskType>").append("</riskType>");
        sb.append("</engage>");
        sb.append("</engages>");
        
        sb.append("<appliAddress></appliAddress>");
        sb.append("<sumPremiun></sumPremiun>");
        sb.append("<issueCode></issueCode>");
        sb.append("<issueCodeTime></issueCodeTime>");
        sb.append("</requestBody>");
        				
		return sb.toString();
	}
	
	public static void qtpPost(String urlStr,QuoteToXD qXd){
	  	try {  
            URL url = new URL(urlStr);  
            URLConnection con = url.openConnection();  
            con.setDoOutput(true);  
            con.setRequestProperty("Pragma:", "no-cache");  
            con.setRequestProperty("Cache-Control", "no-cache");  
            con.setRequestProperty("Content-Type", "text/xml");  
            con.setRequestProperty("charset", "utf-8");
            
            OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());      
            String xmlInfo = getxml(qXd);  
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
