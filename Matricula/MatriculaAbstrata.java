import java.util.ArrayList;
import java.util.List;

abstract class Aluno {
    private List<String> disciplinas = new ArrayList<>();

    public void matricular(String disciplina) {
        disciplinas.add(disciplina);
    }

    public void cancelarMatricula(String disciplina) {
        disciplinas.remove(disciplina);
    }

    public List<String> disciplinasMatriculadas() {
        return disciplinas;
    }
}

class AlunoImpl extends Aluno {
    private String nome;
    private String cpf;
    private String sexo;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public AlunoImpl(String nome, String cpf, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }

}
