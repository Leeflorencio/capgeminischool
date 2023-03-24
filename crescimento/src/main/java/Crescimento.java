public class Crescimento {
    public static void main(String[] args) {

        double alturaMarcelo = 1.20;
        double alturaJoao = 1.05;
        double crescimentoAnualMarcelo = 0.05;
        double crescimentoAnualJoao = 0.07;
        int idade = 8;

        while(alturaMarcelo >= alturaJoao){
            alturaMarcelo += crescimentoAnualMarcelo;
            alturaJoao += crescimentoAnualJoao;
            idade ++;
        }
        System.out.println("Idade: " + idade);
        System.out.println("Altura João: " + alturaJoao);
        System.out.println("Altura Marcelo: " + alturaMarcelo);
    }
}
