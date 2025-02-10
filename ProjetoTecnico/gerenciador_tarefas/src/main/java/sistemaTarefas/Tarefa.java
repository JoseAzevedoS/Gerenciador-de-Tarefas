package sistemaTarefas;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tarefas")
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private String responsavel;
    private String prioridade;
    private Date deadline;
    private boolean concluida;

    // Getters e Setters

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public String getResponsavel() {

        return responsavel;
    }

    public void setResponsavel(String responsavel) {

        this.responsavel = responsavel;
    }

    public String getPrioridade() {

        return prioridade;
    }

    public void setPrioridade(String prioridade) {

        this.prioridade = prioridade;
    }

    public Date getDeadline() {

        return deadline;
    }

    public void setDeadline(Date deadline) {

        this.deadline = deadline;
    }

    public boolean getConcluida() {

        return concluida;
    }

    public void setConcluida(boolean concluida) {

        this.concluida = concluida;
    }
}
