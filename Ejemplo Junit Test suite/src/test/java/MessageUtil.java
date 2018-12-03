//Esta clase imprime el mensaje por consola 

public class MessageUtil {

   private String message;

   //Constructor, como parametro recibe el mensaje que va imprimir

   public MessageUtil(String message){
      this.message = message; 
   }

   //Este método imprime el mensaje
   public String printMessage(){
      System.out.println(message);
      return message;
   }   

   // Agrega Hi al mensaje
   
   public String salutationMessage(){
      message = "Hi!" + message;
      System.out.println(message);
      return message;
   }   
}