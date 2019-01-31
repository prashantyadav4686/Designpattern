package MVCProgram;

public class CustomerController {
	private CustomerModel model ;
	private CustomerView view ;
	
	public CustomerController(CustomerModel model , CustomerView view) {
		this.model = model ;
		this.view = view ;
	
	}
    public void setCustomerName(String name) {
    	model.setName(name);
    }
    public String getCustomerName() {
    	return model.getName();
    }
    public void setCustomerId(String id) {
    	model.setId(id);
    }
    public String getCustomerId() {
    	return model.getId();
    }
    public void updateView() {
    	view.printCustomerDetails(model.getName() ,model.getId() );
    }
}
