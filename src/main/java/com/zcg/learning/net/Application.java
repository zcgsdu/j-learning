package com.zcg.learning.net;

public class Application {

	public static void main(String[] args) {

        new SocketHttpClient().start("www.baidu.com", 80);

    }
}
