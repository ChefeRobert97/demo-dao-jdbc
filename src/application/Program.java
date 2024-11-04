package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Department dep = new Department(1, "Books");
//		System.out.println(dep);
		
		Seller seller = new Seller(1, "Pelé", "Pelé97@gmail.com", sdf.parse("15/08/1997 08:00:30"), 3000.00, dep);
		System.out.println(seller);
	}

}
