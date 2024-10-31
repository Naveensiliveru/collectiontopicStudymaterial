package loveAmma;

public class Product {
	private int  product_id;
	private String product_name;
	private double  product_price;
	private  double   product_rating;
	
	public Product(int product_id, String product_name, double product_price, double product_rating) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_rating = product_rating;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public double getProduct_rating() {
		return product_rating;
	}
	public void setProduct_rating(double product_rating) {
		this.product_rating = product_rating;
	}
	

}
