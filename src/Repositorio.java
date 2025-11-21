import java.util.ArrayList;
import java.util.Scanner;

public class Repositorio {
    private ArrayList<Tarefa> tarefas;
    private int contadorId;

    public Repositorio(){
        this.tarefas = new ArrayList<>();
        this.contadorId = 1;
    }

    //Metodo para adicionar tarefa
    public void adicionarTarefa(String descricao, String status) {
        Tarefa novaTarefa = new Tarefa(contadorId++, descricao, status);
        tarefas.add(novaTarefa);
    }

    // Listar todas as tarefas
    public ArrayList<Tarefa> listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        }
        return tarefas;
    }

    // Buscar tarefa por descrição
    public void buscarPorDescricao(String descricao) {
            boolean encontrou = false;
            for (Tarefa tarefa : tarefas) {
                if (tarefa.getDescricao().toLowerCase().contains(descricao.toLowerCase())) {
                    System.out.println(tarefa);
                    encontrou = true;
                }
            }
            if (!encontrou) {
                System.out.println("Nenhuma tarefa encontrada com a descrição: " + descricao);
        }

    }

    // Remover tarefa por ID
    public void removerTarefa(int idTarefa) {
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getId() == idTarefa) {
                System.out.print("Tem certeza que deseja remover a tarefa com ID: " + idTarefa + " E Descricao: " + tarefas.get(i).getDescricao() + "? (s/n): ");
                String confirmacao = ler.nextLine();
                if (confirmacao.equalsIgnoreCase("s")) {
                    tarefas.remove(i);
                    System.out.println("Tarefa removida com sucesso.");
                } else {
                    System.out.println("Remoção cancelada.");
                }
                return;
            }
        }
        System.out.println("Tarefa com ID " + idTarefa + " não encontrada.");
    }



}
