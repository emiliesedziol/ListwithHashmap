package hashMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class hashMap {

	public static void main(String[] args) {

		List<HashMap> couponList = new ArrayList<>();

		Map<String, String> coupons = new HashMap<>();

		coupons.put("Description", "Shampoo");
		coupons.put("Discount", ".50");
		coupons.put("Manufacture", "PG");
		couponList.add((HashMap) coupons);

		Map<String, String> couponsTwo = new HashMap<>();

		couponsTwo.put("Description", "Meat");
		couponsTwo.put("Discount", ".25");
		couponsTwo.put("Manufacture", "Hormel");
		couponList.add((HashMap) couponsTwo);

		Map<String, String> couponsThree = new HashMap<>();

		couponsThree.put("Description", "Begal");
		couponsThree.put("Discount", ".35");
		couponsThree.put("Manufacture", "Thomas");
		couponList.add((HashMap) couponsThree);

		Map<String, String> couponsFour = new HashMap<>();

		couponsFour.put("Description", "Spinach");
		couponsFour.put("Discount", ".15");
		couponsFour.put("Manufacture", "Select");
		couponList.add((HashMap) couponsFour);

		Map<String, String> couponsFive = new HashMap<>();

		couponsFive.put("Description", "Crackers");
		couponsFive.put("Discount", ".45");
		couponsFive.put("Manufacture", "Nature Made");
		couponList.add((HashMap) couponsFive);

		System.out.println(couponList);
		int a;
		// System.out.println("before sort");
		List<List<String>> listOfList = new ArrayList<List<String>>();
		for (int i = 0; i < couponList.size(); i++) {
			HashMap<String, String> tmpData = (HashMap<String, String>) couponList.get(i);
			Set<String> key = tmpData.keySet();
			Iterator it = key.iterator();
			// System.out.println("");
			// System.out.println("new hashmap");
			List<String> tmpList = new ArrayList();
			while (it.hasNext()) {
				String hmKey = (String) it.next();
				String hmData = (String) tmpData.get(hmKey);
				tmpList.add(hmData);
				// System.out.println("Key " + hmKey + " Data " + hmData);
			}
			listOfList.add(tmpList);
			System.out.println(listOfList);
		}



		List<HashMap> couponNewList = new ArrayList<>();

		Map<String, String> couponsNew = new HashMap<>();

		for (int i = 0; i < listOfList.size(); i++) {
			List<String> tmp = listOfList.get(i);

			System.out.println(tmp);
			System.out.println(tmp.get(0));

			if (couponNewList.size() < 4) {
				Map<String, String> tmpCoupon = new HashMap<>();

				tmpCoupon.put("Description", tmp.get(0));
				tmpCoupon.put("Discount", tmp.get(1));
				tmpCoupon.put("Manufacture", tmp.get(2));
				couponNewList.add((HashMap) tmpCoupon);
				System.out.println(tmpCoupon);
			}
		}
		System.out.println("new list");
		System.out.println(couponNewList);

	}
	
}	
		
		
	
	
	

