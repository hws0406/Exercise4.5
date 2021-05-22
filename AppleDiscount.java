class AppleDiscount implements Discount { //use implements - lebih kurang sama dengan inherit guna extends
	//this is sub class for super class of Discount
	public float rateOfDiscount(){ //method with body
		return 0.20f;
		}  
}

class DurianDiscount implements Discount {
	public float rateOfDiscount(){
		return 0.15f;
		}  	  
}

class MangoDiscount implements getdiscount{
	public float rateofdiscount() {
		return 0.10f;
		}
}
