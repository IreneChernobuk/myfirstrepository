import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception {

    public void bufferedReader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
    }
    BufferedReader reader = null;
    public void bufferedReader2() throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
        } catch (java.lang.Exception e) {
            System.out.println(e.getMessage());
        } finally {
            reader.close();
        }
    }
    public void bufferedReader3() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = reader.readLine();
        } finally {
            if (s == null) {
                reader.close();
            }
        }
    }
}
