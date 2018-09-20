package com.zcg.learning.net;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServerTest {

	public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
            	OutputStream os = null;
                try {
                    DatagramSocket datagramSocket = new DatagramSocket(1234);
                    byte[] buffer = new byte[1024];
                    DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                    datagramSocket.receive(packet);
                    os = new FileOutputStream(new File("E:\\1.txt"));
                    os.write((System.currentTimeMillis()+"").getBytes());
                } catch (SocketException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
					try {
						os.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
            }
        }).start();
    }
}
