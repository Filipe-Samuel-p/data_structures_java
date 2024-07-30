package LE1.ex1;

public class Filme {

    private String nomeFilm;
    private String genero;
    private Integer anoLancamento;

    public Filme(){};

    public Filme(Integer anoLancamento, String genero, String nomeFilm) {
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.nomeFilm = nomeFilm;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNomeFilm() {
        return nomeFilm;
    }

    public void setNomeFilm(String nomeFilm) {
        this.nomeFilm = nomeFilm;
    }
}
