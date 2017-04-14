package JavaPrograms;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.DecimalFormat;

/**
 * Created by Yashraj on 3/27/2017.
 */
public class JSONParser {

    public static void main(String[] args) {

        for (int i = 0; i<=99; i++)
        {
            DecimalFormat decimalFormat = new DecimalFormat("00");
            try {
                URL url = new URL("https://wd51nn4ogc.execute-api.us-east-1.amazonaws.com/cover_letters?id="+decimalFormat.format(i));
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                String strTemp = "";
                while (null != (strTemp = br.readLine())) {
                    System.out.println(strTemp);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }
}
