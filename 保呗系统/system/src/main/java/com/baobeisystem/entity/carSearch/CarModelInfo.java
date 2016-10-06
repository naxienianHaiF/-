package com.baobeisystem.entity.carSearch;
/**
 * 车型查询接口的输入对象
 * @author WJH
 * @version 1.0
 */
public class CarModelInfo {

	private String licenseNo;
	private String engineNo;
	private String frameNo;
	private String vinNo;
	private String vehicleBrand;
	private String vehicleModel;
	private String enrollDate;
	private String carkindcode;
	private String startdate;
	private String industryModelCode;
	private String carType2;
	private String carType3;
	private String replacement;
	private String carBookingTime;
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public String getFrameNo() {
		return frameNo;
	}
	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}
	public String getVinNo() {
		return vinNo;
	}
	public void setVinNo(String vinNo) {
		this.vinNo = vinNo;
	}
	public String getVehicleBrand() {
		return vehicleBrand;
	}
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public String getCarkindcode() {
		return carkindcode;
	}
	public void setCarkindcode(String carkindcode) {
		this.carkindcode = carkindcode;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getIndustryModelCode() {
		return industryModelCode;
	}
	public void setIndustryModelCode(String industryModelCode) {
		this.industryModelCode = industryModelCode;
	}
	public String getCarType2() {
		return carType2;
	}
	public void setCarType2(String carType2) {
		this.carType2 = carType2;
	}
	public String getCarType3() {
		return carType3;
	}
	public void setCarType3(String carType3) {
		this.carType3 = carType3;
	}
	public String getReplacement() {
		return replacement;
	}
	public void setReplacement(String replacement) {
		this.replacement = replacement;
	}
	public String getCarBookingTime() {
		return carBookingTime;
	}
	public void setCarBookingTime(String carBookingTime) {
		this.carBookingTime = carBookingTime;
	}
	@Override
	public String toString() {
		return "CarModelInfo [licenseNo=" + licenseNo + ", engineNo="
				+ engineNo + ", frameNo=" + frameNo + ", vinNo=" + vinNo
				+ ", vehicleBrand=" + vehicleBrand + ", vehicleModel="
				+ vehicleModel + ", enrollDate=" + enrollDate
				+ ", carkindcode=" + carkindcode + ", startdate=" + startdate
				+ ", industryModelCode=" + industryModelCode + ", carType2="
				+ carType2 + ", carType3=" + carType3 + ", replacement="
				+ replacement + ", carBookingTime=" + carBookingTime + "]";
	}
	
	
	
}
