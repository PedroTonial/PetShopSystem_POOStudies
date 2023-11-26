// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        CadastroPet registeredPets = new CadastroPet();
        int opcao;
        do {
            System.out.println("------------------------------------------------");
            System.out.println("\t\t\tMENU");
            System.out.println("1. Adicionar Pet\n" +
                    "2. Remover Pet\n" +
                    "3. Pets cadastrados\n" +
                    "4. Pets ordenados\n" +
                    "5. Calcular média dos serviços utilizados\n" +
                    "6. Calcular porcentagem de cada serviço usado\n" +
                    "7. Indicar posição dos Pets no vetor\n" +
                    "0. Sair");
            System.out.println("------------------------------------------------");
            System.out.print("Escolha a partir do número da opção:");
            opcao = input.nextInt();
            System.out.println(" \n ------------------------------------------------");


            switch (opcao) {
                case 1:
                    //Registrando um pet ao vetor
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
                    //Calculando a média do numero de serviços de um pet selecionado pelo nome
                    System.out.print("Nome do pet para calcular a média dos serviços utilizados: ");
                    String petNameForAverage = input.next();
                    Pet selectedPetForAverage = registeredPets.getPet(petNameForAverage);

                    if (selectedPetForAverage != null) {
                        Services petServices = selectedPetForAverage.getServices();
                        petServices.averageNumServices();
                        petServices.averageServicePrice();
                    } else {
                        System.out.println("Pet não encontrado.");
                    }
                    break;
                case 6:
                    //Calculando a porcentagem de cada serviço do pet selecionado
                    System.out.print("Nome do pet para calcular a porcentagem de serviços utilizados: ");
                    String petNameForPercentage = input.next();
                    Pet selectedPetForPercentage = registeredPets.getPet(petNameForPercentage);

                    if (selectedPetForPercentage != null) {
                        Services petServices = selectedPetForPercentage.getServices();
                        petServices.calculateServicePercentage();
                    } else {
                        System.out.println("Pet não encontrado.");
                    }
                    break;
                case 7:
                    // Indica a posição do pet no registro
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
