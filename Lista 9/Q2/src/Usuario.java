/*Crie uma classe Usuario que contenha um m�todo cadastrar() que aceita o nome e a data
de nascimento de um usu�rio como par�metros. No entanto, trate exce��es caso o nome
fornecido seja nulo ou vazio, ou caso a data de nascimento se refira a uma idade menor que
18 anos ou maior que 120 anos. Lance exce��es personalizadas. Teste o m�todo cadastrar()
em um programa principal, capturando e tratando as exce��es lan�adas. */

public class Usuario {
    String nome;
    int idade;
    
    void Cadastrar(String nome, int data) {
        try {
            if(nome == "") {
                throw new Exception("Nome inv�lido ou nulo.");
            }
            if(data < 1902 || data > 2005){
                throw new Exception("Data inv�lida.");
            }
            this.nome = nome;
            this.idade = (2023 - data);
            
        } catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
