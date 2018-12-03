import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/* @RunWith y @Suite Estas anotaciones nos sirven para indicar que esta clase correrá 
con la clase suite de test sera un Test Suit y que test correrá.*/
// En esta clase se integran las dos pruebas
@RunWith(Suite.class)

@Suite.SuiteClasses({
   TestJunit1.class,//Prueba 1.
   TestJunit2.class //Prueba 2.
})

public class TestSuite  {   
}  	