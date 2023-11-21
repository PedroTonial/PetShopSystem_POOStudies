// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        CadastroPet registeredPets = new CadastroPet();
        int opcao;
        do {
            System.out.println("----- Menu de Opções -----");
            System.out.println("1. Adicionar Pet");
            System.out.println("2. Remover Pet");
            System.out.println("3. Pets cadastrados");
            System.out.println("4. Pets ordenados");
            System.out.println("5. Calcular média dos serviços utilizados");
            System.out.println("6. Calcular porcentagem de cada serviço usado");
            System.out.println("7. Indicar posição dos Pets no vetor");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    registeredPets.addPet(registeredPets.newPet());
                    break;
                case 2:
                    // Remover Pet
                    System.out.print("Nome do pet que será removido: ");
                    String petName = input.next();
                    registeredPets.removePet(petName);
                    break;
                case 3:
                    // Escrever todos os Pets
                    registeredPets.printRegisteredPets();
                    break;
                case 4:
                    // Escrever nomes dos Pets em ordem alfabética
                   registeredPets.printRegisteredPetsAlphabetical();
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    // Indicar posição dos Pets no vetor
                    registeredPets.printPetPosition();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }
}
