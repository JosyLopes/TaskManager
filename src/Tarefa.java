public class Tarefa {
    private int id;
    private String descricao;
    private String status;

    public Tarefa(int id, String descricao, String status) {
        this.id = id;
        this.descricao = descricao;
        this.status = status;
    }

    public int getId() {
        return id;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getStatus() {
        return status;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //
    @Override
    public String toString() {
    return "ID: " + id + 
           " | Descrição: " + descricao + 
           " | Status: " + status;
    }
}
