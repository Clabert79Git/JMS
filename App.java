package com.mkyong;

import java.util.StringTokenizer;

public class App {
	public static void main(String[] args) {

		String str = "pippo;pluto;paperino";
		StringTokenizer st = new StringTokenizer(str);


		StringTokenizer st2 = new StringTokenizer(str, " ; ");

		while (st2.hasMoreElements()) {
			//System.out.println("1");
			System.out.println(st2.nextElement());
		}
	}
}