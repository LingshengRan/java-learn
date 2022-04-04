package com.rls.multithreading;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//定时器
public class TimerDemo {
    public static void main(String[] args) {

        //1、创建Timer 对象,定时器类。
        Timer t = new Timer();

		/*
		 *  void schedule(TimerTask task, Date time)
		          	安排在指定的时间执行指定的任务。
			 void schedule(TimerTask task, Date firstTime, long period)
			          安排指定的任务在指定的时间开始进行重复的固定延迟执行。
		 */

        t.schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println("下课啦~~~叮叮叮....");
            }
        }, new Date(117,9,24,15,15),1000);

        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(new Date());
        }
    }

}
