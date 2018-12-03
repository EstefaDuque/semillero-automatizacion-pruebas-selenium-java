import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//Esta clase llama el corredor de pruebas TestSuite para ejecutar nuestro conjunto de pruebas
public class TestRunner {
	
   public static void main(String[] args) {
	  
	  /*Ejecución de casos de prueba usando JunitCore.runclasses que toma el nombre 
	  de la clase de prueba como un parámetro*/
      Result result = JUnitCore.runClasses(TestSuite.class);

      //Este for es para procesar el resultado e imprimir un resultado fallido.
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      //Imprime el resultado exitoso. Si las dos pruebas pasan imprime True y si no False.
      System.out.println(result.wasSuccessful());
   }
}  	