/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

/**
 *
 * @author Carlos
 */
public class ejemplo15 {
    public static void main(String[] args) {
        
        int contador = 1;
        int limite = 1;
        
        while (contador < limite){
            System.out.printf("Valor %d\n", contador);
        }
    }
}
/*
no se ejecuta porque declaramos contador y limite como 1, y la condicon es que
si 1 < 1 por lo tanto es falso y no se puede ejecutar
*/