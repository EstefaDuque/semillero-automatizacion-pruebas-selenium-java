
import org.junit.Test;
import static org.junit.Assert.assertEquals;

//Prueba 1. llama a la clase MessageUtil para imprimir un mensaje y compararlo con el mensaje de esta clase.
public class TestJunit1 {

   String message = "Estefania";	
   MessageUtil messageUtil = new MessageUtil(message);
   
   @Test
   public void testPrintMessage() {	
	   
      System.out.println("Prueba 1 testPrintMessage()");    

      //asserEquals es para validar si los mensajes son iguales.
      assertEquals(message, messageUtil.printMessage());     
   }
}