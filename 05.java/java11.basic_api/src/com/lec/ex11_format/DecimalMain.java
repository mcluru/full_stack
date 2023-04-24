package com.lec.ex11_format;

import java.text.DecimalFormat;

public class DecimalMain {

	public static void main(String[] args) {
		
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat();
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println("0.0 -> " +df.format(num));
		
		df = new DecimalFormat("00000000000.0000");
		System.out.println("00000000000.0000 -> " +df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println("# -> " +df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println("#.# -> " +df.format(num));
		
		df = new DecimalFormat("########.####");
		System.out.println("########.#### -> " +df.format(num));
		
		df = new DecimalFormat("#.0");
		System.out.println("#.0 -> " +df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println("+#.0 -> " +df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println("-#.0 -> " +df.format(num));
		
		df = new DecimalFormat("#,###.0");
		System.out.println("#,###.0 -> " +df.format(num));
		
		df = new DecimalFormat("0.0E0");
		System.out.println("0.0E0 -> " +df.format(num));
		
		df = new DecimalFormat("+#,###.0; -#,###.0");
		System.out.println("+#,###.0; -#,###.0 -> " +df.format(num));
		
		df = new DecimalFormat("#.# %");
		System.out.println("#.# % -> " +df.format(num));
	}

}
