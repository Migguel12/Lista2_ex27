import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a fruta que deseja comprar Morango ou Maca: ");
        String fruta = ler.nextLine();
        System.out.println("");

        System.out.print("Informe quantos Kgs comprou: ");
        double peso = ler.nextDouble();
        System.out.println("");

        ler.close();

        if("Morango".equalsIgnoreCase(fruta)){
            if(peso <= 5){
                System.out.printf("O valor total é: %2.2f",peso * 2.50);
            }
            if(peso > 5 && peso <= 8){
                System.out.printf("O valor total é: %2.2f",peso * 2.20);
            }
            if(peso > 8.01){
                System.out.printf("O valor total é: %2.2f",peso * (2.20 - (2.20 * 0.10)));
            }
        }

        if("Maca".equalsIgnoreCase(fruta)){
            if(peso <= 5){
                System.out.printf("O valor total é: %2.2f",peso * 1.80);
            }
            if(peso > 5 && peso <= 8){
                System.out.printf("O valor total é: %2.2f",peso * 1.50);
            }
            if(peso > 8.01){
                System.out.printf("O valor total é: %2.2f",peso * (1.50 - (1.50 * 0.10)));
            }
        }

    }
}
