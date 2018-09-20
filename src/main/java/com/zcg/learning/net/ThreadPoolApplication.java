package com.zcg.learning.net;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.zcg.learning.net.util.HttpConstant;

public class ThreadPoolApplication {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(4);
		for (String host: HttpConstant.HOSTS) {
			Thread t = new Thread(new Runnable() {
                public void run() {
                    new SocketHttpClient().start(host, HttpConstant.PORT);
                }
            });
			es.submit(t);
		}
	}
}
