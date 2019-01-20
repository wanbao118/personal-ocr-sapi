/**
MIT License

Copyright (c) 2019 wanbao118@outlook.com

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package edu.xust.ocr.sapi.model;

/**
 * @author jiangwanbao
 *
 */
public class InvoiceResult {
	
	private Result buyerName;
	
	private Result buyerTaxNo;
	
	private Result buyerAddress;
	
	private Result buyerBankInfo;
	
	private Result sellerName;
	
	private Result sellerTaxNo;
	
	private Result sellerAddress;
	
	private Result sellerBankInfo;
	
	private Result createDate;
	
	private Result amountBig;
	
	private Result amountSmall;
	
	private Result total;
	
	private Result totalTax;
	
	private Result invoiceCode1;
	
	private Result invoiceCode2;
	
	private Result invoiceNo1;
	
	private Result invoiceNo2;
	
	private Result checkCode;
	
	private Result receiver;
	
	private Result check;
	
	private Result creator;
	
	private Result qrcode;

	/**
	 * @return the buyerName
	 */
	public Result getBuyerName() {
		return buyerName;
	}

	/**
	 * @param buyerName the buyerName to set
	 */
	public void setBuyerName(Result buyerName) {
		this.buyerName = buyerName;
	}

	/**
	 * @return the buyerTaxNo
	 */
	public Result getBuyerTaxNo() {
		return buyerTaxNo;
	}

	/**
	 * @param buyerTaxNo the buyerTaxNo to set
	 */
	public void setBuyerTaxNo(Result buyerTaxNo) {
		this.buyerTaxNo = buyerTaxNo;
	}

	/**
	 * @return the buyerAddress
	 */
	public Result getBuyerAddress() {
		return buyerAddress;
	}

	/**
	 * @param buyerAddress the buyerAddress to set
	 */
	public void setBuyerAddress(Result buyerAddress) {
		this.buyerAddress = buyerAddress;
	}

	/**
	 * @return the buyerBankInfo
	 */
	public Result getBuyerBankInfo() {
		return buyerBankInfo;
	}

	/**
	 * @param buyerBankInfo the buyerBankInfo to set
	 */
	public void setBuyerBankInfo(Result buyerBankInfo) {
		this.buyerBankInfo = buyerBankInfo;
	}

	/**
	 * @return the sellerName
	 */
	public Result getSellerName() {
		return sellerName;
	}

	/**
	 * @param sellerName the sellerName to set
	 */
	public void setSellerName(Result sellerName) {
		this.sellerName = sellerName;
	}

	/**
	 * @return the sellerTaxNo
	 */
	public Result getSellerTaxNo() {
		return sellerTaxNo;
	}

	/**
	 * @param sellerTaxNo the sellerTaxNo to set
	 */
	public void setSellerTaxNo(Result sellerTaxNo) {
		this.sellerTaxNo = sellerTaxNo;
	}

	/**
	 * @return the sellerAddress
	 */
	public Result getSellerAddress() {
		return sellerAddress;
	}

	/**
	 * @param sellerAddress the sellerAddress to set
	 */
	public void setSellerAddress(Result sellerAddress) {
		this.sellerAddress = sellerAddress;
	}

	/**
	 * @return the sellerBankInfo
	 */
	public Result getSellerBankInfo() {
		return sellerBankInfo;
	}

	/**
	 * @param sellerBankInfo the sellerBankInfo to set
	 */
	public void setSellerBankInfo(Result sellerBankInfo) {
		this.sellerBankInfo = sellerBankInfo;
	}

	/**
	 * @return the createDate
	 */
	public Result getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Result createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the amountBig
	 */
	public Result getAmountBig() {
		return amountBig;
	}

	/**
	 * @param amountBig the amountBig to set
	 */
	public void setAmountBig(Result amountBig) {
		this.amountBig = amountBig;
	}

	/**
	 * @return the amountSmall
	 */
	public Result getAmountSmall() {
		return amountSmall;
	}

	/**
	 * @param amountSmall the amountSmall to set
	 */
	public void setAmountSmall(Result amountSmall) {
		this.amountSmall = amountSmall;
	}

	/**
	 * @return the total
	 */
	public Result getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Result total) {
		this.total = total;
	}

	/**
	 * @return the totalTax
	 */
	public Result getTotalTax() {
		return totalTax;
	}

	/**
	 * @param totalTax the totalTax to set
	 */
	public void setTotalTax(Result totalTax) {
		this.totalTax = totalTax;
	}

	/**
	 * @return the invoiceCode1
	 */
	public Result getInvoiceCode1() {
		return invoiceCode1;
	}

	/**
	 * @param invoiceCode1 the invoiceCode1 to set
	 */
	public void setInvoiceCode1(Result invoiceCode1) {
		this.invoiceCode1 = invoiceCode1;
	}

	/**
	 * @return the invoiceCode2
	 */
	public Result getInvoiceCode2() {
		return invoiceCode2;
	}

	/**
	 * @param invoiceCode2 the invoiceCode2 to set
	 */
	public void setInvoiceCode2(Result invoiceCode2) {
		this.invoiceCode2 = invoiceCode2;
	}

	/**
	 * @return the invoiceNo1
	 */
	public Result getInvoiceNo1() {
		return invoiceNo1;
	}

	/**
	 * @param invoiceNo1 the invoiceNo1 to set
	 */
	public void setInvoiceNo1(Result invoiceNo1) {
		this.invoiceNo1 = invoiceNo1;
	}

	/**
	 * @return the invoiceNo2
	 */
	public Result getInvoiceNo2() {
		return invoiceNo2;
	}

	/**
	 * @param invoiceNo2 the invoiceNo2 to set
	 */
	public void setInvoiceNo2(Result invoiceNo2) {
		this.invoiceNo2 = invoiceNo2;
	}

	/**
	 * @return the checkCode
	 */
	public Result getCheckCode() {
		return checkCode;
	}

	/**
	 * @param checkCode the checkCode to set
	 */
	public void setCheckCode(Result checkCode) {
		this.checkCode = checkCode;
	}

	/**
	 * @return the receiver
	 */
	public Result getReceiver() {
		return receiver;
	}

	/**
	 * @param receiver the receiver to set
	 */
	public void setReceiver(Result receiver) {
		this.receiver = receiver;
	}

	/**
	 * @return the check
	 */
	public Result getCheck() {
		return check;
	}

	/**
	 * @param check the check to set
	 */
	public void setCheck(Result check) {
		this.check = check;
	}

	/**
	 * @return the creator
	 */
	public Result getCreator() {
		return creator;
	}

	/**
	 * @param creator the creator to set
	 */
	public void setCreator(Result creator) {
		this.creator = creator;
	}

	/**
	 * @return the qrcode
	 */
	public Result getQrcode() {
		return qrcode;
	}

	/**
	 * @param qrcode the qrcode to set
	 */
	public void setQrcode(Result qrcode) {
		this.qrcode = qrcode;
	}

}
