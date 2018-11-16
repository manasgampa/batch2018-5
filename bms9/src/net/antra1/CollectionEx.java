package net.antra1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionEx{

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		Collections.synchronizedMap(hm);
		/*ConcurrentHashMap ch=new ConcurrentHashMap();
		ch.put(453, "manas");//keys cannot duplicated// values can be duplicated
		ch.put(278, "Bob");//HashTable and Linked List Data structure
		ch.put(353, "Stuert");//insertion order is preserved
		ch.put(344, "john");
		ch.put(590, "kumar");
		ch.put(589, "Pippa");
		
		Set set=ch.keySet();
		
		Iterator it=set.iterator();
		
		while(it.hasNext()) {
			System.out.println(ch.get(it.next()));
			ch.put(5,"ping");
		}*/
		
		/*List al=new ArrayList();
		al.add(45); 
		al.add(67); 
		al.add(34);
		
		List li=Collections.unmodifiableList(al);
		al.add(56);
		System.out.println(li);
		System.out.println(al);*/
		//li.add(34);
		/*LinkedHashMap hm=new LinkedHashMap();
		hm.put(453, "manas");//keys cannot duplicated// values can be duplicated
		hm.put(278, "Bob");//HashTable and Linked List Data structure
		hm.put(353, "Stuert");//insertion order is preserved
		hm.put(344, "john");
		hm.put(590, "kumar");
		hm.put(589, "Pippa");
		
		Set set=hm.keySet();
		
		Iterator it=set.iterator();
		
		while(it.hasNext()) {
			System.out.println(hm.get(it.next()));
		}
		*/
		
		
		
		
		/*HashMap hm=new HashMap();
		hm.put(453, "manas");//keys cannot duplicated// values can be duplicated//insertion order is not preserved
		hm.put(278, "Bob");//HashTable Data structure
		hm.put(353, "Stuert");
		hm.put(344, "john");
		hm.put(590, "kumar");
		hm.put(589, "Pippa");
		
		Set set=hm.keySet();
		
		Iterator it=set.iterator();
		
		while(it.hasNext()) {
			System.out.println(hm.get(it.next()));
			
		}*/
		/*Set set = new TreeSet(new SortOfTree());//homogenious object
		//balanced tree data structure
		set.add(13);
		set.add(45);
		set.add(67);
		set.add(34);
		set.add(12);
		set.add(5);
		set.add(101);
		set.add(54);

		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		/*Set set = new LinkedHashSet();// Linked list and HashTable Data structure
		// insertion order is  preserved
		set.add(13);
		set.add(45);
		set.add(67);
		set.add(34);
		set.add(56.56f);
		set.add(true);
		set.add(new Emp());
		set.add(45);

		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}*/

		/*
		 * Set set =new HashSet();//HashTable Data structure //insertion order is not
		 * preserved set.add(13); set.add(45); set.add(67); set.add(34);
		 * set.add(56.56f); set.add(true); set.add(new Emp()); set.add(45);
		 * 
		 * Iterator it=set.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
		/*
		 * LinkedList al=new LinkedList();//double linked list data structure
		 * al.add(13); //insertion and deletion would be easy al.add(45); al.add(67);
		 * al.add(34); al.add(56.56f); al.add(true); al.add(new Emp()); al.add(45);
		 * 
		 * Iterator it=al.iterator();
		 * 
		 * while(it.hasNext()) {
		 * 
		 * System.out.println(it.next()); }
		 */

		/*
		 * ArrayList al=new ArrayList();//object Array data structure al.add(13);
		 * //retrival would be easy al.add(45); al.add(67); al.add(34); al.add(56.56f);
		 * al.add(true); al.add(new Emp()); al.add(45);
		 * 
		 * Iterator it=al.iterator();
		 * 
		 * while(it.hasNext()) {
		 * 
		 * System.out.println(it.next()); }
		 */
		/*
		 * for(Object o:al) { System.out.println(o); }
		 */
		/*
		 * for(int i=0;i<al.size();i++) {
		 * 
		 * System.out.println(al.get(i)); }
		 */

		/*
		 * System.out.println(al); System.out.println(al.get(4)); al.remove(3);
		 * System.out.println(al.size());
		 */

	}
	

}
