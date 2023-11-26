import java.util.*;
public class Services {
    private int count;
    private int bathCount;
    private int trimCount;
    private int nailCount;
    private int hairCount;
    private int mouthCount;
    private int otherCount;
    private int bathPrice = 30;
    private int trimPrice = 40;
    private int nailPrice = 10;
    private int hairPrice = 40;
    private int mouthPrice = 100;
    private int otherPrice = 60;
    private String [] selectedServices;

    public Services (){
        selectedServices = new String[6];
        this.count = 0;
        this.bathCount =0;
        this.trimCount =0;
        this.nailCount=0;
         this.hairCount=0;
         this.mouthCount =0;
         this.otherCount=0;
    }

    public void selectServices(){
        Scanner input = new Scanner (System.in);
        int option;
        do {
            System.out.println("--------------------------------------------------");
            System.out.println("\tSERVIÇOS\n" +
                    "1. Banho\n" +
                    "2. Tosa\n" +
                    "3. Corte de Unha\n" +
                    "4. Hidratação\n" +
                    "5. Higiene bucal\n" +
                    "6. Outro\n" +
                    "0. Voltar ao Menu de Cadastro");
            System.out.println("Escolha a partir do número do menu: ");
            option = input.nextInt();
            switch (option) {
                case 1:
                    selectedServices[count] = "Banho";
                    bathCount++;
                    count++;
                    break;
                case 2:
                    selectedServices[count] = "Tosa";
                    count++;
                    trimCount++;
                    break;
                case 3:
                    selectedServices[count] = "Unha";
                    count++;
                    nailCount++;
                    break;
                case 4:
                    selectedServices[count] = "Hidratação";
                    count++;
                    hairCount++;
                    break;
                case 5:
                    selectedServices[count] = "Bucal";
                    count++;
                    mouthCount++;

                    break;
                case 6:
                    selectedServices[count] = "Outro";
                    count++;
                    otherCount++;
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal");
                    System.out.println("------------------------------------------------");
                    break;
                default:
                    System.out.println("Opção inválida, selecione outra opção!");
                    break;
            }
        }while (option != 0);
    }

    public void printSelectedServices (){
        System.out.println("Serviços selecionados:");
        for (String selected : selectedServices){
            if (selected != null) {
                System.out.println("\t"+selected);
                System.out.println("-----------------------");
            }
        }
    }

    public void averageNumServices() {
        int totalServices = bathCount + nailCount + trimCount + mouthCount + otherCount + hairCount;

        if (totalServices == 0) {
            System.out.println("Nenhum serviço foi utilizado ainda.");
            return;
        }

        double averageNumServices = (double) totalServices / selectedServices.length;

        System.out.println("Média de serviços realizados no pet: " + averageNumServices);
    }


    public void averageServicePrice() {
        int totalServices = bathCount + nailCount + trimCount + mouthCount + otherCount + hairCount;

        if (totalServices == 0) {
            System.out.println("Nenhum serviço foi utilizado ainda.");
            return;
        }

        int totalPrice = (bathCount * bathPrice) + (nailCount * nailPrice) +
                (trimCount * trimPrice) + (mouthCount * mouthPrice) +
                (otherCount * otherPrice) + (hairCount * hairPrice);

        double averagePrice = (double) totalPrice / totalServices;

        System.out.printf("Preço médio dos serviços feitos no pet: %.2f" , averagePrice + "\n");
    }

    public void calculateServicePercentage() {
        int totalServices = bathCount + nailCount + trimCount + mouthCount + otherCount + hairCount;

        if (totalServices == 0) {
            System.out.println("Nenhum serviço foi utilizado ainda.");
            return;
        }

        double bathPercentage = (double) bathCount / totalServices * 100;
        double trimPercentage = (double) trimCount / totalServices * 100;
        double nailPercentage = (double) nailCount / totalServices * 100;
        double hairPercentage = (double) hairCount / totalServices * 100;
        double mouthPercentage = (double) mouthCount / totalServices * 100;
        double otherPercentage = (double) otherCount / totalServices * 100;

        System.out.println("Porcentagem de cada serviço utilizado:");
        System.out.println("Banho: " + bathPercentage + "%");
        System.out.println("Tosa: " + trimPercentage + "%");
        System.out.println("Corte de Unha: " + nailPercentage + "%");
        System.out.println("Hidratação: " + hairPercentage + "%");
        System.out.println("Higiene bucal: " + mouthPercentage + "%");
        System.out.println("Outro: " + otherPercentage + "%");
    }
}
