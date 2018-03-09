package hashMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class hashMap {

	public static void main(String[] args) {

		List<HashMap> itemList = new ArrayList<>();

		Map<String, Object> hashmapList = new HashMap<>();

		// sort by percentage paid off

		hashmapList.put("name", "Vador");
		hashmapList.put("loan", 10000.00);
		hashmapList.put("make", "Infiniti");
		hashmapList.put("paidoff", 5893.12);
		itemList.add((HashMap) hashmapList);

		Map<String, Object> hashmap2List = new HashMap<>();

		hashmap2List.put("name", "Dennis");
		hashmap2List.put("loan", 12000.00);
		hashmap2List.put("make", "Chysler");
		hashmapList.put("paidoff", 4289.22);
		itemList.add((HashMap) hashmap2List);

		Map<String, Object> hashmap3List = new HashMap<>();

		hashmap3List.put("name", "Sidney");
		hashmap3List.put("loan", 5000.00);
		hashmap3List.put("make", "Buick");
		hashmapList.put("paidoff", 1232.990); 
		itemList.add((HashMap) hashmap3List);

		Map<String, Object> hashmap4List = new HashMap<>();

		hashmap4List.put("name", "Myles");
		hashmap4List.put("loan", 32500.00);
		hashmap4List.put("make", "Chevy");
		hashmapList.put("paidoff", 3100.45);
		itemList.add((HashMap) hashmap4List);

		Map<String, Object> hashmap5List = new HashMap<>();

		hashmap5List.put("name", "Angus");
		hashmap5List.put("loan", 45990.00);
		hashmap5List.put("make", "Lexus");
		hashmapList.put("paidoff", 12978.12);
		itemList.add((HashMap) hashmap5List);

		System.out.println(itemList);
		int a;
		// System.out.println("before sort");
		List<List<String>> listOfList = new ArrayList<List<String>>();
		for (int i = 0; i < itemList.size(); i++) {
			HashMap<String, String> tmpData = (HashMap<String, String>) itemList.get(i);
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



		List<HashMap> newList = new ArrayList<>();

		Map<String, String> couponsNew = new HashMap<>();

		for (int i = 0; i < listOfList.size(); i++) {
			List<String> tmp = listOfList.get(i);

			System.out.println(tmp);
			System.out.println(tmp.get(0));

			if (newList.size() < 4) {
				Map<String, String> tmpCoupon = new HashMap<>();

				tmpCoupon.put("Description", tmp.get(0));
				tmpCoupon.put("Discount", tmp.get(1));
				tmpCoupon.put("Manufacture", tmp.get(2));
				newList.add((HashMap) tmpCoupon);
				System.out.println(tmpCoupon);
			}
		}
		System.out.println("new list");
		System.out.println(newList);

	}
	
}	
		
		
	
	
	

