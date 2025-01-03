package com.thread;

public class ThreadSample extends Thread {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().getId());
       Thread.currentThread().setName("MohammedAlith");
       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().hashCode());
       System.out.println(Thread.currentThread().getPriority());
       Thread.currentThread().setPriority(10);
       System.out.println(Thread.currentThread().getPriority());
       System.out.println(Thread.currentThread().isAlive());
       System.out.println(Thread.currentThread().isInterrupted());
       System.out.println(Thread.currentThread().isDaemon());
       
	}

}
