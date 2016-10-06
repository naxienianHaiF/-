package com.baobeisystem.entity;

public class DBArea {

	private String	AREA_CODE;
	private String	AREA_NAME;
	private String	SHORT_NAME;
	private String  AREA_LEVEL;
	private String  PARENT_CODE;
	private String	HOT_FLAG;
	private String  VALID_STATUS;
	private String	LICENSE_PREFIX;
	private String	PROVINCE_FLAG;
	private String  OPERATOR_CODE;
	private String  OPERATOR_NAME;
	private String  OPERATOR_DATE;
	private String  FEE_CHANGE_FLAG;
	
	public String getAREA_CODE() {
		return AREA_CODE;
	}
	public void setAREA_CODE(String aREA_CODE) {
		AREA_CODE = aREA_CODE;
	}
	public String getAREA_NAME() {
		return AREA_NAME;
	}
	public void setAREA_NAME(String aREA_NAME) {
		AREA_NAME = aREA_NAME;
	}
	public String getSHORT_NAME() {
		return SHORT_NAME;
	}
	public void setSHORT_NAME(String sHORT_NAME) {
		SHORT_NAME = sHORT_NAME;
	}
	public String getAREA_LEVEL() {
		return AREA_LEVEL;
	}
	public void setAREA_LEVEL(String aREA_LEVEL) {
		AREA_LEVEL = aREA_LEVEL;
	}
	public String getPARENT_CODE() {
		return PARENT_CODE;
	}
	public void setPARENT_CODE(String pARENT_CODE) {
		PARENT_CODE = pARENT_CODE;
	}
	public String getHOT_FLAG() {
		return HOT_FLAG;
	}
	public void setHOT_FLAG(String hOT_FLAG) {
		HOT_FLAG = hOT_FLAG;
	}
	public String getVALID_STATUS() {
		return VALID_STATUS;
	}
	public void setVALID_STATUS(String vALID_STATUS) {
		VALID_STATUS = vALID_STATUS;
	}
	public String getLICENSE_PREFIX() {
		return LICENSE_PREFIX;
	}
	public void setLICENSE_PREFIX(String lICENSE_PREFIX) {
		LICENSE_PREFIX = lICENSE_PREFIX;
	}
	public String getPROVINCE_FLAG() {
		return PROVINCE_FLAG;
	}
	public void setPROVINCE_FLAG(String pROVINCE_FLAG) {
		PROVINCE_FLAG = pROVINCE_FLAG;
	}
	public String getOPERATOR_CODE() {
		return OPERATOR_CODE;
	}
	public void setOPERATOR_CODE(String oPERATOR_CODE) {
		OPERATOR_CODE = oPERATOR_CODE;
	}
	public String getOPERATOR_NAME() {
		return OPERATOR_NAME;
	}
	public void setOPERATOR_NAME(String oPERATOR_NAME) {
		OPERATOR_NAME = oPERATOR_NAME;
	}
	public String getOPERATOR_DATE() {
		return OPERATOR_DATE;
	}
	public void setOPERATOR_DATE(String oPERATOR_DATE) {
		OPERATOR_DATE = oPERATOR_DATE;
	}
	public String getFEE_CHANGE_FLAG() {
		return FEE_CHANGE_FLAG;
	}
	public void setFEE_CHANGE_FLAG(String fEE_CHANGE_FLAG) {
		FEE_CHANGE_FLAG = fEE_CHANGE_FLAG;
	}
	@Override
	public String toString() {
		return "DBArea [AREA_CODE=" + AREA_CODE + ", AREA_NAME=" + AREA_NAME
				+ ", SHORT_NAME=" + SHORT_NAME + ", AREA_LEVEL=" + AREA_LEVEL
				+ ", PARENT_CODE=" + PARENT_CODE + ", HOT_FLAG=" + HOT_FLAG
				+ ", VALID_STATUS=" + VALID_STATUS + ", LICENSE_PREFIX="
				+ LICENSE_PREFIX + ", PROVINCE_FLAG=" + PROVINCE_FLAG
				+ ", OPERATOR_CODE=" + OPERATOR_CODE + ", OPERATOR_NAME="
				+ OPERATOR_NAME + ", OPERATOR_DATE=" + OPERATOR_DATE
				+ ", FEE_CHANGE_FLAG=" + FEE_CHANGE_FLAG + "]";
	}
	

	
}
