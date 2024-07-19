import java.util.Arrayist;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
  private List<Livro> livros;
  private List<Usuario> usuarios;
  private List<Emprestimo> emprestimos;
  
  public Biblioteca() {
    this.livros = new ArrayList<>();
    this.usuarios = new ArrayList<>();
    this.emprestimos = new ArrayList<>();
  }
  public void adicionarLivro (Livro livro) {
    livros.add(livro);
      }
  public void adicionarUsuario (Usuario usuario) {
    usuarios.add(usuarios);
      }
  public void realizarEmprestimo (Livros livros, usuarios Usuarios) {
     Emprestimo emprestimo = new Emprestimo(livro, usuario, new Date());
     emprestimos.add(emprestimo);
  }
  public List<Livro> getLivros() {
    return Collections.unmodifiableList(livros);
  }
  public List<Usuarios> getUsuarios() {
    return Collections.unmodiableList(usuarios);
  }
public List<Emprestimo> getEmprestimo() {
  return Collections.unmodifiableList(emprestimos);
}
  public void listarLivros() {
  for (Livro livro : livros) {
    System.out.println(livro);
  }
}
public void listarUsuarios() {
  for (Usuario usuario : usuarios) {
      System.out.println(usuario);
  }
}
public void listarEmprestimos() {
  for (Emprestimo emprestimo : emprestimos) {
    System.out.println(emprestimo); 
  }
 }
} 
