package Construtores;
public class Principal {
    public static void main(String[] args) {
   
    System.out.println("__NOTA FISCAL EMITIDA E GERENCIADA APENAS PELOS FUNCIONARIOS__");


    Informacoesdocliente nota  = new Informacoesdocliente("jairo",15.08);
    
    
    System.out.println("Nome do cliente:--" + nota.nomedocliente + "--IDcliente:--" + nota.IDcliente);


    Armas gun = new Armas("Colt1911","Nove milimetros");    
    System.out.println("Nome da arma:--" + gun.Nome + "--Calibre da arma:--" + gun.calibre );
    }
 }
