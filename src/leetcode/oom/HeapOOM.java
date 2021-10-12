package leetcode.oom;

import com.sun.jmx.remote.internal.ArrayQueue;
import leetcode.ListNode;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.Callable;

/**
 * -Xms8m -Xms8m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {
    byte[] buffer = new byte[1 * 1024 * 1024];

    public static void main(String[] args) {
//        new Scanner(System.in).next();
//        ArrayList<HeapOOM> heapOOMS = new ArrayList<>();
//        int count = 0;
//        try {
//            while (true) {
//                heapOOMS.add(new HeapOOM());
//                count++;
//            }
//        } catch (Throwable e) {
//            System.out.println("count = " + count);
//            e.printStackTrace();
//        }

        ArrayQueue<String> strings = new ArrayQueue<>(10);

    }

    private class MyWorker implements Callable<String>{

        @Override
        public String call() throws Exception {

            return null;
        }
    }
}
