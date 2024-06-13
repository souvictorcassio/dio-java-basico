import java.util.Scanner;

class ParametrosInvalidosException extends Exception {

	public String getMessage(){
		return "O segundo parâmetro deve ser maior que o primeiro";
	}
}

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
        terminal.close();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
		
		int contagem = parametroDois - parametroUm;
		
        for (int i = 0; contagem > i; i++){
            System.out.println("Quantidade de interações " + (i+1));
        }
	}

}