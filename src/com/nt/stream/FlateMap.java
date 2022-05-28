package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlateMap {
	static void m1() {
		List<Integer> pl=Arrays.asList(2,7,11,133,17);
		List<Integer> on=Arrays.asList(1,3,7,9);
		List<Integer> en=Arrays.asList(2,4,8,10);
		List<List<Integer>> listOfInts=Arrays.asList(pl,on,en);
		System.out.println("before flapmap::"+listOfInts);
		List<Integer> list=listOfInts.stream().flatMap(i->i.stream()).collect(Collectors.toList());
		System.out.println("after flapmap::"+list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
