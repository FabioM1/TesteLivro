package newstime.controle;

import newstime.entidade.Livro;

/**
 * Está classe controla o cadastro dos livro, verifica se todos os requisitos e 
 * campos estão devidamente preenchidos
 * @author Fábio M.
 */
public class AdministraControle {
    /**
     * Atributos
     * @return 
     */
    
    
    
    
    
    /**
     * Metodos
     */
    
    /**
     * Verifica o tipo de conta, se é de cliente ou 
     * funcionario/administrador do sistema
     * @return 
     * retorna false se a conta não é de um funcionario ou seja de um cliente da livraria
     * retorna verdadeiro se caso o tipo da conta for de funcionario
     */
    public boolean verificaConta(){
        return false;
    }
    
    /**
     * Cadastra as editoras
     * deve ser feito antes de cadastrar os Livros
     */
    public void cadastraEditora(){
        
    }
    
    
    /**
     * Cadastra os autores
     * deve ser feito antes de cadastrar os livros
     */
    public void cadastraAutor() {
        
    }
    
    /**
     * Cadastra os livros
     * deve ser feito depois dos cadastros de autor e editora
     * @return 
     * Retorna verdadeiro caso todos os requisitos para o preenchimento do livro sejam atendidos
     * Retorna falso caso editora ou autor não estejam cadastrados previamente
     * Retorna falso caso algum campo do formulario para cadastro de livros não esteja preenchido corretamente
     */
    public boolean cadastraLivro(String autor, String titulo, String editora, int anoPublic, int qtdEstoq){
        Livro livro = new Livro(autor, titulo, editora, anoPublic, qtdEstoq);
        livro.escreveTela();
        return false;
    }
}
/*
        System.out.println("Autor: " + autor);
        System.out.println("Titulo: " + titulo);
        System.out.println("Editora: " + editora);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Quantidade no estoque: " + qtdEstoque);
*/