



public class RMIClientMain 
{
     public static void main(String[] args) 
    {
        try {
            RmiCommunicationClient wsc = new RmiCommunicationClient();

            
     
        } catch (Exception ex) {
            ex.printStackTrace();
             System.err.println("Connection error the server is not responding.");
        }
    }
}
