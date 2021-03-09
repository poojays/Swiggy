package test1;
import java.io.FileOutputStream;

 

public class IOException {

 

            public static void main(String[] args) {
                // TODO Auto-generated method stub
            
                        try(FileOutputStream fileOutputStream =new FileOutputStream("abc.txt")){      
                            String msg = "Welcome to java!";      
                            byte byteArray[] = msg.getBytes(); //converting string into byte array      
                            fileOutputStream.write(byteArray);  
                System.out.println("Message written to file successfuly!");      
                            }catch(Exception exception){  
                                   System.out.println("Inside Exception");  
                            }    
                        finally {
                            System.out.println("Excecuted final block");
                        }

 

            }

 

        

 

    }