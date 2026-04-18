import java.util.ArrayList;

public class Catalogo {
    ArrayList<Filme> lista = new ArrayList<>();

    public void adicionar(Filme f) {
        lista.add(f);
    }

    public void listar() {
        for (Filme f : lista) {
            f.exibir();
        }
    }
}