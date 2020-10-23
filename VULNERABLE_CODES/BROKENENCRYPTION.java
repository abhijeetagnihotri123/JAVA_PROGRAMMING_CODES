
import java.security 
    .SecureRandom; 
  
import javax.crypto 
    .KeyGenerator; 
import javax.crypto.SecretKey; 
import javax.xml.bind 
    .DatatypeConverter; 
  
// Class to create a 
// symmetric key 
public class BROKENENCRYPTION { 
  
    public static final String AES 
        = "AES"; 
  
    // Function to create a secret key 
    public static SecretKey createAESKey() 
        throws Exception 
    { 
  
        // Creating a new instance of 
        // SecureRandom class. 
        SecureRandom securerandom 
            = new SecureRandom(); 
  
        // Passing the string to 
        // KeyGenerator 
        KeyGenerator keygenerator 
            = KeyGenerator.getInstance(AES); 
  
        // Initializing the KeyGenerator 
        // with 256 bits. 
        keygenerator.init(256, securerandom); 
        SecretKey key = keygenerator.generateKey(); 
        return key; 
    } 
    
    // Driver code 
    public static void main(String args[]) 
        throws Exception 
    { 
        SecretKey Symmetrickey 
            = createAESKey(); 
            // This is basically the vulnerabilty highlighed by SONARLINT which is to be kept in our application program c1 and c2 ciphers
            Cipher c1 = Cipher.getInstance("AES/ECB/NoPadding"); // Noncompliant
            Cipher c2 = Cipher.getInstance("AES/CBC/PKCS5Padding"); // Noncompliant
        System.out.println("Output"); 
        System.out.print("The Symmetric Key is :"
                         + DatatypeConverter.printHexBinary( 
                               Symmetrickey.getEncoded())); 
    } 
}