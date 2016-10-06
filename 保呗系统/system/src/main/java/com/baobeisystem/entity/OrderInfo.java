package com.baobeisystem.entity;
/**
 * 订单信息
 * @author WJH
 */
public class OrderInfo {

	private int oid;
	private String ousername;
	private String proposalNoCI;   //交强险投保单号
	private String proposalNoBI;   //商业险投保单号
	private String startDateCIP;   //商业险起保日期
	private String startDateBZ;    //交强险起保日期
	
	private String licenseNo;      //车牌号
	private String frameNo;
	private String engineNo;
	private String modelName;      //车型名称
	private String registerDate;   //注册日期
	private String chgOwnerFlag;
	//车主信息
	private String carOwner;       //姓名
	private String identifyType;   //证件类型
	private String identifyNumber; //证件号
	private String mobile;         //手机号码
	private String address;		   //地址
	//投保人信息
	private String tcarOwner;
	private String tidentifyType;
	private String tidentifyNumber;
	private String tmobile;         //手机号码
	private String taddress;//地址
	//被投保人信息
	private String bcarOwner;
	private String bidentifyType;
	private String bidentifyNumber;
	private String bmobile;         //手机号码
	private String baddress;//地址
	//配送地址
	private String peisongType;     //配送方式
	private String reciever;        //接收人
	private String phonenumber;
	private String appliAddress;
	//险别信息
	private String chechuantax;		//车船税
	private String jiaoqiangtax;    //交强险
	private String chesuntax;		//车船险
	private String sanzetax;        //三责险
	private String jdsstax;         //机动损失险
	private String sydszzrxString;  //商业第三者责任保险
	
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOusername() {
		return ousername;
	}
	public void setOusername(String ousername) {
		this.ousername = ousername;
	}
	public String getProposalNoCI() {
		return proposalNoCI;
	}
	public void setProposalNoCI(String proposalNoCI) {
		this.proposalNoCI = proposalNoCI;
	}
	public String getProposalNoBI() {
		return proposalNoBI;
	}
	public void setProposalNoBI(String proposalNoBI) {
		this.proposalNoBI = proposalNoBI;
	}
	public String getStartDateCIP() {
		return startDateCIP;
	}
	public void setStartDateCIP(String startDateCIP) {
		this.startDateCIP = startDateCIP;
	}
	public String getStartDateBZ() {
		return startDateBZ;
	}
	public void setStartDateBZ(String startDateBZ) {
		this.startDateBZ = startDateBZ;
	}
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getFrameNo() {
		return frameNo;
	}
	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	public String getChgOwnerFlag() {
		return chgOwnerFlag;
	}
	public void setChgOwnerFlag(String chgOwnerFlag) {
		this.chgOwnerFlag = chgOwnerFlag;
	}
	public String getCarOwner() {
		return carOwner;
	}
	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTcarOwner() {
		return tcarOwner;
	}
	public void setTcarOwner(String tcarOwner) {
		this.tcarOwner = tcarOwner;
	}
	public String getTidentifyType() {
		return tidentifyType;
	}
	public void setTidentifyType(String tidentifyType) {
		this.tidentifyType = tidentifyType;
	}
	public String getTidentifyNumber() {
		return tidentifyNumber;
	}
	public void setTidentifyNumber(String tidentifyNumber) {
		this.tidentifyNumber = tidentifyNumber;
	}
	public String getTmobile() {
		return tmobile;
	}
	public void setTmobile(String tmobile) {
		this.tmobile = tmobile;
	}
	public String getTaddress() {
		return taddress;
	}
	public void setTaddress(String taddress) {
		this.taddress = taddress;
	}
	public String getBcarOwner() {
		return bcarOwner;
	}
	public void setBcarOwner(String bcarOwner) {
		this.bcarOwner = bcarOwner;
	}
	public String getBidentifyType() {
		return bidentifyType;
	}
	public void setBidentifyType(String bidentifyType) {
		this.bidentifyType = bidentifyType;
	}
	public String getBidentifyNumber() {
		return bidentifyNumber;
	}
	public void setBidentifyNumber(String bidentifyNumber) {
		this.bidentifyNumber = bidentifyNumber;
	}
	public String getBmobile() {
		return bmobile;
	}
	public void setBmobile(String bmobile) {
		this.bmobile = bmobile;
	}
	public String getBaddress() {
		return baddress;
	}
	public void setBaddress(String baddress) {
		this.baddress = baddress;
	}
	public String getPeisongType() {
		return peisongType;
	}
	public void setPeisongType(String peisongType) {
		this.peisongType = peisongType;
	}
	public String getReciever() {
		return reciever;
	}
	public void setReciever(String reciever) {
		this.reciever = reciever;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAppliAddress() {
		return appliAddress;
	}
	public void setAppliAddress(String appliAddress) {
		this.appliAddress = appliAddress;
	}
	public String getChechuantax() {
		return chechuantax;
	}
	public void setChechuantax(String chechuantax) {
		this.chechuantax = chechuantax;
	}
	public String getJiaoqiangtax() {
		return jiaoqiangtax;
	}
	public void setJiaoqiangtax(String jiaoqiangtax) {
		this.jiaoqiangtax = jiaoqiangtax;
	}
	public String getChesuntax() {
		return chesuntax;
	}
	public void setChesuntax(String chesuntax) {
		this.chesuntax = chesuntax;
	}
	public String getSanzetax() {
		return sanzetax;
	}
	public void setSanzetax(String sanzetax) {
		this.sanzetax = sanzetax;
	}
	public String getJdsstax() {
		return jdsstax;
	}
	public void setJdsstax(String jdsstax) {
		this.jdsstax = jdsstax;
	}
	public String getSydszzrxString() {
		return sydszzrxString;
	}
	public void setSydszzrxString(String sydszzrxString) {
		this.sydszzrxString = sydszzrxString;
	}
	
	
	
	
}
