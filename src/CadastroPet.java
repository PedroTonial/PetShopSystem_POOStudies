
import java.util.Arrays;
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
        System.out.println("Digite o nome do Pet: ");
        String newName =input.next();
        System.out.println("Digite o tipo do Pet: ");
        String newType = input.next();
        System.out.println("Digite a raça do Pet: ");
        String newBreed = input.next();
        System.out.println("Digite a idade do Pet: ");
        String newAge = input.next();
        System.out.println("Digite o nome do dono: ");
        String newOwnerName = input.next();
        System.out.println("Digite o telefone do dono (formato: XXXX-XXXX): ");
        String newOwnerPhone = input.next();
        return new Pet(newName, newAge, newType, newBreed, newOwnerName, newOwnerPhone);
    }

    public void addPet(Pet newPet){
        if (count < 20){
            registeredPets[count] = newPet;
            System.out.println(registeredPets[count].getName() + " foi adicionado ao registro!");
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
            System.out.println(pet.toString());
        }
    }

    public void printRegisteredPetsAlphabetical() {
        Pet[] sortedPets = Arrays.copyOf(registeredPets, count);
        Arrays.sort(sortedPets, (pet1, pet2) -> pet1.getName().compareTo(pet2.getName()));

        for (Pet pet : sortedPets) {
            System.out.println(pet.toString());
        }
    }

    public void printPetPosition(){
        System.out.println("Posição dos pets no vetor:");
        for (int i = 0; i < count; i++) {
            System.out.println(registeredPets[i].getName() + " - Posição: " + i);
        }
    }
}
