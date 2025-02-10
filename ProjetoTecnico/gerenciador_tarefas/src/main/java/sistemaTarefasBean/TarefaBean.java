package sistemaTarefasBean;

import sistemaTarefasDao.*;
import sistemaTarefas.*;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;
public class TarefaBean implements Serializable {
    private Tarefa tarefa = new Tarefa();
    private TarefaDAO dao = new TarefaDAO();

    public void salvar() {
        dao.salvar(tarefa);
        tarefa = new Tarefa();
    }

    public List<Tarefa> getListaTarefas() {
        return dao.listarTodas();
    }

    public Tarefa getTarefa() {
        return tarefa;
    }
}
