package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Department d = new Department(1, "Books");
		Date date = sdf.parse("07/04/1997 16:43:01");
		
		Seller s = new Seller(1, "Robert", "Robert@gmail.com", date, 3000.0, d);
		System.out.println(s);
		
	}

}
