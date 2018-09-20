package com.zcg.learning.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsyncSocketChannelTest {

	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
	    AsynchronousSocketChannel channel = AsynchronousSocketChannel.open();
	    channel.connect(new InetSocketAddress("127.0.0.1",8888)).get();
	    ByteBuffer buffer = ByteBuffer.wrap("中文,你好".getBytes());
	    Future<Integer> future = channel.write(buffer);
	 
	    future.get();
//	    System.out.println("send ok");

	}
}
