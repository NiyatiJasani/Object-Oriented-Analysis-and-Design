package srp.violation;

public class Invoice {
	
	private int id;
	private String name;
	private double cost;
	private float discount;
	
	public Invoice(int id, String name, double cost, float discount){
		this.id=id;
		this.name=name;
		this.cost=cost;
		this.discount=discount;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public float getDiscount() {
		return discount;
	}

	public double calculateDiscountCost(){
		return cost * discount;
	}
	
	public double calculateTax(){
		return cost *calculateDiscountCost();
	}
	
	public double claculateTotalCost(){
		return discount + calculateTax();
	}
	
	public void print(){
			System.out.println("Name: " + getName());
			System.out.println("ID: " + getId());
			System.out.println("Discount:" +calculateDiscountCost());
			System.out.println("Tax:" + calculateTax());
			System.out.println("TotalCost "+ claculateTotalCost());
		}
	}
	



