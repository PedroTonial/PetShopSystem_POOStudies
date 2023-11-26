
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CadastroPet {
    private Pet [] registeredPets;
    private int count;

    public CadastroPet(){
        this.registeredPets = new Pet[20];
        this.count = 0;
    }
    public Pet newPet(){
        Scanner input = new Scanner (System.in);
        System.out.print("Digite o nome do Pet: ");
        String newName =input.next();
        System.out.print("Digite o tipo do Pet: ");
        String newType = input.next();
        System.out.print("Digite a raça do Pet: ");
        String newBreed = input.next();
        System.out.print("Digite a idade do Pet: ");
        String newAge = input.next();
        System.out.print("Digite o nome do dono: ");
        String newOwnerName = input.next();
        System.out.print("Digite o telefone do dono (formato: XXXX-XXXX): ");
        String newOwnerPhone = input.next();
        Services services = new Services();
        services.selectServices();
        services.printSelectedServices();
        return new Pet(newName, newAge, newType, newBreed, newOwnerName, newOwnerPhone, services);
    }
    public Pet getPet(String petName) {
        for (Pet pet : registeredPets) {
            if (pet != null && pet.getName().equals(petName)) {
                return pet;
            }
        }
        return null; // Retorna null se o pet não for encontrado
    }
    public void addPet(Pet newPet){
        if (count < 20){
            registeredPets[count] = newPet;
            System.out.println(registeredPets[count].getName() + " foi cadastrado com SUCESSO!");
            count++;
        } else {
            System.out.println("Número de pets excedido! Pet não cadastrado!");
        }
    }
    public void removePet(String petName) {
        for (int i = 0; i < count; i++) {
            if (registeredPets[i].toString().contains(petName)) {
                String petNameStr = registeredPets[i].getName();
                registeredPets[i] = null;
                organizeArray();
                count--;
                System.out.println("------------------------------------------------");
                System.out.println(petNameStr + " removido com sucesso!");
                return;
            }
        }
        System.out.println("Pet não encontrado.");
    }
    private void organizeArray() {
        int index = 0;
        Pet[] newArray = new Pet[20];
        for (int i = 0; i < registeredPets.length; i++) {
            if (registeredPets[i] != null) {
                newArray[index] = registeredPets[i];
                index++;
            }
        }
        registeredPets = newArray;
    }

    public void printRegisteredPets() {
        for (Pet pet : registeredPets) {
            if (pet != null) {
                System.out.println(pet.toString());
            }
        }
    }

    public void printRegisteredPetsAlphabetical() {
        Pet[] sortedPets = Arrays.copyOf(registeredPets, count);
        Arrays.sort(sortedPets, Comparator.comparing(Pet::getName));

        for (Pet pet : sortedPets) {
            if (pet != null) {
                System.out.println(pet.toString());
            }
        }
    }

    public void printPetPosition(){
        System.out.println("\t\t\tFILA");
        for (int i = 0; i < count; i++) {
            if (registeredPets[i] != null) {
                System.out.println("Nome: "+registeredPets[i].getName() + " - Posição: " + i);
            }
        }
    }
}
