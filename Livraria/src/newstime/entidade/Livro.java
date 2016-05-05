/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newstime.entidade;

/**
 *
 * @author aluno
 */
public final class Livro {
    private int isbn;
    private String titulo;
    private String autor;//mudar classe autor
    private String editora;//mudar para editora

   
    private int anoPublicacao;
    private String categoriaLivro;//mudar classe CategoriaLivro
    private int qtdEstoque;
    private float precoVenda;
    private float precoOferta;
    private float margemLucro;
    private boolean oferta;
    private boolean digital;

    //Getters e setters
    
     public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }
    
    
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setCategoriaLivro(String categoriaLivro) {
        this.categoriaLivro = categoriaLivro;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setPrecoOferta(float precoOferta) {
        this.precoOferta = precoOferta;
    }

    public void setMargemLucro(float margemLucro) {
        this.margemLucro = margemLucro;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getCategoriaLivro() {
        return categoriaLivro;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public float getPrecoOferta() {
        return precoOferta;
    }

    public float getMargemLucro() {
        return margemLucro;
    }

    public boolean isOferta() {
        return oferta;
    }

    public boolean isDigital() {
        return digital;
    }
    
    public Livro(String autor, String titulo, String editora, int anoPublicacao, int qtdEstoque){
        setAutor(autor);
        setTitulo(titulo);
        setEditora(editora);
        setAnoPublicacao(anoPublicacao);
        setQtdEstoque(qtdEstoque);
    }
    
    
    
    
    public void escreveTela(){
   //public void escreveTela(Livro livro){
        /*System.out.println("_______________________________");
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Editora: " + livro.getEditora());
        System.out.println("Ano de publicação: " + livro.getAnoPublicacao());
        System.out.println("Quantidade no estoque: " + livro.getQtdEstoque());*/
        System.out.println("_______________________________");
        System.out.println("Autor: " + getAutor());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Editora: " + getEditora());
        System.out.println("Ano de publicação: " + getAnoPublicacao());
        System.out.println("Quantidade no estoque: " + getQtdEstoque());
    }
    
    
}
/*
private String titulo;
    private String autor;//mudar classe autor
    private int anoPublicacao;
    private String categoriaLivro;//mudar classe CategoriaLivro
    private int qtdEstoque;
    private float precoVenda;
    private float precoOferta;
    private float margemLucro;
    private boolean oferta;
    private boolean digital;
*/