package aplication;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Funcionario;

public class Program {

public static void main(String[] args) {
	
Funcionario f1 = new Funcionario(null, "maizena" , "maizena@braco.com");
Funcionario f2 = new Funcionario(null, "ventoide" , "venta@claude.com");
Funcionario f3 = new Funcionario(null, "nanico" , "nanismo@berg.com");

/*System.out.println(f1);
System.out.println(f2);
System.out.println(f3);
*/

 EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
 EntityManager em = emf.createEntityManager();

 em.getTransaction().begin();
 
 em.getTransaction().commit();
 
 em.close();
 emf.close();
 
 System.out.println("OK");
 
 
}
}
