package com.zcg.learning.net;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpClientTest {

	public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                byte[] arr = "Hello Server".getBytes();
                OutputStream os = null;
                try {
                    InetAddress inetAddress = InetAddress.getLocalHost();
                    DatagramSocket datagramSocket = new DatagramSocket();
                    DatagramPacket datagramPacket = new DatagramPacket(arr, arr.length, inetAddress, 1234);
                    datagramSocket.send(datagramPacket);
                    os = new FileOutputStream(new File("E:\\2.txt"));
                    os.write((System.currentTimeMillis()+"").getBytes());
                } catch (UnknownHostException e) {
                    e.printStackTrace();
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
