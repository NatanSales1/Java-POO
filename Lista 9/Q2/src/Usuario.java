/*Crie uma classe Usuario que contenha um método cadastrar() que aceita o nome e a data
de nascimento de um usuário como parâmetros. No entanto, trate exceções caso o nome
fornecido seja nulo ou vazio, ou caso a data de nascimento se refira a uma idade menor que
18 anos ou maior que 120 anos. Lance exceções personalizadas. Teste o método cadastrar()
em um programa principal, capturando e tratando as exceções lançadas. */

public class Usuario {
    String nome;
    int idade;
    
    void Cadastrar(String nome, int data) {
        try {
            if(nome == "") {
                throw new Exception("Nome inválido ou nulo.");
            }
            if(data < 1902 || data > 2005){
                throw new Exception("Data inválida.");
            }
            this.nome = nome;
            this.idade = (2023 - data);
            
        } catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
