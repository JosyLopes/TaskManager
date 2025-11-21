import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Repositorio repo = new Repositorio();
        Scanner ler = new Scanner(System.in);
        String acao;

        // Inicia o programa
        do {
            System.out.println("\n------------------------ COMANDOS DISPONÍVEIS --------------------------");
            System.out.println("  [ Adicionar ]  |  [ Listar ]  |  [ Buscar ]  |  [ Remover ]  |  [ Sair ]");
            System.out.println("--------------------------------------------------------------------------");
            acao = ler.nextLine();

            switch (acao.toLowerCase()) {
                case "adicionar":
                    System.out.print("Descrição da tarefa: ");
                    String descricao = ler.nextLine();
                    System.out.print("Status da tarefa: ");
                    String status = ler.nextLine();
                    repo.adicionarTarefa(descricao, status);
                    System.out.println("Tarefa adicionada com sucesso.");
                    break;
                case "listar":
                    System.out.println("Lista de Tarefas:");
                    for (Tarefa tarefa : repo.listarTarefas()) {
                        System.out.println(tarefa);
                    }
                    break;
                case "buscar":
                    System.out.print("Descrição para buscar: ");
                    String buscaDescricao = ler.nextLine();
                    repo.buscarPorDescricao(buscaDescricao);
                    break;
                case "remover":
                    System.out.print("Id da tarefa que deseja remover: ");
                    int removerID = ler.nextInt();
                    repo.removerTarefa(removerID);
                    break;
                case "sair":
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Comando inválido. Tente novamente.");
            }
        } while (!acao.equalsIgnoreCase("sair"));

        ler.close();
    }
}
