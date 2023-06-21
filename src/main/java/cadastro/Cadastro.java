/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cadastro;

/**
 *
 * @author GUSTAVOPILA
 */
public class Cadastro {

    public static void main(String[] args) {
        
        Cliente<String> nome = new Cliente<>("Gustavo");
        Cliente<String> sobrenome = new Cliente<>("Faustino");
        Cliente<Integer> idade = new Cliente<>(22);
        Cliente<String> email = new Cliente("gustavo.pila@alunos.unis.edu.br");
        System.out.println("Nome: " + nome.dado + " Sobrenome: " + sobrenome.dado + " Idade: " + idade.dado + " Email: " + email.dado);
        
    }
}
