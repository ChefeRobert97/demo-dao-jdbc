package application;

import java.text.ParseException;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
//		Department dep = new Department(1, "Books");
//		System.out.println(dep);
		
//		Seller seller = new Seller(1, "Pelé", "Pelé97@gmail.com", sdf.parse("15/08/1997 08:00:30"), 3000.00, dep);
//		System.out.println(seller);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
	}

}
