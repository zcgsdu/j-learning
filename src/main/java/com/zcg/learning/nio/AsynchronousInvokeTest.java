package com.zcg.learning.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AsynchronousInvokeTest {

	public static void main(String[] args) throws IOException, InterruptedException {
	    Path path = Paths.get("/logs/cms-admin/CMS-ADMIN-2016-07-15.log");
	    AsynchronousFileChannel channel = AsynchronousFileChannel.open(path);
	    ByteBuffer buffer = ByteBuffer.allocate(1024);
	    channel.read(buffer, 0, buffer, new CompletionHandler<Integer, ByteBuffer>() {
	        @Override
	        public void completed(Integer result, ByteBuffer attachment) {
	            System.out.println(Thread.currentThread().getName() + " read success!");
	        }
	 
	        @Override
	        public void failed(Throwable exc, ByteBuffer attachment) {
	            System.out.println("read error");
	        }
	    });
	 
	    while (true){
	        System.out.println(Thread.currentThread().getName() + " sleep");
	        Thread.sleep(1000);
	    }

	}
}
