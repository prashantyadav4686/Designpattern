package MVCProgram;

public class Main {
	public static void main(String[] args) {
		// Fetch customer record 
		CustomerModel model =new CustomerModel();
		model= retriveCustomerDetails();
    
   // create a view 
	CustomerView view = new CustomerView();
	
	CustomerController controller = new CustomerController( model , view);
	controller.updateView();
	
	// Update name Only
	controller.setCustomerName("Nikunj");
	controller.updateView();
	
	// Update Name as well as Id 
	controller.setCustomerName("Abhishek");
	controller.setCustomerId("3245");
	controller.updateView();
}
	private static CustomerModel retriveCustomerDetails() {
         CustomerModel customer = new CustomerModel() ;
         customer.setName("Harsh");
         customer.setId("3423");
		return customer;
         
	}
}