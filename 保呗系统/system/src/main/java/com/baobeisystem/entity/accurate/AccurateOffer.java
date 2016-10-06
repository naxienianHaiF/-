package com.baobeisystem.entity.accurate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

/**
 * 精确报价
 * @author WJH
 * @version 1.0
 */
public class AccurateOffer {

	private static String getxmlString(String startDateCIP,String endDateCIP,
			String startDateBZ,String endDateBZ,
			CarDTO carDTO,PrivyDTO[] privyDTO,KindDTO[] kindDTO,CarTax carTax){
		StringBuffer sb=new StringBuffer();
		
        sb.append("<?xml version='1.0' encoding='UTF-8'?>");  
        sb.append("<request>");  
        sb.append("<requestHead>");  
        sb.append("<consumerSeqNo>10fc5e09-b1aa-4f65-ad9e-b7c98b55b416</consumerSeqNo>");  
        sb.append("<consumerID>zhihuikeji</consumerID>");  
        sb.append("<requestType>PreciseQuote</requestType>");  
        sb.append("<passWord></passWord>");  
        sb.append("<channelType>01</channelType>");  
        sb.append("<product>01</product>");  
        sb.append("<regionCode>370100</regionCode>");  
        sb.append("<version></version>"); 
        sb.append("</requestHead>");
		
        sb.append("<requestBody>");
        sb.append("<seqNo>ZHKJ151282201507210000000001</seqNo>");
        sb.append("<businessTypeCI>").append("</businessTypeCI>");
        sb.append("<businessTypeBI>").append("</businessTypeBI>");
        sb.append("<startDateCIP>").append(startDateCIP).append("</startDateCIP>");
        sb.append("<endDateCIP>").append(endDateCIP).append("</endDateCIP>");
        sb.append("<startDateBZ>").append(startDateBZ).append("</startDateBZ>");
        sb.append("<endDateBZ>").append(endDateBZ).append("</endDateBZ>");
        sb.append("<instantInureFlagBI>0</instantInureFlagBI>");
        sb.append("<instantInureFlagCI>0</instantInureFlagCI>");
        sb.append("<expectDiscount>0</expectDiscount>");
        sb.append("<partnerId></partnerId>");
        sb.append("<partnerName></partnerName>");
        sb.append("<inDoorFlag>").append("</inDoorFlag>");
        
        sb.append("<carTax>");
        sb.append("<taxFlag>N</taxFlag>");
        sb.append("<revenue></revenue>");
        sb.append("<taxPayerName>").append(carTax.getTaxPayerName()).append("</taxPayerName>");
        sb.append("<taxPayerCertiType>").append(carTax.getTaxPayerCertiType()).append("</taxPayerCertiType>");
    	sb.append("<taxPayerCertiCode>").append(carTax.getTaxPayerCertiCode()).append("</taxPayerCertiCode>");		
    	sb.append("<taxPayerIdentificationCode>").append(carTax.getTaxPayerIdentificationCode())
    		.append("</taxPayerIdentificationCode>");			
    	sb.append("<lastTaxDate>").append(carTax.getLastTaxDate()).append("</lastTaxDate>");	
    	sb.append("<lastBZendDate>").append("</lastBZendDate>");
    	sb.append("<insuredName>").append(carTax.getInsuredName()).append("</insuredName>");
    	sb.append("<departmentNolocal>").append("</departmentNolocal>");
    	sb.append("<declareDate>").append("</declareDate>");
    	sb.append("<taxRegistryNumber>").append("</taxRegistryNumber>");
    	sb.append("<annualTax>");
    	sb.append("<taxStartDate>2016-01-01").append("</taxStartDate>");
    	sb.append("<taxEndDate>2016-12-31").append("</taxEndDate>");
//    	sb.append("<paid>");
//    	sb.append("<taxDepartmentCode>").append("</taxDepartmentCode>");
//    	sb.append("<taxDepartment>").append("</taxDepartment>");
//    	sb.append("<taxDocumentNumber>").append("</taxDocumentNumber>");
    	sb.append("</paid>");
//    	sb.append("<deRate>");
//    	sb.append("<noTaxCarType>").append("</noTaxCarType>");
//    	sb.append("<deDuctiondueCode>").append("</deDuctiondueCode>");
//    	sb.append("<deDuctiondueType>").append("</deDuctiondueType>");
//    	sb.append("<deDuctiondueProportion>").append("</deDuctiondueProportion>");
//    	sb.append("<deDuction>").append("</deDuction>");
//    	sb.append("<deDuctionDocumentNumber>").append("</deDuctionDocumentNumber>");
//    	sb.append("<taxDepartmentDode>").append("</taxDepartmentDode>");
//    	sb.append("<taxDepartment>").append("</taxDepartment>");
    	sb.append("</deRate>");
    	sb.append("</annualTax>");
    	sb.append("</carTax>");        
        
        sb.append("<car>");
        sb.append("<pmQueryNo>").append("</pmQueryNo>");
        sb.append("<licenseNo>").append(carDTO.getLicenseNo()).append("</licenseNo>");
        sb.append("<importFlag>").append(carDTO.getImportFlag()).append("</importFlag>");
        //这个是按照txt的格式写的	
        sb.append("<carKindCode>KA</carKindCode>");
        sb.append("<modelCode>").append(carDTO.getModelCode()).append("</modelCode>");
        sb.append("<modelName>").append(carDTO.getModelName()).append("</modelName>");
        sb.append("<frameNo>").append(carDTO.getFrameNo()).append("</frameNo>");
        sb.append("<vinNo>").append(carDTO.getVinNo()).append("</vinNo>");
        sb.append("<engineNo>").append(carDTO.getEngineNo()).append("</engineNo>");
        sb.append("<enrollDate>").append(carDTO.getEnrollDate()).append("</enrollDate>");
        //这里原先有一个空格
        sb.append("<userYear>").append("</userYear>");
        sb.append("<runMiles>").append("</runMiles>");
        sb.append("<colorCode>").append("</colorCode>");
        sb.append("<runAreaCode >").append(carDTO.getRunAreaCode()).append("</runAreaCode >");
        sb.append("<purchasePrice>").append(carDTO.getPurchasePrice()).append("</purchasePrice>");
        sb.append("<actualValue>").append(carDTO.getActualValue()).append("</actualValue>");
        sb.append("<transferDate>").append(carDTO.getTransferDate()).append("</transferDate>");
        sb.append("<noLicenseFlag>").append(carDTO.getNoLicenseFlag()).append("</noLicenseFlag>");
        sb.append("<chgOwnerFlag>").append(carDTO.getChgOwnerFlag()).append("</chgOwnerFlag>");
        sb.append("<certificateDate>").append("</certificateDate>");
        sb.append("<vehicleBrand>").append("</vehicleBrand>");
        sb.append("<noDamageYears>").append("</noDamageYears>");
        sb.append("<loanVehicleFlag>").append(carDTO.getLoanVehicleFlag()).append("</loanVehicleFlag>");
        sb.append("<specialCarFlag>").append("</specialCarFlag>");
        sb.append("<fuelType>").append(carDTO.getFuelType()).append("</fuelType>");
        sb.append("<net>").append("</net>");
        sb.append("<exhaustScale>").append(carDTO.getExhaustScale()).append("</exhaustScale>");
        sb.append("<vehicleCategory>").append(carDTO.getVehicleCategory()).append("</vehicleCategory>");
        sb.append("<powerScale>").append(carDTO.getPowerScale()).append("</powerScale>");
        sb.append("<seatCount>").append(carDTO.getSeatCount()).append("</seatCount>");
        sb.append("<carBookingTime>").append(carDTO.getCarBookingTime()).append("</carBookingTime>");
        sb.append("<carRegiste>").append(carDTO.getCarRegiste()).append("</carRegiste>");
        sb.append("<certificateDateBJ>").append(carDTO.getCertificateDateBJ()).append("</certificateDateBJ>");
        sb.append("<certificateType>").append(carDTO.getCertificateType()).append("</certificateType>");
        sb.append("<certificateNo>").append(carDTO.getCertificateNo()).append("</certificateNo>");
        sb.append("<carFairValue>").append(carDTO.getCarFairValue()).append("</carFairValue>");
        sb.append("<industryModelCode>").append(carDTO.getIndustryModelCode()).append("</industryModelCode>");
        sb.append("<usedCarType>").append("</usedCarType>");
        sb.append("<depreciation>").append(carDTO.getDepreciation()).append("</depreciation>");
        sb.append("<isPrintModelAlias>").append("</isPrintModelAlias>");
        sb.append("<carType2>").append(carDTO.getCarType2()).append("</carType2>");
        sb.append("<carType3>").append(carDTO.getCarType3()).append("</carType3>");
        sb.append("</car>");
        
        sb.append("<privys>");
        for(int i=0;i<privyDTO.length;i++){
        	
        	sb.append("<privy>");
        	sb.append("<insuredFlag>").append(privyDTO[i].getInsuredFlag()).append("</insuredFlag>");
        	sb.append("<insuredName>").append(privyDTO[i].getInsuredName()).append("</insuredName>");
        	sb.append("<insuredNature>").append(privyDTO[i].getInsuredNature()).append("</insuredNature>");
        	sb.append("<insuredType>").append("</insuredType>");
        	sb.append("<identifyType>").append(privyDTO[i].getIdentifyType()).append("</identifyType>");
        	sb.append("<identifyNumber>").append(privyDTO[i].getIdentifyNumber()).append("</identifyNumber>");
        	sb.append("<mobile>").append("</mobile>");
        	sb.append("<sex>").append("</sex>");
        	sb.append("<drivingLicenseNo>").append("</drivingLicenseNo>");
        	sb.append("<driverAge>").append(privyDTO[i].getDriverAge()).append("</driverAge>");
        	sb.append("<acceptLicenseDate>").append("</acceptLicenseDate>");
        	sb.append("<mainDriverFlag>").append("</mainDriverFlag>");
        	sb.append("<driverType>").append("</driverType>");
        	sb.append("<carinsureDrelation>").append("</carinsureDrelation>");
        	sb.append("<birthday>").append("</birthday>");
        	sb.append("</privy>");
        }
        
        sb.append("</privys>");
        
        sb.append("<kinds>");
        for(int i=0;i<kindDTO.length;i++){
        	sb.append("<kind>");
        	sb.append("<kindCode>").append(kindDTO[i].getKindCode()).append("</kindCode>");
        	sb.append("<quantity>").append(kindDTO[i].getQuantity()).append("</quantity>");
        	sb.append("<unitAmount>").append(kindDTO[i].getUnitAmount()).append("</unitAmount>");
        	sb.append("<amount>").append(kindDTO[i].getAmount()).append("</amount>");
        	sb.append("<deductibleRate></deductibleRate>");
        	sb.append("<modeCode>").append(kindDTO[i].getModeCode()).append("</modeCode>");
        	sb.append("<kindFlag>").append(kindDTO[i].getKindFlag()).append("</kindFlag>");
        	sb.append("<deductibleAmount>").append(kindDTO[i].getDeductibleAmount()).append("</deductibleAmount>");
        	sb.append("</kind>");
        }
        sb.append("</kinds>");

    				
        sb.append("<checks>");
        sb.append("<check>");
        sb.append("<renewalFlag>").append("</renewalFlag>");
        sb.append("<checkFlag>").append("</checkFlag>");
        sb.append("<querySequenceNo>").append("</querySequenceNo>");
        sb.append("<answer>").append("</answer>");
        sb.append("</check>");
        sb.append("</checks>");
        
//        sb.append("<channelInfo>");
//        sb.append("<channelCode>").append("changanzaixian").append("</channelCode>");
//        sb.append("<channelName>").append("</channelName>");
//        sb.append("<channelComCode>").append("</channelComCode>");
//        sb.append("<channelComName>").append("</channelComName>");
//        sb.append("<channelProductCode>").append("</channelProductCode>");
//        sb.append("<operator>").append("</operator>");
//        sb.append("<trxCode>").append("</trxCode>");
//        sb.append("<channelSeqNo>").append("</channelSeqNo>");
//        sb.append("<trxDate>").append("</trxDate>");
//        sb.append("<regionCode>").append("</regionCode>");
//        sb.append("<makeChannel>").append("</makeChannel>");
//        sb.append("<passWord>").append("</passWord>");
//        sb.append("</channelInfo>");
        
        sb.append("</requestBody>");
        sb.append("</request>");
        			
		return sb.toString();
	}
	
	
    public static void testPost(String urlStr,String startDateCIP,String endDateCIP,
    		String startDateBZ,String endDateBZ,
			CarDTO carDTO,PrivyDTO[] privyDTO,KindDTO[] kindDTO,CarTax carTax) {  
    	try {  
            URL url = new URL(urlStr);  
            URLConnection con = url.openConnection();  
            con.setDoOutput(true);  
            con.setRequestProperty("Pragma:", "no-cache");  
            con.setRequestProperty("Cache-Control", "no-cache");  
            con.setRequestProperty("Content-Type", "text/xml");  
            con.setRequestProperty("charset", "utf-8");
            
            OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());      
            String xmlInfo = getxmlString(startDateCIP,endDateCIP,startDateBZ,endDateBZ,carDTO,privyDTO,kindDTO,carTax);  
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
