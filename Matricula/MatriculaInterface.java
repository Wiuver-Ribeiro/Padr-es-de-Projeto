import java.util.ArrayList;
import java.util.List;

interface Aluno {
    void matricular(String disciplina);
    void cancelarMatricula(String disciplina);
    // void renovarMatricula(String disciplina);

    List<String> disciplinasMatriculadas();
}

class AlunoImpl implements Aluno {
    private List<String> disciplinas = new ArrayList<>();

    @Override
    public void matricular(String disciplina) {
        disciplinas.add(disciplina);
    }

    @Override
    public void cancelarMatricula(String disciplina) {
        disciplinas.remove(disciplina);
    }

    @Override
    public List<String> disciplinasMatriculadas() {
        return disciplinas;
    }
}
