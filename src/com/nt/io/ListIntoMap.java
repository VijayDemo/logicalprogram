package com.nt.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListIntoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Host> list=new ArrayList<>();
		list.add(new Host(1,"doj"));
		list.add(new Host(2,"dam"));
		Map<Integer,String> map=list.stream().collect(Collectors.toMap(Host::getId,Host::getName));
		System.out.println(map);

	}

}
