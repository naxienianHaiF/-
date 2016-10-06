package com.baobeisystem.entity.xiadan;
/**
 * 用户输入车询价单号等投保信息，调用cpi精确报价查询，将询价单转投保单；
 * @author WJH
 *
 */
public class QuoteToXD {

	private String seqNo;
	private String proposalNoCI;
	private String proposalNoBI;
	private String quotationNoCI;
	private String quotationNoBI;
	private String orderNo;
	private PrivyDTOToXD[] privys;
	private String appliAddress;
	private String sumPremiun;
	private String issueCode;
	private String issueCodeTime;
	private InvoiceDTOToXD invoice;
	private EngageDTOToXD[] engages;
	
	public QuoteToXD(){
		
	}
	
	public String getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
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
	public String getQuotationNoCI() {
		return quotationNoCI;
	}
	public void setQuotationNoCI(String quotationNoCI) {
		this.quotationNoCI = quotationNoCI;
	}
	public String getQuotationNoBI() {
		return quotationNoBI;
	}
	public void setQuotationNoBI(String quotationNoBI) {
		this.quotationNoBI = quotationNoBI;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public PrivyDTOToXD[] getPrivys() {
		return privys;
	}
	public void setPrivys(PrivyDTOToXD[] privys) {
		this.privys = privys;
	}
	public String getAppliAddress() {
		return appliAddress;
	}
	public void setAppliAddress(String appliAddress) {
		this.appliAddress = appliAddress;
	}
	public String getSumPremiun() {
		return sumPremiun;
	}
	public void setSumPremiun(String sumPremiun) {
		this.sumPremiun = sumPremiun;
	}
	public String getIssueCode() {
		return issueCode;
	}
	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}
	public String getIssueCodeTime() {
		return issueCodeTime;
	}
	public void setIssueCodeTime(String issueCodeTime) {
		this.issueCodeTime = issueCodeTime;
	}
	public InvoiceDTOToXD getInvoice() {
		return invoice;
	}
	public void setInvoice(InvoiceDTOToXD invoice) {
		this.invoice = invoice;
	}
	public EngageDTOToXD[] getEngages() {
		return engages;
	}
	public void setEngages(EngageDTOToXD[] engages) {
		this.engages = engages;
	}

}
