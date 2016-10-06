package com.baobeisystem.entity.carSearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 * 根据渠道接口获取车型信息
 * @author WJH
 */
public class CarTypeSearch {
	/**
	 * 拼接成xml报文
	 * @param car CarModelInfo对象
	 * @return 报文
	 */
	private static String getxmlInfo(CarModelInfo car){
		StringBuffer sb=new StringBuffer();
		
        sb.append("<?xml version='1.0' encoding='UTF-8'?>");  
        sb.append("<request>");  
        sb.append("<requestHead>");  
        sb.append("<consumerSeqNo>ZHKJ151282201507210000000001</consumerSeqNo>");  
        sb.append("<consumerID>zhihuikeji</consumerID>");  
        sb.append("<requestType>CarModelInfoInquiry</requestType>");  
        sb.append("<passWord></passWord>");  
        sb.append("<channelType>01</channelType>");  
        sb.append("<product>01</product>");  
        sb.append("<regionCode>310000</regionCode>");  
        sb.append("<version></version>"); 
        sb.append("</requestHead>"); 
        sb.append("<requestBody>");  
        
        sb.append("<licenseNo>").append(car.getLicenseNo()).append("</licenseNo>");
        sb.append("<engineNo>").append(car.getEngineNo()).append("</engineNo>");
        sb.append("<frameNo>").append(car.getFrameNo()).append("</frameNo>");
        sb.append("<vinNo>").append(car.getVinNo()).append("</vinNo>");
        sb.append("<vehicleBrand>").append(car.getVehicleBrand()).append("</vehicleBrand>");
        sb.append("<vehicleModel>").append(car.getVehicleModel()).append("</vehicleModel>");
        sb.append("<enrollDate>").append(car.getEnrollDate()).append("</enrollDate>");
        sb.append("<carkindcode>").append(car.getCarkindcode()).append("</carkindcode>");
        sb.append("<startdate>").append(car.getStartdate()).append("</startdate>");
        sb.append("<industryModelCode>").append(car.getIndustryModelCode()).append("</industryModelCode>");
        sb.append("<carType2>").append(car.getCarType2()).append("</carType2>");
        sb.append("<carType3>").append(car.getCarType3()).append("</carType3>");
        sb.append("<replacement>").append(car.getReplacement()).append("</replacement>");
        sb.append("<carBookingTime>").append(car.getCarBookingTime()).append("</carBookingTime>");
        
        sb.append("</requestBody>");
        sb.append("</request>");
		return sb.toString();
	}
	
    public static List<CarModelDTO> testPost(String urlStr,CarModelInfo car) {  
    	List<CarModelDTO> list=new ArrayList<CarModelDTO>();
    	try {  
            URL url = new URL(urlStr);  
            URLConnection con = url.openConnection();  
            con.setDoOutput(true);  
            con.setRequestProperty("Pragma:", "no-cache");  
            con.setRequestProperty("Cache-Control", "no-cache");  
            con.setRequestProperty("Content-Type", "text/xml");  
            con.setRequestProperty("charset", "utf-8");
            
            OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());      
            String xmlInfo = getxmlInfo(car);  
            System.out.println("urlStr=" + urlStr); 
            out.write(xmlInfo);
            out.flush();  
            out.close();  
            BufferedReader br = new BufferedReader(new InputStreamReader(con  
                    .getInputStream(),"utf-8")); 
			
            String line = "";
            CarModelDTO carModelDTO=new CarModelDTO();
            for (line = br.readLine(); line != null; line = br.readLine()) {
//            	System.out.println(line);
            	if (line.contains("<seqNo>")) {
					System.out.println(line);
				}
//            	if(line.contains("ratedPassengerCapacity")){
//            		System.out.println(line);
//            	}
            	if (line.contains("<carModel>")) {
					carModelDTO=new CarModelDTO();
				}
            	String[] strings=line.split("[<>]");
            	if(line.contains("<modelCode>")){
            		String result=strings[2];
            		carModelDTO.setModelCode(result);
            	}
            	if(line.contains("<modelName>")){
            		String result=strings[2];
            		carModelDTO.setModelName(result);
            	}
            	if(line.contains("<brandCN>")){
            		String result=strings[2];
            		carModelDTO.setBrandCN(result);
            	}
            	if(line.contains("<series>")){
            		String result=strings[2];
            		carModelDTO.setSeries(result);
            	}
            	if(line.contains("<importFlag>")){
            		String result=strings[2];
            		carModelDTO.setImportFlag(result);
            	}
            	if(line.contains("<ratedPassengerCapacity>")){
            		String result=strings[2];
            		if (result.length()!=0) {
            			carModelDTO.setRatedPassengerCapacity(
            					Integer.parseInt(result));
					}
            	}
            	if(line.contains("<totalVehicleWeight>")){
            		String result=strings[2];
            		if (result.length()!=0) {
            			carModelDTO.setTotalVehicleWeight(
            					Double.parseDouble(result));
					}
            	}
            	if(line.contains("<derailleurType>")){
            		String result=strings[2];
            		carModelDTO.setDerailleurType(result);
            	}
            	if(line.contains("<alarmFlag>")){
            		String result=strings[2];
            		carModelDTO.setAlarmFlag(result);
            	}
            	if(line.contains("<airbagNum>")){
            		String result=strings[2];
            		if (result.length()!=0) {
            			carModelDTO.setAirbagNum(Double.parseDouble(result));
					}
            	}
            	if(line.contains("<vehicleDescription>")){
            		String result=strings[2];
            		carModelDTO.setVehicleDescription(result);
            	}
            	if(line.contains("<displacement>")){
            		String result=strings[2];
            		carModelDTO.setDisplacement(result);
            	}
            	if(line.contains("<marketYear>")){
            		String result=strings[2];
            		carModelDTO.setMarketYear(result);
            	}
            	if(line.contains("<replacementValue>")){
            		String result=strings[2];
            		if(result.length()!=0){
            			carModelDTO.setReplacementValue(
            					Double.parseDouble(result));
            		}
            	}
            	if(line.contains("<searchCode>")){
            		String result=strings[2];
            		carModelDTO.setSearchCode(result);
            	}
            	if(line.contains("<power>")){
            		String result=strings[2];
            		carModelDTO.setPower(result);
            	}
            	if(line.contains("<powerType>")){
            		String result=strings[2];
            		carModelDTO.setPowerType(result);
            	}
            	if(line.contains("<hfName>")){
            		String result=strings[2];
            		carModelDTO.setHfName(result);
            	}
            	if(line.contains("<vehicleAlias>")){
            		String result=strings[2];
            		carModelDTO.setVehicleAlias(result);
            	}
            	
            	if(line.contains("<vehicleClassCode>")){
            		String result=strings[2];
            		carModelDTO.setVehicleClassCode(result);
            	}
            	if(line.contains("<vehicleClassName>")){
            		String result=strings[2];
            		carModelDTO.setVehicleClassName(result);
            	}
            	if(line.contains("<industryModelCode>")){
            		String result=strings[2];
            		carModelDTO.setIndustryModelCode(result);
            	}
            	if (line.contains("</carModel>")) {
            		list.add(carModelDTO);
				}
            } 
        } catch (Exception e) {  
            e.printStackTrace();  
        } 
        return list;
    }  
    public static void carModelOut(){
    	try {
			Class<?> c=Class.forName("com.baobeisystem.entity.CarModelDTO");
			Field[] fields=c.getDeclaredFields();
			String[] str=new String[fields.length];
			System.out.println(fields.length);
			for(int i=0;i<fields.length;i++){
				str[i]=fields[i].getName();
				System.out.println(str[i]);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
}
