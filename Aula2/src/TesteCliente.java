import java.util.ArrayList;
import java.util.Iterator;

public class TesteCliente {
  public static void main(String[] args) {
	Cliente c = new Cliente("Daniel","12345678910",1234,123456);
	System.out.println(c.consultaConta());
	
	System.out.println(c.consultarCliente());
	
	ArrayList<Cliente> cliente = new ArrayList<Cliente>();
	
	Cliente c1 = new Cliente("Jose","98765432100",4321,654321);
	
	Cliente c2 = new Cliente("Joao","12312312300",1111,123455);
	
	cliente.add(c);
	cliente.add(c1);
	cliente.add(c2);
	
	//FOR ANTES DO JAVA 5
	System.out.println("FOR ANTES DO JAVA 5");
	Iterator<Cliente> i = cliente.iterator();
    while(i.hasNext()) {
      System.out.println(i.next().getNome());
    }
    
    //FOR DO JAVA 5 AO JAVA 8
	System.out.println("FOR DO JAVA 5 AO JAVA 8");
    ArrayList<Cliente> cliente2 = new ArrayList<Cliente>();
    cliente2 = cliente;
    
    for(Cliente x : cliente2){
    	System.out.println(x.getNome());
    }
    
    //FOR DEPOIS DO JAVA 8
    System.out.println("FOR DEPOIS DO JAVA 8");
    ArrayList<Cliente> cliente3 = new ArrayList<Cliente>();
    cliente3 = cliente;
    
    cliente3.forEach(y -> System.out.println(y.getNome()));
  }
}
