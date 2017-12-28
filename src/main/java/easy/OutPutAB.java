package easy;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * User: chanson-pro
 * Date-Time: 2017-12-28 10:06
 * Description:利用多线程，循环输出A,B(面试题)
 */
public class OutPutAB {
    ReentrantLock reentrantLock = new ReentrantLock();
    Condition acondition = reentrantLock.newCondition();
    Condition bcondition = reentrantLock.newCondition();

    public static void main(String[] args) {
        OutPutAB outPutAB = new OutPutAB();
        A a = outPutAB.new A();
        B b = outPutAB.new B();
        a.start();
        b.start();

    }
    class A extends Thread{
        @Override
        public void run() {
            while (true){
                reentrantLock.lock();
                try {
                    System.out.print("A,");
                    bcondition.signal();
                    acondition.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                reentrantLock.unlock();
            }// end while
        }
    }
    class B extends Thread{

        @Override
        public void run() {
            while (true) {
                reentrantLock.lock();
                try {
                    System.out.print("B,");
                    acondition.signal();
                    bcondition.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                reentrantLock.unlock();
            }//end while
        }
    }


}
