package com.rls.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Homework_Lucky {

	public static void main(String[] args) {
		new LuckyBox("抽奖箱1").start();;
		new LuckyBox("抽奖箱2").start();;
	}

}

class LuckyBox extends Thread{

	/*
	 * 3.每次抽的过程中，不打印，抽完时一次性打印(随机)
		在此次抽奖过程中，抽奖箱1总共产生了6个奖项，分别为：10,20,100,500,2,300最高奖项为300元，总计额为932元
		在此次抽奖过程中，抽奖箱2总共产生了6个奖项，分别为：5,50,200,800,80,700最高奖项为800元，总计额为1835元
		在此次抽奖过程中,抽奖箱2中产生了最大奖项,该奖项金额为800元
	 */
	private int[] bonus = {10,5,20,50,100,200,500,800,2,80,300,700};

	private static List<Integer> luckied = new ArrayList<Integer>();

	private List<Integer> list = new ArrayList<Integer>();

	private static String maxName;

	private static int maxNum;

	private static int count;

	public LuckyBox(String name) {
		super(name);
	}

	@Override
	public void run() {
		Random r = new Random();

		while(true){
			synchronized (LuckyBox.class) {

				if(luckied.size() == bonus.length){
					printResult();

					count++;
					if(count == 2){
						printEnd();
					}
					return;
				}

				int index = r.nextInt(bonus.length);

				while(luckied.contains(index)){
					index = r.nextInt(bonus.length);
				}

				luckied.add(index);
				list.add(index);
			}
		}
	}

	private void printEnd() {
		System.out.println("在此次抽奖过程中,"+maxName+"中产生了最大奖项,该奖项金额为"+maxNum+"元");
	}

	private void printResult() {
		//在此次抽奖过程中，抽奖箱1总共产生了6个奖项，分别为：10,20,100,500,2,300最高奖项为300元，总计额为932元
		if(list.size() > 0){
			System.out.print("在此次抽奖过程中，"+getName()+"总共产生了"+list.size()+"个奖项，分别为：");//+list2String(list)+"最高奖项为300元，总计额为932元");

			String str = "";

			int max = 0;
			int sum = 0;

			for (int i = 0; i < list.size(); i++) {
				if(list.size()-1==i){
					str += bonus[list.get(i)];
				}else {
					str += bonus[list.get(i)]+",";
				}

				if(max < bonus[list.get(i)]){
					max = bonus[list.get(i)];
				}

				sum += bonus[list.get(i)];
			}

			if(maxNum < max){
				maxNum = max;
				maxName = getName();
			}

			System.out.println(str + "最高奖项为"+max+"元，总计额为"+sum+"元");

		}

	}

}
