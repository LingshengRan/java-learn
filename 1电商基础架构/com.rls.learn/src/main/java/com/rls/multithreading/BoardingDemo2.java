package com.rls.multithreading;

public class BoardingDemo2 {

    /*
     * 多线程的通讯
     *
     *
     */
    public static void main(String[] args) {
        Car2 car = new Car2();
        new Thread(car, "前门").start();
        new Thread(car, "后门").start();

        synchronized (BoardingDemo2.class) {

            while(true){

                //.....

                try {
                    BoardingDemo2.class.wait();	//

                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

}

class Car2 implements Runnable{
    private int seat = 50;

    boolean flag = true;

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        while(true){
            if(flag && name.equals("前门")){
                if(seat > 0){
                    System.out.println(name + "上了个人");
                    seat--;
                }
                if(seat <= 0){
                    return;
                }

                flag = false;
            }else if(!flag && name.equals("后门")){
                if(seat > 0){
                    System.out.println(name + "上了个人");
                    seat--;
                }
                if(seat <= 0){
                    return;
                }

                flag = true;
            }
        }
    }

}