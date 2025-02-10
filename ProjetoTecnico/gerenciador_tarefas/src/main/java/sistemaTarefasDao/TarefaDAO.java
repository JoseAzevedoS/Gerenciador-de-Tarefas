package sistemaTarefasDao;

import sistemaTarefas.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class TarefaDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("tarefasPU");

    public void salvar(Tarefa tarefa) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(tarefa);
        em.getTransaction().commit();
        em.close();
    }

    public List<Tarefa> listarTodas() {
        EntityManager em = emf.createEntityManager();
        List<Tarefa> tarefas = em.createQuery("SELECT t FROM Tarefa t", Tarefa.class).getResultList();
        em.close();
        return tarefas;
    }
}
