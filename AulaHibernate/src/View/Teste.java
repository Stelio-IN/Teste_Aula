package View;

import Model.Aluno;
import Model.Curso;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {
    public static void main(String[] args) {
        // Criar EntityManagerFactory e EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AulaHibernatePU");
        EntityManager em = emf.createEntityManager();

        // Criar instância da entidade Pessoa
        Aluno objP = new Aluno();
        objP.setNome("Marcelo");
        objP.setSenha("0000");
        
        Curso objcur = new Curso();
        objcur.setNomedocuso("Lic. Matematica");
        objcur.setDuracao(4);

        try {
            // Iniciar transação
            em.getTransaction().begin();
            
            // Persistir objeto no banco de dados
            em.persist(objcur);
            
            // Commit da transação
            em.getTransaction().commit();
            System.out.println("Cadastro realizado com sucesso!");
        } catch (Exception e) {
            // Caso ocorra erro, reverter transação
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        } finally {
            // Fechar EntityManager e EntityManagerFactory
            em.close();
            emf.close();
        }
    }
}
