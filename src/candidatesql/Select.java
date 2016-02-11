package candidatesql;

import com.opensymphony.xwork2.ActionSupport;

public class Select extends ActionSupport
{
	private String select;
	
	//Generating getters and setters

	public String getSelect() {
		return select;
	}

	public void setSelect(String select) {
		this.select = select;
	}
	
	public String execute()
	{
		if(select.equalsIgnoreCase("recruiter"))
		{
			return "recruiter";
		}
		
		else if(select.equalsIgnoreCase("candidate"))
		{
			return "candidate";
		}
		
		else if(select.equalsIgnoreCase("admin"))
		{
			return "admin";
		}
		
		else if(select.equalsIgnoreCase("about us"))
		{
			return "aboutus";
		}
		
		else if(select.equalsIgnoreCase("contact us"))
		{
			return "contactus";
		}
		
		else
		{
			return "fail";
		}
	}


}
