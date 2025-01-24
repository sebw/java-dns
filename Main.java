import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Calendar;  
import java.net.InetAddress;

class Main {
    private static final String TEST_DOMAIN = "www.ibm.com";

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 1000; i++) {
            try {
                InetAddress address = InetAddress.getByName(TEST_DOMAIN);
                System.out.println(getCurrentTime() + " lookup success " + address);
            } catch (Exception ignore) {
                System.out.println(getCurrentTime() + " lookup failed");
            } finally {
                Thread.sleep(1000);
            }
        }
        return;
    }

    private static String getCurrentTime() {
        DateFormat dateFormat = new SimpleDateFormat("mm:ss");
        return dateFormat.format(Calendar.getInstance().getTime());
    }

}
