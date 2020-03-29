
public class Product implements Comparable<Product> {
	private String productName;
	private int productNum;
	public Product(String productName, int productNum) {
		this.productName = productName;
		this.productNum = productNum;
	
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public int compareTo(Product compareProduct) {
		
		return this.productNum-compareProduct.productNum;
		
	}
	
	public String getProductName() {
		return productName;
	}
	public int getProductNum() {
		return productNum;
	}
	
	public String toString() {
		return "productName:" + productName + " productNum:" + productNum;
	}
}
