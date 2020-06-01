package com.IP.check;
import java.net.*;
import java.util.Scanner;

public class InetLogic {
    public static void main(String[] args) {
        InetAddress IP = null;
        InetAddress[] ips = null;
        try {
            System.out.println("Введите имя хоста");
            Scanner sc = new Scanner(System.in);
            String host1 = sc.nextLine();
            IP = InetAddress.getLocalHost();
            System.out.println("Локальний IP: " + IP);
            IP = InetAddress.getByName(host1);
            System.out.println("IP" + host1 + IP);
            ips = InetAddress.getAllByName(host1);
            System.out.println("Всі IP-адреси " + host1);
            for (InetAddress ipItem : ips) {
                System.out.println(ipItem);
            }
            sc.close();
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}