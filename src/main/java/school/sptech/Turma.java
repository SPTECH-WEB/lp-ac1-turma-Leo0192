package school.sptech;

public class Turma {
    private String nome;
    private Double mensalidade;
    private Integer qtdAluno;
    private Boolean ativa;

    public Turma (String nome, Double mensalidade){
        this.qtdAluno = 0;
        this.ativa = true;
        this.mensalidade = 1000.0;
        this.nome = "CCO2024";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }


    public Integer getQtdAluno() {
        return qtdAluno;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void matricular(Integer qtd){
        if (qtd != null && ativa == true && qtd > 0){
            this.qtdAluno += qtd;
        }
    }

    public Integer cancelar(Integer qtd){
        if (qtd != null && qtd > 0 && qtd <= qtdAluno && ativa == true){
            this.qtdAluno -= qtd;

        }else {return null;} return qtd;
    }

    public Integer desativar(){
        int qtdAlunoAtual = 0;
        if (ativa == true){
            qtdAlunoAtual = qtdAluno;
            this.ativa = false;
            this.qtdAluno = 0;
        } else {return null;} return qtdAlunoAtual;
    }

    public void transferir(Turma destino, Integer qtdATransferir){
        if (destino != null && qtdATransferir != null && qtdATransferir > 0 && destino.ativa == true &&
                this.qtdAluno > qtdATransferir && ativa == true){
            this.qtdAluno -= qtdATransferir;
                destino.qtdAluno += qtdATransferir;
        }
    }


    public Double getMensalidade() {
        return mensalidade;
    }

    public Boolean reajustarMensalidade(Double reajuste){
        if (reajuste != null && reajuste > 0){
            reajuste = 0.15;
            this.mensalidade = mensalidade + (mensalidade * reajuste);
        } else {return false;} return true;
    }
}