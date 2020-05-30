package apr_19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.ArrayBlockingQueue;

class MapV implements Comparator<Map.Entry<String, Integer>> {

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		// TODO Auto-generated method stub
		if (o1.getValue() > o2.getValue())
			return 1;
		else
			return -1;
	}

}

class Emp implements Comparable<Emp> {
	String name;
	int id;

	public Emp(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		// return this.name.compareTo(o.name);
		if (this.id > o.id)
			return 1;
		if (this.id == o.id)
			return 0;
		else
			return -1;
	}

	int getId() {
		return this.id;
	}

	String getName() {
		return this.name;
	}
}

public class CollecionSortByV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// compDemo();
		sortMap();
	}

	public static void sortMap() {
		{
			Map<String, Integer> mp = new HashMap<String, Integer>();

			mp.put("hari", 1);
			mp.put("ramesh", 5);
			mp.put("aamir", 2);
			mp.put("bavi", 4);
			mp.put("cc", 0);
			mp.put("ee", 4);
           System.out.println("before sorting-------");
           			
			for (Map.Entry<String, Integer> m : mp.entrySet()) {
				System.out.println(m.getKey() + " :" + m.getValue());
			}			

			System.out.println("sorting by value----------");
			
			List<Map.Entry<String, Integer>> lst = new ArrayList<Map.Entry<String, Integer>>(mp.entrySet());
			Collections.sort(lst, new MapV());
			
			Map<String, Integer> ml = new LinkedHashMap<String, Integer>();
			
			for(Map.Entry<String, Integer> l:lst)
			{
				ml.put(l.getKey(),l.getValue());
			}
			
			for (Map.Entry<String, Integer> m : ml.entrySet()) {
				System.out.println(m.getKey() + " :" + m.getValue());
			}
			System.out.println("sorting by key--------------");
			TreeMap<String, Integer> tm = new TreeMap<String, Integer>(mp);

			for (Map.Entry<String, Integer> m : tm.entrySet()) {
				System.out.println(m.getKey() + " :" + m.getValue());
			}
		}

	}

	public void getManageComp() {
		List<Emp> ls = new ArrayList<Emp>();
		Emp emp = new Emp("varun", 8);
		ls.add(emp);
		Emp emp1 = new Emp("ravi", 3);
		ls.add(emp1);

		Emp emp2 = new Emp("ankit", 5);
		ls.add(emp2);
		System.out.println("size;" + ls.size());

		// ls.forEach(a->System.out.println(a.getId()+"-->"+a.name));

		Iterator<Emp> itr = ls.iterator();
		while (itr.hasNext()) {
			// System.out.println(itr.next().toString()+ " :
			// "+itr.next().toString());
			Emp obj = itr.next();
			System.out.println(obj.getId() + " :" + obj.getName());

		}

		Collections.sort(ls);
		System.out.println("after sorting---");
		Iterator<Emp> itr1 = ls.iterator();
		while (itr1.hasNext()) {
			// System.out.println(itr.next().toString()+ " :
			// "+itr.next().toString());
			Emp obj = itr1.next();
			System.out.println(obj.getId() + " :" + obj.getName());

		}
	}
}