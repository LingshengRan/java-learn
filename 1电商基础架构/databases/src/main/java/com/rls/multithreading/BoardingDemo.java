package com.rls.multithreading;

public class BoardingDemo {
    public static void main(String[] args) {
        /*
         * 有辆30座的客车：有两个门，要求模拟从前后门上人的过程。
         *
         * 模拟： 从前门上了一个人，坐下了，车上还有X个座位。 .....
         *
         * 从后门上了一个人，坐下了，车上没有座了。
         *
         * 从前门一共上了X个人，从后门一共上了X个人。
         *
         */
        Car car = new Car();

        new Thread(car, "前门").start();
        new Thread(car, "后门").start();

    }

}

class Car implements Runnable {

    /*
     * 因为 int count 和  String name 都是 定义在  run() 方法中的，
     * 由于 run() 方法 被 调用了两次(一次是"前门"线程 ,一次 是 "后门"线程)
     *
     * 两个线程中，各自有  自己的 一个  count, 和 一个 name
     *
     * 其中前门线程中的 name = "前门".并且 count 一直在统计 前门 上了多少人
     *
     * 其中后门线程中的name = "后门",并且　count　始终为０
     *
     * 为什么会打印　前门０，后门５０　，因为　一直是后门在　收尾。
     *
     *
     * 如果把 count　放在外面，那么两个线程就共享了同一个统计的数据，那么　前后门就统一了。
     */
    private int seat = 50;
    int count = 0;

    @Override
    public void run() {
        // 前门调用的run()   count
        // 后门调用了 run()   count
        String name = Thread.currentThread().getName();

        while (true) {


            synchronized (Car.class) {

                if (seat > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if(name.equals("后门")){
                        count++;
                    }
                    if(seat == 1){
                        System.out.println("从" + name + "上了一个人，车上没有座位了");
                        seat--;
                        System.out.println("从前门一共上了" +count + "个人,从后门上了" +(50-count) +"个人");
                    }else {
                        System.out.println("从" + name + "上了一个人，车上还有" + (--seat) + "个座位");
                    }
                }
            }
        }

    }

}