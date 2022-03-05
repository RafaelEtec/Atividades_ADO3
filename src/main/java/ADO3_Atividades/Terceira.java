package ADO3_Atividades;
import java.util.Scanner;
/** Dado um ano com 4 dígitos dizer se ele é um ano bissexto ou não. (Lembre-se
que um ano é bissexto se ele for divisível por 400 ou se ele for divisível por 4 e
não por 100.)
**/
public class Terceira {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira um ano desejado, composto por 4 números: ");
        int ano = ent.nextInt();
        
        if ((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 == 1)) {
            System.out.println(ano+" É um ano bissexto!");
        } else {
            System.out.println(ano+" Não é um ano bissexto");
        }
    }
}