package application;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
//		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//		Department d = new Department(1, "Books");
//		Date date = sdf.parse("07/04/1997 16:43:01");
		
//		Seller s = new Seller(1, "Robert", "Robert@gmail.com", date, 3000.0, d);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: SELLER FINDBYID ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: SELLER FINDBYDEPARTMENT ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: SELLER FINDALL ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 4: SELLER INSERT ===");
		Seller newSeller = new Seller(null, "Greg", "Greg@gmail.com", new Date(),4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Insert! new id = " + newSeller.getId());

		System.out.println("\n=== TEST 5: SELLER UPDATE ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed! ");
		
		System.out.println("\n=== TEST 6: SELLER DELETE ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed! ");
		
		sc.close();
	}

}
