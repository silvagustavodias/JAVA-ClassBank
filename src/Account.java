
public class Account {

	// declaração de variáveis que irão compor as classes
	public int accountNumber;
	protected String accountType;
	private String accountOwner;
	protected float balance;
	protected boolean status;
	
	// métodos getters and setters
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountOwner() {
		return accountOwner;
	}
	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public Account() {
		setStatus(false);
		setBalance(0);
	}
	

	
	
	
	
}
