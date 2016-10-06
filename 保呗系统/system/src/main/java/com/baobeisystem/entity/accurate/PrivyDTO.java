package com.baobeisystem.entity.accurate;

public class PrivyDTO {

	private String insuredFlag;    //非空
	private String insuredName;    //非空
	private String insuredNature;    //非空
	private String insuredType;
	private String identifyType;
	private String identifyNumber;
	private String mobile;
	private String sex;
	private String drivingLicenseNo;   //关系人标志为：约定驾驶员时，非空
	private int driverAge;          //关系人标志为：约定驾驶员时，非空 
	private String acceptLicenseDate;
	private String mainDriverFlag;
	private String driverType;
	private String carinsureDrelation;    //非空 
	private String birthday;
	public String getInsuredFlag() {
		return insuredFlag;
	}
	public void setInsuredFlag(String insuredFlag) {
		this.insuredFlag = insuredFlag;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getInsuredNature() {
		return insuredNature;
	}
	public void setInsuredNature(String insuredNature) {
		this.insuredNature = insuredNature;
	}
	public String getInsuredType() {
		return insuredType;
	}
	public void setInsuredType(String insuredType) {
		this.insuredType = insuredType;
	}
	public String getIdentifyType() {
		return identifyType;
	}
	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}
	public String getIdentifyNumber() {
		return identifyNumber;
	}
	public void setIdentifyNumber(String identifyNumber) {
		this.identifyNumber = identifyNumber;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDrivingLicenseNo() {
		return drivingLicenseNo;
	}
	public void setDrivingLicenseNo(String drivingLicenseNo) {
		this.drivingLicenseNo = drivingLicenseNo;
	}
	public int getDriverAge() {
		return driverAge;
	}
	public void setDriverAge(int driverAge) {
		this.driverAge = driverAge;
	}
	public String getAcceptLicenseDate() {
		return acceptLicenseDate;
	}
	public void setAcceptLicenseDate(String acceptLicenseDate) {
		this.acceptLicenseDate = acceptLicenseDate;
	}
	public String getMainDriverFlag() {
		return mainDriverFlag;
	}
	public void setMainDriverFlag(String mainDriverFlag) {
		this.mainDriverFlag = mainDriverFlag;
	}
	public String getDriverType() {
		return driverType;
	}
	public void setDriverType(String driverType) {
		this.driverType = driverType;
	}
	public String getCarinsureDrelation() {
		return carinsureDrelation;
	}
	public void setCarinsureDrelation(String carinsureDrelation) {
		this.carinsureDrelation = carinsureDrelation;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "PrivyDTO [insuredFlag=" + insuredFlag + ", insuredName="
				+ insuredName + ", insuredNature=" + insuredNature
				+ ", insuredType=" + insuredType + ", identifyType="
				+ identifyType + ", identifyNumber=" + identifyNumber
				+ ", mobile=" + mobile + ", sex=" + sex + ", drivingLicenseNo="
				+ drivingLicenseNo + ", driverAge=" + driverAge
				+ ", acceptLicenseDate=" + acceptLicenseDate
				+ ", mainDriverFlag=" + mainDriverFlag + ", driverType="
				+ driverType + ", carinsureDrelation=" + carinsureDrelation
				+ ", birthday=" + birthday + "]";
	}

	
}
