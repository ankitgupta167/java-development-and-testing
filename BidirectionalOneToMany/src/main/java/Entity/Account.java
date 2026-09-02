package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Account {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private long ac_no;
	private String accountHolderName;
	@ManyToOne()
	@JoinColumn(name = "bank_id")
	private Bank bank;
	
	public Account() {
		
	}
	
	public Account( long ac_no, String accountHolderName,Bank bank) {
				this.ac_no = ac_no;
		this.accountHolderName = accountHolderName;
		this.bank=bank;
	}
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAc_no() {
		return ac_no;
	}
	public void setAc_no(long ac_no) {
		this.ac_no = ac_no;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	
}
