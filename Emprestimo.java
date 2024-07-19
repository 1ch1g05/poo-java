import java.util.Date;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private Date dataEmprestimo;

    public Emprestimo(Livro livro, Usuario usuario, Date dataEmprestimo) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "livro=" + livro +
                ", usuario=" + usuario +
                ", dataEmprestimo=" + dataEmprestimo +
                '}';
    }
}
