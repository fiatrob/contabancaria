/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

/**
 *
 * @author robso
 */
public class Principal {
    public static void main(String[] args) {
        
        ContaBancaria conta01 = new ContaBancaria();
        conta01.nroAgencia = "1234-5";
        conta01.nroConta = "4141-89";
        conta01.nome = "João Brazil";
        conta01.cpf = "0043583119-78";
        conta01.limite = 500.00;
        conta01.saldo = 900.00;
        conta01.saque();
        conta01.deposito();
        
        
        
        
    }
    
}
