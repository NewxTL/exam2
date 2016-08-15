package com.hand;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class ShouShui 
{
    public static void main( String[] args )
    {
    	
		Scanner scanner = new Scanner(System.in);
    	System.out.println("请输入工资：");
    	int salary = scanner.nextInt();
    	int s = salary - 3500;
    	double ss = 0;
    	if (s <= 1500) {
			ss = s*0.03;
		}
		if (1500 < s && s <= 4500) {
			ss = s*0.10;
		}
		if (4500 < s && s <= 9000) {
			ss = s*0.20;
		}
		if (9000 < s && s <= 35000) {
			ss = s*0.25;
		}
		if (35000 < s && s <= 55000) {
			ss = s*0.30;
		}
		if (55000 < s && s <= 80000) {
			ss = s*0.35;
		}
		if (s >80000) {
			ss = s*0.45;
		}
		if (ss > 0) {
			System.out.println("您所需要缴纳的税费为："+ss);
		}else {
			System.out.println("您所需要缴纳的税费为："+0);
		}
    }
   
}

