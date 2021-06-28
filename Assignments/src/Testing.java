import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pingCount = 5;
        System.out.println("Enter url/ipaddress to ping: ");
        String url = scanner.next();
        ArrayList<Float> recordingTime = new ArrayList<>();
        int count = pingCount;
        try{
            String command = "ping -c "+pingCount+" "+url;
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String pingStats;
            while((pingStats=br.readLine())!=null && (count--)>=0){
                if(pingStats.contains("time=")){
                    int position = pingStats.indexOf("time=");
                    String timeInMs = pingStats.substring(position+5);
                    float time = Float.parseFloat(timeInMs.substring(0,timeInMs.length()-3));
                    recordingTime.add(time);
                }
            }
        }
        catch(Exception e){
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
        Collections.sort(recordingTime);
        for(int i = 0; i < recordingTime.size(); i++) {
            System.out.println(recordingTime.get(i));
        }
    }
}
