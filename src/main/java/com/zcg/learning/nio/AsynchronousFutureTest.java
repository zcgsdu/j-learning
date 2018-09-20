package com.zcg.learning.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsynchronousFutureTest {

	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
	    Path path = Paths.get("/logs/cms-admin/CMS-ADMIN-2016-07-15.log");
	    AsynchronousFileChannel channel = AsynchronousFileChannel.open(path);
	    ByteBuffer buffer = ByteBuffer.allocate(4096*100);
	    Future<Integer> future = channel.read(buffer,0);
	        while (!future.isDone()){
	            System.out.println("I'm idle");
	        }
	    Integer readNumber = future.get();
	 
	    buffer.flip();
	    CharBuffer charBuffer = CharBuffer.allocate(1024);
	    CharsetDecoder decoder = Charset.defaultCharset().newDecoder();
	    decoder.decode(buffer,charBuffer,false);
	    charBuffer.flip();
	    String data = new String(charBuffer.array(),0, charBuffer.limit());
	    System.out.println("read number:" + readNumber);
	    System.out.println(data);

	}
}
