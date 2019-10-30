package findTheCelebrity.main;

import java.util.ArrayList;
import java.util.List;

import findTheCelebrity.main.services.LoadData;

public class FindCelebApp {

	public static void main(String[] args) {
		
		LoadData ld = new LoadData();
		List<String> users = new ArrayList<String>();
		users = ld.getLines();
		
		try {
			//ld.fillMatrix();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
