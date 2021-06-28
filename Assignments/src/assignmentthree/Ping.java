package assignmentthree;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Ping {
    public float findMedianPingTime(int pingCount, String url) {
        ArrayList<Float> recordingTime = new ArrayList<>();
        int count = pingCount;
        try {
            String command = "ping -c " + pingCount + " " + url;
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String pingStats;
            while ((pingStats = br.readLine()) != null && (count--) >= 0) {
                if (pingStats.contains("time=")) {
                    int position = pingStats.indexOf("time=");
                    String timeInMs = pingStats.substring(position + 5);
                    float time = Float.parseFloat(timeInMs.substring(0, timeInMs.length() - 3));
                    recordingTime.add(time);
                }
            }
        } catch (Exception e) {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
        Collections.sort(recordingTime);
        if (recordingTime.size() > 0) {
            if (recordingTime.size() % 2 != 0)
                return recordingTime.get((recordingTime.size() + 1) / 2 - 1);
            else
                return (recordingTime.get(recordingTime.size() / 2 - 1) + recordingTime.get(recordingTime.size() / 2)) / 2;
        }
        return (float) 0.00;
    }
}