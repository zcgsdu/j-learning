package com.zcg.learning.net;

import com.zcg.learning.net.util.HttpConstant;

public class SingleThreadApplication {

	public static void main(String[] args) {
		for (String host: HttpConstant.HOSTS) {

            new SocketHttpClient().start(host, HttpConstant.PORT);

        }
	}
}
