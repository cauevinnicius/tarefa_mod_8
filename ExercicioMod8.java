public class ExercicioMod8 {

    public static void main (String [] args){
    System.out.println("*** Calculadora de Notas ***");
    CalculaNotas();
}

    private static void CalculaNotas() {
        String nome = "Cauê";
        double nota1 = 8.0;
        double nota2 = 9.5;
        double nota3 = 7.0;
        double nota4 = 9.1;
        double calculaNotas = nota1 + nota2 + nota3 + nota4;
        double resultado = calculaNotas/4;
        System.out.println("Olá Sr. " + nome + "\nSuas notas informadas foram: \n" + nota1 + "\n" + nota2 + "\n" + nota3 + "\n" + nota4);
        System.out.println("Portanto, sua média é " + resultado + ". Parabéns!");
    }
}
