package candidatesql;

import com.opensymphony.xwork2.ActionSupport;

public class Rsearch extends ActionSupport
{
	private String timings;
	
	//Generating getters and setters
	
	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}
	
	public String execute()
	{
		return "success";
	}
}
