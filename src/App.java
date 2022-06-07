import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Deque<Integer> deque = new Deque<>(5);
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 7) {
            System.out.println("1 - Inserir no inicio");
            System.out.println("2 - Remover no inicio");
            System.out.println("3 - Inserir no fim");
            System.out.println("4 - Remover no fim");
            System.out.println("5 - Testar se o deque está vazio");
            System.out.println("6 - Testar se o deque está cheio");
            System.out.println("7 - Sair");
            System.out.print("Digite a opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite um valor para inserir no inicio");
                    if (deque.isFull()) {
                        System.out.println("Deque cheio");
                    } else {
                        Node<Integer> node = new Node(scanner.nextInt());
                        deque.push(node);
                        System.out.println("Valor inserido: " + node.getData());
                    }
                    break;
                case 2:
                    System.out.println("Removendo no inicio");
                    if (deque.isEmpty()) {
                        System.out.println("Deque vazio");
                    } else {
                        System.out.println("Valor removido: " + deque.pop().getData());
                    }
                    break;
                case 3:
                    System.out.println("Digite um valor para inserir no fim");
                    if (deque.isFull()) {
                        System.out.println("Deque cheio");
                    } else {
                        Node<Integer> node = new Node(scanner.nextInt());
                        deque.push(node);
                        System.out.println("Valor inserido: " + node.getData());
                    }
                    break;
                case 4:
                    System.out.println("Removendo no fim");
                    if (deque.isEmpty()) {
                        System.out.println("Deque vazio");
                    } else {
                        System.out.println("Valor removido: " + deque.eject().getData());
                    }
                    break;
                case 5:
                    if (deque.isEmpty()) {
                        System.out.println("Deque vazio");
                    }
                    ;
                    break;
                case 6:
                    if (deque.isFull()) {
                        System.out.println("Deque cheio");
                    }
                    ;
                    break;
                case 7:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }

    }
}