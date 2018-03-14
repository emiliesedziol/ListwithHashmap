package hashMapping;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class holdHashMap {

	public static void main(String[] args) {

		List<HashMap> itemList = new ArrayList<>();

		Map<String, Object> hashmapList = new HashMap<>();

		// sort by percentage paid off

		hashmapList.put("name", "Vador");
		hashmapList.put("loan", "10000.00");
		hashmapList.put("make", "Infiniti");
		hashmapList.put("paidoff", "5893.12");
		itemList.add((HashMap) hashmapList);

		Map<String, Object> hashmap2List = new HashMap<>();

		hashmap2List.put("name", "Dennis");
		hashmap2List.put("loan", "12000.00");
		hashmap2List.put("make", "Chysler");
		hashmap2List.put("paidoff", "4289.22");
		itemList.add((HashMap) hashmap2List);
		
		Map<String, Object> hashmap3List = new HashMap<>();

		hashmap3List.put("name", "Sidney");
		hashmap3List.put("loan", "5000.00");
		hashmap3List.put("make", "Buick");
		hashmap3List.put("paidoff", "1232.99"); 
		itemList.add((HashMap) hashmap3List);

		Map<String, Object> hashmap4List = new HashMap<>();

		hashmap4List.put("name", "Myles");
		hashmap4List.put("loan", "32500.00");
		hashmap4List.put("make", "Chevy");
		hashmap4List.put("paidoff", "3100.45");
		itemList.add((HashMap) hashmap4List);

		Map<String, Object> hashmap5List = new HashMap<>();

		hashmap5List.put("name", "Angus");
		hashmap5List.put("loan", "45990.00");
		hashmap5List.put("make", "Lexus");
		hashmap5List.put("paidoff", "12978.12");
		itemList.add((HashMap) hashmap5List);
		
		System.out.println("");
		for (int i=0;i<itemList.size();i++) {
			System.out.println(itemList.get(i));
		}
		
	// calculate percentage remaining
		// System.out.println("before sort");
		List<List<String>> listOfList = new ArrayList<List<String>>();
		DecimalFormat df = new DecimalFormat("0.00");
		df.setMaximumFractionDigits(2);
		for (int i = 0; i < itemList.size(); i++) {
			HashMap<String, String> tmpData = (HashMap<String, String>) itemList.get(i);
			Set<String> key = tmpData.keySet();
			Iterator it = key.iterator();
			// System.out.println("");
			// System.out.println("new hashmap");
			List<String> tmpList = new ArrayList();
			double loan = 0.0;
			double paidoff = 0.0;
			while (it.hasNext()) {
				String hmKey = (String) it.next();
				String hmData = (String) tmpData.get(hmKey);
				if (hmKey == "loan") {
					loan = Double.parseDouble(hmData);
				}
				if (hmKey == "paidoff") {
					paidoff = Double.parseDouble(hmData);
				}
				tmpList.add(hmData);
				// System.out.println("Key " + hmKey + " Data " + hmData);
			}
		//	System.out.println("loan " + df.format(loan));
		//	System.out.println("paidoff " + paidoff);
			double percentLeft = ((loan - paidoff) * 100) / loan;
		//	System.out.println(df.format(percentLeft));
			String pL = df.format(percentLeft);
			tmpList.add(pL);
			System.out.println(tmpList);
			listOfList.add(tmpList);
		//	System.out.println(listOfList);
		}



		List<HashMap> newList = new ArrayList<>();

		for (int i = 0; i < listOfList.size(); i++) {
			List<String> tmp = listOfList.get(i);

	//		System.out.println("tmp " + tmp);
	//		System.out.println("tmp.get(0) " + tmp.get(0));

				Map<String, Object> tmpItem = new HashMap<>();

				tmpItem.put("name", tmp.get(2));
				tmpItem.put("Make", tmp.get(3));
				tmpItem.put("loan", tmp.get(0));
				tmpItem.put("paidoff", tmp.get(1));
				tmpItem.put("percent", tmp.get(4));
				newList.add((HashMap) tmpItem);
			//	System.out.println(tmpItem);
		}
		System.out.println("new list");
		System.out.println(newList);

		// sort by percentage
		newList.sort(Comparator.comparing(m -> (double)m.get("percent")));

	}

}
