package com.rls.multithreading;

public class Demo_Ticket {

	public static void main(String[] args) {


		Runnable r = new Runnable(){
			private int tickets = 10000;

			@Override
			public void run() {
				while(true){
					synchronized (String.class) {
						if(tickets > 0){
							try {
								Thread.sleep(1);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println(Thread.currentThread().getName() + "卖出了 " + (tickets--)+"号票");
						}
					}

				}
			}
		};

		new Thread(r,"窗口一").start();
		new Thread(r,"窗口二").start();
		new Thread(r,"窗口三").start();
		new Thread(r,"窗口四").start();
	}

}
