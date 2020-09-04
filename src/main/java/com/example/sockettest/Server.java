package com.example.sockettest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("服务器启动，等待连接...");
            Socket socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String temp = null;
            String info = "";
            while ((temp = bufferedReader.readLine()) != null) {
                info += temp;
                System.out.println("已接收到客户端连接");
                System.out.println("客户端信息："+info+",  客户端ip:"+socket.getInetAddress().getHostAddress());
            }

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.println("服务端接收成功");
            printWriter.flush();
            socket.shutdownOutput();

            printWriter.close();
            outputStream.close();
            bufferedReader.close();
            inputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
