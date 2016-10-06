package com.baobeisystem.entity.accurate;

public class KindDTO {

	private String	kindCode;
	private int		quantity;
	private double	unitAmount;
	private double	amount;
	private String	modeCode;
	private String	kindFlag;
	private double	deductibleAmount;
	private double	deductibleRate;
	public String getKindCode() {
		return kindCode;
	}
	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitAmount() {
		return unitAmount;
	}
	public void setUnitAmount(double unitAmount) {
		this.unitAmount = unitAmount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getModeCode() {
		return modeCode;
	}
	public void setModeCode(String modeCode) {
		this.modeCode = modeCode;
	}
	public String getKindFlag() {
		return kindFlag;
	}
	public void setKindFlag(String kindFlag) {
		this.kindFlag = kindFlag;
	}
	public double getDeductibleAmount() {
		return deductibleAmount;
	}
	public void setDeductibleAmount(double deductibleAmount) {
		this.deductibleAmount = deductibleAmount;
	}
	public double getDeductibleRate() {
		return deductibleRate;
	}
	public void setDeductibleRate(double deductibleRate) {
		this.deductibleRate = deductibleRate;
	}
	
}
