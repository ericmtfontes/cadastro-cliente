package banco;

public class Cliente {
    
    private String nome;
    private int id;
    private String tipoConta; // CC (Conta Corrente) ou CP (Conta Poupança)
    private double saldo;
    
    private Cliente() {

    }
    
    public Cliente(String nome, int id, String tipo){
        this.setNome(nome);
        this.setId(id);
        this.setTipo(tipo);
        
    }
    
    public void sacar(double v){
        if(this.getSaldo() > v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Novo saldo:" + this.getSaldo());
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void depositar(double v){
        this.setSaldo(this.getSaldo() + v);
        System.out.println("Deposito realizado com sucesso!");
        System.out.println("Novo saldo: " + this.getSaldo());
    }
    
    public void informacoesConta(){
        System.out.println("Nome.........: " + this.getNome());
        System.out.println("Id...........: " + this.getId());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Saldo........: " + this.getSaldo());
    }
    
    
    private String getNome(){
        return this.nome;
    }
    
    private void setNome(String nome){
        this.nome = nome;
    }
    
    private int getId(){
        return this.id;
    }
    
    private void setId(int id){
        this.id = id;
    }
    
    private String getTipo(){
        return this.tipoConta;
    }
    
    private void setTipo(String tipo){
        this.tipoConta = tipo;
        this.setSaldoInicial();
    }
    
    private double getSaldo(){
        return this.saldo;
    }
    
    private void setSaldo(double valor){
        this.saldo = valor;
        
    }
    
    private void setSaldoInicial(){
        
        if(Banco.TIPO_CONTA_CORRENTE.equals(this.getTipo())){
            this.setSaldo(this.getSaldo() + 50);
        }else{
            this.setSaldo(this.getSaldo() + 150);
        }
    }
}
