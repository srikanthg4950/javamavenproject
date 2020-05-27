package com.demo.javamavenproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
	
	Demo(){
		System.out.println(" ---constructor called 15---");
	}
	
	Object getData() {
		return null;
	}
	
	void m1(){
		try {
			
			List<Integer> list1=new ArrayList<Integer>();
			list1.add(1);
			
			list1.add(2);
			Object obj=getData();
			System.out.println(obj.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	void m2() {
		Map<String,String> map=new HashMap<String,String>();
		
		map.put("testkey", "testvalue");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() called");
		Demo d=new Demo();
		d.m1();
		d.m2();

	}

}
