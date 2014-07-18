/**
 *
 * @author Emisvaldo
 */
public class Programa {
    
    public static void main(String[] args) {
        Conta emisvaldo = new Conta();
        emisvaldo.titular = new Pessoa();
        
        emisvaldo.numero = 25048;
        emisvaldo.agencia = 1325;
        emisvaldo.saldo = 2000;
        emisvaldo.titular.nome = "Emisvaldo Silva";
        
        emisvaldo.deposita(100);
        emisvaldo.sacar(5000);
        
        System.out.println("O seu saldo é de " + emisvaldo.saldo);
                
    }
    
}
