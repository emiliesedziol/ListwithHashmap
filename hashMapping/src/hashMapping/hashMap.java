package hashMapping;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class hashMap {

	@SuppressWarnings("unchecked")
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
		for (int i = 0; i < itemList.size(); i++) {
			System.out.println(itemList.get(i));
		}
		/*
		 * unsorted and before percentage paid off
		 * {loan=10000.00, paidoff=5893.12, name=Vador, make=Infiniti}
		 * {loan=12000.00, paidoff=4289.22, name=Dennis, make=Chysler}
		 * {loan=5000.00, paidoff=1232.99, name=Sidney, make=Buick}
		 * {loan=32500.00, paidoff=3100.45, name=Myles, make=Chevy}
		 * {loan=45990.00, paidoff=12978.12, name=Angus, make=Lexus}
		 */

		System.out.println("");
		// calculate percentage remaining
		List<HashMap> listOfList = new ArrayList<>();
		DecimalFormat df = new DecimalFormat("0.00");
		df.setMaximumFractionDigits(2);

		for (int j = 0; j < itemList.size(); j++) {
			Map<String, Object> tmpData = itemList.get(j);
			Set<String> key = tmpData.keySet();
			Iterator<String> it = key.iterator();
			Map<String, Object> tmpList = new HashMap<>();
			double loan = 0.0;
			double paidoff = 0.0;
			while (it.hasNext()) {
				String hmKey = (String) it.next();
				String hmData = (String) tmpData.get(hmKey);

				if (hmKey == "loan") {
					loan = Double.parseDouble(hmData);
					tmpList.put(hmKey, loan);
				} else {
					if (hmKey == "paidoff") {
						paidoff = Double.parseDouble(hmData);
						tmpList.put(hmKey, paidoff);
					} else {
						tmpList.put(hmKey, hmData);
					}

				}
			}
			double percentLeft = (((loan - paidoff) * 100) / loan) * -1;
			String pl = df.format(percentLeft);
			double plD = Double.parseDouble(pl);
			tmpList.put("percent", plD);
			listOfList.add((HashMap) tmpList);
		}

		System.out.println(listOfList);

		System.out.println("");
		for (int i = 0; i < listOfList.size(); i++) {
			System.out.println(listOfList.get(i));
		}

		/*
		 * unsorted
		 * {loan=10000.0, paidoff=5893.12, name=Vador, make=Infiniti, percent=-41.07}
		 * {loan=12000.0, paidoff=4289.22, name=Dennis, make=Chysler, percent=-64.26}
		 * {loan=5000.0, paidoff=1232.99, name=Sidney, make=Buick, percent=-75.34}
		 * {loan=32500.0, paidoff=3100.45, name=Myles, make=Chevy, percent=-90.46}
		 * {loan=45990.0, paidoff=12978.12, name=Angus, make=Lexus, percent=-71.78}
		 */

		listOfList.sort(Comparator.comparing(m -> (double) m.get("percent")));

		System.out.println("");
		for (int i = 0; i < listOfList.size(); i++) {
			System.out.println(listOfList.get(i));

		}

		/*
 	 	 * Leaving loan as a positive will sort least paid off to most paid off
		 * Changing loan to be a negative changed the sort order
		 * {loan=32500.0, paidoff=3100.45, name=Myles, make=Chevy, percent=-90.46}
		 * {loan=5000.0, paidoff=1232.99, name=Sidney, make=Buick, percent=-75.34}
		 * {loan=45990.0, paidoff=12978.12, name=Angus, make=Lexus, percent=-71.78}
		 * {loan=12000.0, paidoff=4289.22, name=Dennis, make=Chysler, percent=-64.26}
		 * {loan=10000.0, paidoff=5893.12, name=Vador, make=Infiniti, percent=-41.07}
		 */

		listOfList.sort(Comparator.comparing(m -> (double) m.get("percent")));

		System.out.println("");
		for (int i = 0; i < listOfList.size(); i++) {
			System.out.println(listOfList.get(i));
		}
	}

}
