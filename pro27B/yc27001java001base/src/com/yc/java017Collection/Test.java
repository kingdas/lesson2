package com.yc.java017Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int b;
		// int[] n;
		// Random r;
		// A a = new A();
		// A[] an;
		// an = new A[2];
		// an[0] = new A();
		// an[1] = new A();
		//
		// Object[] os = { new A(), 2, "ab" };
		// a = (A) os[0];
		// String s = (String) os[2];
		// // /////////////////////
		// Collection c = new ArrayList();
		// c.add(new A());
		// c.add("aa");
		// c.add(3);
		//
		// for (Iterator it = c.iterator(); it.hasNext();) {
		// System.out.println(it.next());
		// }

		// // /////////////////////
		// Collection c = new ArrayList();
		// c.add(3);
		// c.add(new A());
		// c.add("aa");
		// c.add(3);
		// Iterator it = c.iterator();
		// while (it.hasNext()) {
		// System.out.println(it.next());
		// }

		// /////////////////////
		// Collection c = new HashSet();
		// c.add(3);
		// c.add(new A());
		// c.add("aa");
		// c.add(3);
		// Iterator it = c.iterator();
		// while (it.hasNext()) {
		// System.out.println(it.next());
		// }
		// // ///////////////////////////
		// List l = new ArrayList ();
		// l.add("a");
		// l.add('a');

		// ///////////////////////////
		// List<String> l = new ArrayList<String>();
		// l.add("a");
		// l.add("bc");
		// String s = l.get(0);
		// System.out.println(s);

		// ///////////////////////////
		// List<Integer> l = new ArrayList<Integer>();
		// l.add(3);
		// l.add(5);
		// l.add(1, 8);
		// l.add(5);
		// l.add(2);
		// l.add(1);
		// l.add(3);
		//
		// System.out.println(l.indexOf(5));
		// System.out.println(l.lastIndexOf(5));

		// // ///////////////////////////
		// List<Integer> l = new ArrayList<Integer>();
		// l.add(3);
		// l.add(5);
		// l.add(1, 8);
		// l.add(5);
		// l.add(2);
		// l.add(1);
		// l.add(3);
		// System.out.println(l);
		// Set<Integer> s = new HashSet<Integer>();
		// s.addAll(l);
		// System.out.println(s);
		// ///////////////////////////
		// List<Integer> l = new ArrayList<Integer>();
		// l.add(3);
		// l.add(5);
		// l.add(1, 8);
		// l.add(5);
		// l.add(2);
		// l.add(3);
		// l.add(1);
		// l.add(3);
		// for (int i = 0; i < l.size();) {
		// if (l.indexOf(l.get(i)) != l.lastIndexOf(l.get(i))) {
		// l.remove(l.lastIndexOf(l.get(i)));
		// } else {
		// i++;
		// }
		// }
		// System.out.println(l);
		// // ///////////////////////////
		// Collection<Integer> c = new ArrayList<Integer>();
		// c.add(1);
		// c.add(3);
		// c.remove(3);
		// System.out.println(c);
		// ///////////////////////////
		// List<Integer> c = new ArrayList<Integer>();
		// c.add(1);
		// c.add(3);
		// // c.remove(3);
		// c.remove(new Integer(3));
		// System.out.println(c);
		// // ///////////////////////////////
		// Set<Integer> s = new HashSet<Integer>();
		// s.add(5);
		// s.add(3);
		// s.iterator();
		// // ////////////////////////////
		// TreeSet<Integer> ts = new TreeSet<Integer>();
		// ts.add(4);
		// ts.add(3);
		// ts.add(2);
		// ts.add(3);
		// System.out.println(ts);

		// // //////////////////////////////////////
		// Map<Integer, String> m = new HashMap<Integer, String>();
		// m.put(1, "zs");
		// m.put(4, "ls");
		// m.put(2, "ww");
		// m.put(2, "ww");
		// System.out.println(m.get(4));
		// System.out.println(m.size());
		// System.out.println(m);
		// // //////////////////////////////////////
		// Map<Integer, String> m = new HashMap<Integer, String>();
		// m.put(1, "zs");
		// m.put(4, "ls");
		// m.put(2, "ww");
		// m.put(2, "ww");
		// Set<Integer> ks = m.keySet();
		// Integer k;
		// String v;
		// for (Iterator<Integer> it = ks.iterator(); it.hasNext();) {
		// k = it.next();
		// v = m.get(k);
		// System.out.println(k + ":" + v);
		// }

		// //////////////////////////////////////
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "zs");
		m.put(4, "ls");
		m.put(2, "ww");
		m.put(2, "ww");
		Set<Entry<Integer, String>> ss = m.entrySet();
		Integer k;
		String v;
		for (Iterator<Entry<Integer, String>> it = ss.iterator(); it.hasNext();) {
			Entry<Integer, String> e = it.next();
			k = e.getKey();
			v = e.getValue();
			System.out.println(k + "=" + v);
		}

	}
}

class A {

}
