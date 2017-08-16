package contabancaria;

import javax.swing.JOptionPane;


public class ContaBancaria {
  //Declarando as variaveis  
String nroAgencia;
String nroConta;
String cpf;
String nome;
double saldo;
double limite;

//declaração de metodos
public void saque(){
    double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Saque: "));
    if(saldo >= valorSaque){
    saldo = saldo - valorSaque;    
    JOptionPane.showMessageDialog(null, "Seu Novo Saldo é "+saldo);
    }
    else if(limite >= valorSaque){
        limite = limite - valorSaque;
        JOptionPane.showMessageDialog(null, "Você esta devendo"+valorSaque);
        
    }
    
    else {
        JOptionPane.showMessageDialog(null, "Tá sem grana parça");
    }
       
    
    

}
public void deposito(){
    
    double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do deposito: "));
    //saldo= saldo + valorDeposito;
    if(valorDeposito > 0){
    saldo+=valorDeposito;
    JOptionPane.showMessageDialog(null, "Ta com a grana parça: "+saldo);
    }
    else{
        JOptionPane.showMessageDialog(null, "Trabalhe mais e depoiste um valor maior");
    }
}
public void transferencia(){
    
}
public void pagamento(){
}
}
