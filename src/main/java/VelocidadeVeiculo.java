import java.util.Scanner;

public class VelocidadeVeiculo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a velocidade do carro: ");
        int velocidadeVeiculo = scan.nextInt();

        double velocidadeLeve = 50 * 1.1;
        int velocidadeMedia = 70;
        int velocidadeGrave = 90;
        int velocidadeGravissima = 110;

        System.out.println("Velocidade do carro: " + velocidadeVeiculo+ "km");

        if(velocidadeVeiculo <= velocidadeLeve){
            System.out.println("Isento de multa");
        } else if(velocidadeVeiculo <= velocidadeMedia){
            System.out.println("3 pontos na carteira");
        } else if(velocidadeVeiculo <= velocidadeGrave){
            System.out.println("4 pontos na carteira");
        } else if (velocidadeVeiculo <= velocidadeGravissima) {
            System.out.println("5 pontos na carteira");
        } else System.out.println("7 pontos na carteira");
    }
}
