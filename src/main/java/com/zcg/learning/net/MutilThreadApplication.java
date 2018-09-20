package com.zcg.learning.net;

import com.zcg.learning.net.util.HttpConstant;

public class MutilThreadApplication {

	public static void main(String[] args) {

		for (String host: HttpConstant.HOSTS) {
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					new SocketHttpClient().start(host, HttpConstant.PORT);;
				}
			});
			t.start();
		}

    }
}
