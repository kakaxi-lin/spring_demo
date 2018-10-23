package com.yk;

public class A {
	public static void main(String[] args) {
		
		//包数 480  45340
		for (int x1 = 0; x1 < 480; x1++) {
			int x2=480-x1;
			for (int y1 = 90; y1 < 200; y1++) {
				for (int y2 = 90; y2 < 100; y2++) {
//					System.out.println("x1:"+x1);
//					System.out.println("x2:"+x2);
//					System.out.println("y1:"+y1);
//					System.out.println("y2:"+y2);
					if(((x1*y1)+(x2*y2))==45340){
						System.out.println("数量1:"+x1+" , 单价1"+y1);
						System.out.println("数量2:"+x2+" , 单价2"+y2);
						System.out.println("========================");
					}
				}
			}
			
		}
	}
	public void aa(){
		System.out.println("aa..................");
	}

}
