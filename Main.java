public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("1984", "George Orwell");
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");

        Usuario usuario1 = new Usuario("João", "123");
        Usuario usuario2 = new Usuario("Maria", "456");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.adicionarUsuario(usuario1);
        biblioteca.adicionarUsuario(usuario2);

        biblioteca.realizarEmprestimo(livro1, usuario1);
        biblioteca.realizarEmprestimo(livro2, usuario2);

        System.out.println("Livros na biblioteca:");
        biblioteca.listarLivros();

        System.out.println("\nUsuários na biblioteca:");
        biblioteca.listarUsuarios();

        System.out.println("\nEmpréstimos realizados:");
        biblioteca.listarEmprestimos();
    }
}
