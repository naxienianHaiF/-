package com.baobeisystem.entity.carSearch;
/**
 * 车型查询接口的输出对象
 * @author WJH
 * @version private String.0
 */
public class CarModelDTO {

	public CarModelDTO(){
		
	}
	
	private String modelCode;
	private String modelName;
	private String brandCN;
	private String factoryName;
	private String series;
	private String importFlag;
	private int ratedPassengerCapacity;
	private double totalVehicleWeight;
	private String derailleurType;
	private String alarmFlag;
	private double airbagNum;
	private String vehicleDescription;
	private String displacement;
	private String marketYear;
	private double replacementValue;
	private double replacementValueLower;
	private double priceFloatRateLower;
	private double priceFloatRateUpper;
	private String searchCode;
	private String power;
	private String powerType;
	private String hfName;
	private String vehicleAlias;
	private String vehicleClassCode;
	private String vehicleClassName;
	private String industryModelCode;
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
	public String getBrandCN() {
		return brandCN;
	}
	public void setBrandCN(String brandCN) {
		this.brandCN = brandCN;
	}
	public String getFactoryName() {
		return factoryName;
	}
	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getImportFlag() {
		return importFlag;
	}
	public void setImportFlag(String importFlag) {
		this.importFlag = importFlag;
	}
	public int getRatedPassengerCapacity() {
		return ratedPassengerCapacity;
	}
	public void setRatedPassengerCapacity(int ratedPassengerCapacity) {
		this.ratedPassengerCapacity = ratedPassengerCapacity;
	}
	public double getTotalVehicleWeight() {
		return totalVehicleWeight;
	}
	public void setTotalVehicleWeight(double totalVehicleWeight) {
		this.totalVehicleWeight = totalVehicleWeight;
	}
	public String getDerailleurType() {
		return derailleurType;
	}
	public void setDerailleurType(String derailleurType) {
		this.derailleurType = derailleurType;
	}
	public String getAlarmFlag() {
		return alarmFlag;
	}
	public void setAlarmFlag(String alarmFlag) {
		this.alarmFlag = alarmFlag;
	}
	public double getAirbagNum() {
		return airbagNum;
	}
	public void setAirbagNum(double airbagNum) {
		this.airbagNum = airbagNum;
	}
	public String getVehicleDescription() {
		return vehicleDescription;
	}
	public void setVehicleDescription(String vehicleDescription) {
		this.vehicleDescription = vehicleDescription;
	}
	public String getDisplacement() {
		return displacement;
	}
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
	public String getMarketYear() {
		return marketYear;
	}
	public void setMarketYear(String marketYear) {
		this.marketYear = marketYear;
	}
	public double getReplacementValue() {
		return replacementValue;
	}
	public void setReplacementValue(double replacementValue) {
		this.replacementValue = replacementValue;
	}
	public double getReplacementValueLower() {
		return replacementValueLower;
	}
	public void setReplacementValueLower(double replacementValueLower) {
		this.replacementValueLower = replacementValueLower;
	}
	public double getPriceFloatRateLower() {
		return priceFloatRateLower;
	}
	public void setPriceFloatRateLower(double priceFloatRateLower) {
		this.priceFloatRateLower = priceFloatRateLower;
	}
	public double getPriceFloatRateUpper() {
		return priceFloatRateUpper;
	}
	public void setPriceFloatRateUpper(double priceFloatRateUpper) {
		this.priceFloatRateUpper = priceFloatRateUpper;
	}
	public String getSearchCode() {
		return searchCode;
	}
	public void setSearchCode(String searchCode) {
		this.searchCode = searchCode;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getPowerType() {
		return powerType;
	}
	public void setPowerType(String powerType) {
		this.powerType = powerType;
	}
	public String getHfName() {
		return hfName;
	}
	public void setHfName(String hfName) {
		this.hfName = hfName;
	}
	public String getVehicleAlias() {
		return vehicleAlias;
	}
	public void setVehicleAlias(String vehicleAlias) {
		this.vehicleAlias = vehicleAlias;
	}
	public String getVehicleClassCode() {
		return vehicleClassCode;
	}
	public void setVehicleClassCode(String vehicleClassCode) {
		this.vehicleClassCode = vehicleClassCode;
	}
	public String getVehicleClassName() {
		return vehicleClassName;
	}
	public void setVehicleClassName(String vehicleClassName) {
		this.vehicleClassName = vehicleClassName;
	}
	public String getIndustryModelCode() {
		return industryModelCode;
	}
	public void setIndustryModelCode(String industryModelCode) {
		this.industryModelCode = industryModelCode;
	}
	@Override
	public String toString() {
		return "CarModelDTO [modelCode=" + modelCode + ", modelName="
				+ modelName + ", brandCN=" + brandCN + ", factoryName="
				+ factoryName + ", series=" + series + ", importFlag="
				+ importFlag + ", ratedPassengerCapacity="
				+ ratedPassengerCapacity + ", totalVehicleWeight="
				+ totalVehicleWeight + ", derailleurType=" + derailleurType
				+ ", alarmFlag=" + alarmFlag + ", airbagNum=" + airbagNum
				+ ", vehicleDescription=" + vehicleDescription
				+ ", displacement=" + displacement + ", marketYear="
				+ marketYear + ", replacementValue=" + replacementValue
				+ ", replacementValueLower=" + replacementValueLower
				+ ", priceFloatRateLower=" + priceFloatRateLower
				+ ", priceFloatRateUpper=" + priceFloatRateUpper
				+ ", searchCode=" + searchCode + ", power=" + power
				+ ", powerType=" + powerType + ", hfName=" + hfName
				+ ", vehicleAlias=" + vehicleAlias + ", vehicleClassCode="
				+ vehicleClassCode + ", vehicleClassName=" + vehicleClassName
				+ ", industryModelCode=" + industryModelCode + "]";
	}
	

	
}
