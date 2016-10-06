package com.baobeisystem.entity.accurate;
/**
 * 车辆信息
 * @author WJH
 */
public class CarDTO {

	private String pmQueryNo;
	private String licenseNo;
	private String importFlag;    //非空
	private String carKindCode;
	private String modelCode;    //非空
	private String modelName;    //非空
	private String frameNo;    //非空
	private String vinNo;    //非空
	private String engineNo;    //非空
	private String vehicleCategory;    //非空
	private String enrollDate;    //非空
	private int userYear;    //非空
	private double runMiles;
	private String colorCode;
	private String runAreaCode; 
	private double purchasePrice;    //非空
	private double actualValue;    //非空
	private String transferDate;
	private String noLicenseFlag;    //非空
	private String chgOwnerFlag;    //非空
	private String certificateDate;
	private String vehicleBrand;
	private int noDamageYears;
	private String loanVehicleFlag;    //非空
	private String specialCarFlag;
	private String fuelType;    //非空
	private double net;    //非空
	private double exhaustScale;    //非空
	private double powerScale;    //非空
	private int seatCount;    //非空
	private String carBookingTime;    //非空
	private String carRegiste;    //非空
	private String certificateDateBJ;
	private String certificateType;
	private String certificateNo;
	private String carFairValue;
	private String industryModelCode;
	private String usedCarType;
	private String depreciation;    //非空
	private String isPrintModelAlias;
	private String carType2;
	private String carType3;
	public String getPmQueryNo() {
		return pmQueryNo;
	}
	public void setPmQueryNo(String pmQueryNo) {
		this.pmQueryNo = pmQueryNo;
	}
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getImportFlag() {
		return importFlag;
	}
	public void setImportFlag(String importFlag) {
		this.importFlag = importFlag;
	}
	public String getCarKindCode() {
		return carKindCode;
	}
	public void setCarKindCode(String carKindCode) {
		this.carKindCode = carKindCode;
	}
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
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
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public String getVehicleCategory() {
		return vehicleCategory;
	}
	public void setVehicleCategory(String vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public int getUserYear() {
		return userYear;
	}
	public void setUserYear(int userYear) {
		this.userYear = userYear;
	}
	public double getRunMiles() {
		return runMiles;
	}
	public void setRunMiles(double runMiles) {
		this.runMiles = runMiles;
	}
	public String getColorCode() {
		return colorCode;
	}
	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}
	public String getRunAreaCode() {
		return runAreaCode;
	}
	public void setRunAreaCode(String runAreaCode) {
		this.runAreaCode = runAreaCode;
	}
	public double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public double getActualValue() {
		return actualValue;
	}
	public void setActualValue(double actualValue) {
		this.actualValue = actualValue;
	}
	public String getTransferDate() {
		return transferDate;
	}
	public void setTransferDate(String transferDate) {
		this.transferDate = transferDate;
	}
	public String getNoLicenseFlag() {
		return noLicenseFlag;
	}
	public void setNoLicenseFlag(String noLicenseFlag) {
		this.noLicenseFlag = noLicenseFlag;
	}
	public String getChgOwnerFlag() {
		return chgOwnerFlag;
	}
	public void setChgOwnerFlag(String chgOwnerFlag) {
		this.chgOwnerFlag = chgOwnerFlag;
	}
	public String getCertificateDate() {
		return certificateDate;
	}
	public void setCertificateDate(String certificateDate) {
		this.certificateDate = certificateDate;
	}
	public String getVehicleBrand() {
		return vehicleBrand;
	}
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	public int getNoDamageYears() {
		return noDamageYears;
	}
	public void setNoDamageYears(int noDamageYears) {
		this.noDamageYears = noDamageYears;
	}
	public String getLoanVehicleFlag() {
		return loanVehicleFlag;
	}
	public void setLoanVehicleFlag(String loanVehicleFlag) {
		this.loanVehicleFlag = loanVehicleFlag;
	}
	public String getSpecialCarFlag() {
		return specialCarFlag;
	}
	public void setSpecialCarFlag(String specialCarFlag) {
		this.specialCarFlag = specialCarFlag;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public double getNet() {
		return net;
	}
	public void setNet(double net) {
		this.net = net;
	}
	public double getExhaustScale() {
		return exhaustScale;
	}
	public void setExhaustScale(double exhaustScale) {
		this.exhaustScale = exhaustScale;
	}
	public double getPowerScale() {
		return powerScale;
	}
	public void setPowerScale(double powerScale) {
		this.powerScale = powerScale;
	}
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	public String getCarBookingTime() {
		return carBookingTime;
	}
	public void setCarBookingTime(String carBookingTime) {
		this.carBookingTime = carBookingTime;
	}
	public String getCarRegiste() {
		return carRegiste;
	}
	public void setCarRegiste(String carRegiste) {
		this.carRegiste = carRegiste;
	}
	public String getCertificateDateBJ() {
		return certificateDateBJ;
	}
	public void setCertificateDateBJ(String certificateDateBJ) {
		this.certificateDateBJ = certificateDateBJ;
	}
	public String getCertificateType() {
		return certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}
	public String getCertificateNo() {
		return certificateNo;
	}
	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}
	public String getCarFairValue() {
		return carFairValue;
	}
	public void setCarFairValue(String carFairValue) {
		this.carFairValue = carFairValue;
	}
	public String getIndustryModelCode() {
		return industryModelCode;
	}
	public void setIndustryModelCode(String industryModelCode) {
		this.industryModelCode = industryModelCode;
	}
	public String getUsedCarType() {
		return usedCarType;
	}
	public void setUsedCarType(String usedCarType) {
		this.usedCarType = usedCarType;
	}
	public String getDepreciation() {
		return depreciation;
	}
	public void setDepreciation(String depreciation) {
		this.depreciation = depreciation;
	}
	public String getIsPrintModelAlias() {
		return isPrintModelAlias;
	}
	public void setIsPrintModelAlias(String isPrintModelAlias) {
		this.isPrintModelAlias = isPrintModelAlias;
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
	@Override
	public String toString() {
		return "CarDTO [pmQueryNo=" + pmQueryNo + ", licenseNo=" + licenseNo
				+ ", importFlag=" + importFlag + ", carKindCode=" + carKindCode
				+ ", modelCode=" + modelCode + ", modelName=" + modelName
				+ ", frameNo=" + frameNo + ", vinNo=" + vinNo + ", engineNo="
				+ engineNo + ", vehicleCategory=" + vehicleCategory
				+ ", enrollDate=" + enrollDate + ", userYear=" + userYear
				+ ", runMiles=" + runMiles + ", colorCode=" + colorCode
				+ ", runAreaCode=" + runAreaCode + ", purchasePrice="
				+ purchasePrice + ", actualValue=" + actualValue
				+ ", transferDate=" + transferDate + ", noLicenseFlag="
				+ noLicenseFlag + ", chgOwnerFlag=" + chgOwnerFlag
				+ ", certificateDate=" + certificateDate + ", vehicleBrand="
				+ vehicleBrand + ", noDamageYears=" + noDamageYears
				+ ", loanVehicleFlag=" + loanVehicleFlag + ", specialCarFlag="
				+ specialCarFlag + ", fuelType=" + fuelType + ", net=" + net
				+ ", exhaustScale=" + exhaustScale + ", powerScale="
				+ powerScale + ", seatCount=" + seatCount + ", carBookingTime="
				+ carBookingTime + ", carRegiste=" + carRegiste
				+ ", certificateDateBJ=" + certificateDateBJ
				+ ", certificateType=" + certificateType + ", certificateNo="
				+ certificateNo + ", carFairValue=" + carFairValue
				+ ", industryModelCode=" + industryModelCode + ", usedCarType="
				+ usedCarType + ", depreciation=" + depreciation
				+ ", isPrintModelAlias=" + isPrintModelAlias + ", carType2="
				+ carType2 + ", carType3=" + carType3 + "]";
	}

	
}
