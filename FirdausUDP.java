import java.net.Socket;
import java.io.*;

public class Firdaus_udp
{
  public static void main (String [] args)
  {
    try
    {
      System.out.println("STARTING...");
      Socket soc = new Socket("192.168.111.129", 4583);
      BufferedReader input = new BufferedReader (new InputStreamReader 
(System.in));
      System.out.println("SAY 3333: ");
      String str = input.readLine();
      PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
      out.println(str);

      BufferedReader in = new BufferedReader (new 
InputStreamReader(soc.getInputStream()));
      System.out.println (in.readLine());
      }
      catch (Exception e)
      {
      e.printStackTrace();
      }
    }
}
