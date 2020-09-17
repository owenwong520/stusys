package com.example.sockettest;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",8080);

            OutputStream outputStream = socket.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            InputStreamReader inputStreamReader = new InputStreamReader(System.in,"utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String str = bufferedReader.readLine();
                bufferedWriter.write(str);
                bufferedWriter.write("\n");
                bufferedWriter.flush();

            }
          //  socket.shutdownOutput();
           // socket.shutdownOutput();
//            InputStream inputStream1 = socket.getInputStream();
//            InputStreamReader inputStreamReader1 = new InputStreamReader(inputStream1);
//            BufferedReader bufferedReader1 = new BufferedReader(inputStreamReader1);
//            String temp = null;
//            String info = "";
//            while ((temp = bufferedReader1.readLine()) != null) {
//                info += temp;
//                System.out.println("客户端接收服务器信息："+info);
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
