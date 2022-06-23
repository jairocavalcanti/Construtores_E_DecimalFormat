package Construtores;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Informacoesdocliente {
   
    String nomedocliente;
    Double IDcliente;
  
   
   
    public Informacoesdocliente(String nomedocliente, Double IDcliente ) {
        this.nomedocliente = nomedocliente;
        this.IDcliente = IDcliente;
        Scanner scanner = new Scanner(System.in);
        
        DecimalFormat formato = new DecimalFormat("PREÇO TOTAL DO PRODUTO: R$--0000");
        System.out.print("(!!!!FUNCIONÁRIO!!!!)---Insira o valor do produto:");
        Double valor = scanner.nextDouble();
        
        String novoformatodovalor = formato.format(valor);
        System.out.println(novoformatodovalor);
        scanner.close();
        }
   }
