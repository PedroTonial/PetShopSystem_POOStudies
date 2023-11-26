import java.util.Scanner;

public class Pet {
    private String name;
    private String age;
    private String type;
    private String breed;
    private String ownerName;
    private String ownerPhone;
    private Services services;

    public Pet (String name, String age,String type, String breed, String ownerName, String ownerPhone, Services services){
        this.name = name;
        this.age = age;
        this.type = type;
        this.breed = breed;
        this.ownerName=ownerName;
        this.ownerPhone= ownerPhone;
        this.services = services;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(String age){
        this.age = age;
    }
    public String getAge(){
        return this.age;
    }
    public Services getServices(){
        return this.services;
    }
    public void setServices(Services services){
        this.services = services;
    }

    public String toString() {
        return
                "-----------------------------\n"+"Nome: " + name + " | Tipo: " + type + " | Raça: " + breed + " | \nIdade: " + age +
                        " | Dono: " + ownerName + " | Telefone: " + ownerPhone + "\n-----------------------------\n";
    }


}

