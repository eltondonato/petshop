
	package br.com.elton.petshop.model;



	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;




	public class MainApp {

		 

	    private static EntityManagerFactory emf;
	    private static EntityManager em;

	 

	    static {
	        try {
	            emf = Persistence.createEntityManagerFactory("petshop");
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new RuntimeException(e.getMessage());
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Pessoa p = new Pessoa();
		
		p.setNome("Juca");
		
		Cachorro c = new Cachorro();
		
		c.setNome("Toto");
		
		em.persist(c);
		
		p.addCachorro(c);
		
		em.persist(p);
		
		//Fechar transacao
		
		em.getTransaction().commit();
		
		//Fechar conexao
		
		
		em.close();
		
		



	}

}
