/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

import javax.swing.JOptionPane;

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
        
        
         ContaBancaria conta02 = new ContaBancaria();
        conta02.nroAgencia = "2365-5";
        conta02.nroConta = "4531-89";
        conta02.nome = "Maria Argentina";
        conta02.cpf = "1236544-96";
        conta02.limite = 900.00;
        conta02.saldo = 900.00;
        
        
        char opcao1 = 'z';
        //JOptionPane.showInputDialog("Escolha uma opção: \n D - Deposito \n S - Saque \n T - Transferencia \n P - Pagamentos").charAt(0);
        
        
        
        while(opcao1 !='X' ){
           char opcao = JOptionPane.showInputDialog("Escolha uma opção: \n D - Deposito \n S - Saque \n T - Transferencia \n P - Pagamentos").charAt(0);
       
            
            switch(opcao){
            
            case 'D':
                conta01.deposito();
            break;
            
            case 'S':
                conta01.saque();
             break;
             
            case 'T':
                conta01.transferencia(conta01, conta02);
            break;
            
            case 'P':
             break;
             
            case 'x':
                JOptionPane.showMessageDialog(null, "Ate logo!!");
                System.exit(0);
                break;
             
            default:
                JOptionPane.showMessageDialog(null,"Opção Invalida");
            
            
                       
            
        }
        }
        
        
        
        
        
        
    }
    
}
