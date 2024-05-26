public class MinhaClasse {
    public static void main (String [] args) {
        
        String primeiroNome = "Victor Cássio";
        String sobreNome = "de Sousa";
        
        String nomeCompleto = nomeCompleto(primeiroNome, sobreNome);

        int anoNascimento = 1995;

        boolean verdadeiro = true;

        anoNascimento = 1996;

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String sobreNome) {
        return primeiroNome.concat(" ").concat(sobreNome);
    }
}