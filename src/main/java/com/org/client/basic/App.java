package com.org.client.basic;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws Exception {
        Thread brokerThread = new Thread(new HelloWorldProducer());
        brokerThread.setDaemon(false);
        brokerThread.start();
        
        Thread brokerThread1 = new Thread(new HelloWorldConsumer());
        brokerThread1.setDaemon(false);
        brokerThread1.start();
        Thread.sleep(5000);
    }
        
}
