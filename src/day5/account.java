package day5;
public class account {

private long acno;
private string name;
private float bal;
public account(long acno,string name,float bal);
this.acno=acno;
this.name=name;
this.bal=bal;
}
public void deposit(float amt) {
	this.bal t=amt;
	System.out.println("Rs." + amt + "credited|balance:" + this.bal);
}
public void withdraw(float amt) {
	if(this.bal >= amt) {
		System.out.println("rs. "+ amt + "debited|balance:" + this.bal);
	}
	else
	{
		System.err.println("ERROR:INSUFFICIENT BALANCE");
	

	}

}

