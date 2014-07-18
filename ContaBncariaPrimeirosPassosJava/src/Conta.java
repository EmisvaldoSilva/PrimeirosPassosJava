/**
 *
 * @author Emisvaldo Silva
 */
public class Conta {
    int numero;
    Pessoa titular;
    Pessoa dataNascimento;
    Pessoa cpf;
    double saldo;
    int agencia;
    
    void deposita(double valorASerDepositado){
        this.saldo += valorASerDepositado;
    }
    
    void sacar(double valorASerSacado){
        if(this.saldo < valorASerSacado){
            System.out.println("Saldo insuficiente!");
        }
        this.saldo -= valorASerSacado;
    }  
    
    void transfere(double valor, Conta origem, Conta destino){
        this.saldo -= valor;
        destino.saldo += valor;
    }
    
}
