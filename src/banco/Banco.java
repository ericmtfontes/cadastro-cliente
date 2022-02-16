package banco;
import java.util.Scanner;

public class Banco {
    
    public static String TIPO_CONTA_CORRENTE = "CC";
    public static String TIPO_CONTA_POUPANCA = "CP";
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Quantos clientes voce deseja cadastrar? ");
        int x = ler.nextInt();
        
        Cliente vetor[] = new Cliente[x];
                
        for(int i = 0; i < x; i++){
            System.out.println("Cadastro do "+ (i+1) +"° " +" cliente");
            System.out.print("Nome...........: ");
            String nome = ler.next();
            System.out.print("Id.............: ");
            int id = ler.nextInt();
            System.out.print("Tipo de conta? CC ou CP ");
            String tipo = ler.next();
            vetor[i] = new Cliente(nome,id,tipo.toUpperCase());
            System.out.println("-----------------------");
        }
        
        for(int i = 0; i < x; i++){
            vetor[i].informacoesConta();
            System.out.println();
            System.out.println("-----------------------");
        }
        
        
        
    }
    
}
