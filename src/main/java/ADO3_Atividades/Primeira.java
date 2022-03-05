package ADO3_Atividades;
import java.util.Scanner;
/** por Rafael Ferreira Goulart
    Uma loja oferece para seus clientes um desconto de acordo com o valor da
compra. Este desconto é de 20% se o valor da compra for maior ou igual a R$
300,00 e 15% se for menor. Dado o valor do produto, mostre o valor (descontado)
da compra do cliente e o valor do desconto obtido;
**/
public class Primeira {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("\bInsira o valor da compra: \b");
        double valCompra = ent.nextDouble();
        while (valCompra <= 0) {
            System.out.println("\bO valor precisa ser maior que 0!\nInsira novamente o valor da compra: \b");
            valCompra = ent.nextDouble();
        } 
        
        int desc = 0;
        double descCompra, finalCompra = 0;
        if (valCompra >= 300) {
            desc = 20;
            descCompra = (valCompra*desc)/100;
            finalCompra = valCompra - descCompra;
        } else {
            desc = 15;
            descCompra = (valCompra*desc)/100;
            finalCompra = valCompra - descCompra;
        }
        
        System.out.println(
                  "Você recebeu um desconto de "+desc+"%!\n"
                + "Desconto: R$"+descCompra+"\n"
                + "Total a pagar: R$"+finalCompra);
    }
}