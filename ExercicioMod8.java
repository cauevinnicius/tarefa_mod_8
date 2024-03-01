public class ExercicioMod8 {

    public static void main (String [] args){
    System.out.println("*** Calculadora de Idade ***");
    CalculaIdade();
}

    private static void CalculaIdade() {
        String nome = "Cauê";
        int anoNasc = 1999;
        int anoAtual = 2024;
        System.out.println("Olá Sr. " + nome + "\nSeu ano de nascimento informado é: " + anoNasc + " sendo que você está em: " + anoAtual);
        int calculaIdade = anoAtual - anoNasc;
        System.out.println("Portanto, sua idade é " + calculaIdade + " anos!");
    }
}
