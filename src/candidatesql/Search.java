package candidatesql;

import com.opensymphony.xwork2.ActionSupport;

public class Search extends ActionSupport
{
	
	private static int searchsalary;								//Fetching required salary from Profile.
	
	//Generating getters and setters
	
	public int getSearchsalary() {
		return searchsalary;
	}

	public void setSearchsalary(int searchsalary) {
		this.searchsalary = searchsalary;
	}
		
	public Search()											//to send searchsalary to servet
	{
		this.searchsalary=searchsalary;
	}
	
	public String execute()
	{
		return "success";
	}
}
