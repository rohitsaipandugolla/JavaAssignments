package assignmentthree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pingCount = 5;
        Ping ping = new Ping();
        System.out.println("Enter url/ipaddress to ping: ");
        String url = scanner.next();
        System.out.print(ping.findMedianPingTime(pingCount, url) + " ms");
    }
}
