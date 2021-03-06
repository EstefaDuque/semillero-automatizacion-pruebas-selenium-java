import org.junit.Test;
import static org.junit.Assert.assertEquals;

//Prueba 2. realiza lo mismo que la prueba 1, solo que al mensaje se le agrega un saludo.
public class TestJunit2 {

   String message = "Estefania";	
   MessageUtil messageUtil = new MessageUtil(message);
 
   @Test
   public void testSalutationMessage() {
	   
      System.out.println("Prueba2 testSalutationMessage()");
      message = "Hi!" + "Estefania";
      //asserEquals es para validar si los mensajes son iguales.
      assertEquals(message,messageUtil.salutationMessage());
   }
}