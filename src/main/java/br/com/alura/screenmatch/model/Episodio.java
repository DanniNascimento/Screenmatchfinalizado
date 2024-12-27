package br.com.alura.screenmatch.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Objects;


@Entity
@Table(name = "episodios")
public final class Episodio {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Integer temporada;
    private String titulo;
    private Integer numeroEpisodio;
    private Double avaliacao;
    private LocalDate dataLancamento;

    @ManyToOne
    @JoinColumn(name = "serie_id")
    private Serie serie;

    public Episodio(){}

    public Episodio(Integer numeroTemporada, DadoEpisodio dadoEpisodio) {
        this.temporada = numeroTemporada;
        this.titulo = dadoEpisodio.titulo();
        this.numeroEpisodio = dadoEpisodio.numero();

        try {
            this.avaliacao = Double.valueOf(dadoEpisodio.avaliacao());
        } catch (NumberFormatException ex) {
            this.avaliacao = 0.0;
        }

        try {
            this.dataLancamento = LocalDate.parse(dadoEpisodio.dataLancamento());
        } catch (DateTimeParseException ex) {
            this.dataLancamento = null;
        }
    }

    public Serie getSerie() {

        return serie;
    }

    public void setSerie(Serie serie) {

        this.serie = serie;
    }


    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public Integer getTemporadas() {

        return temporada;
    }

    public void setTemporadas(Integer temporada) {

        this.temporada = temporada;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public Integer getNumeroEpisodio() {

        return numeroEpisodio;
    }

    public void setNumeroEpisodio(Integer numeroEpisodio) {

        this.numeroEpisodio = numeroEpisodio;
    }

    public Double getAvaliacao() {

        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {

        this.avaliacao = avaliacao;
    }

    public LocalDate getDataLancamento() {

        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {

        this.dataLancamento = dataLancamento;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Episodio episodio = (Episodio) o;
        return id == episodio.id && Objects.equals(temporada, episodio.temporada) && Objects.equals(titulo, episodio.titulo) && Objects.equals(numeroEpisodio, episodio.numeroEpisodio) && Objects.equals(avaliacao, episodio.avaliacao) && Objects.equals(dataLancamento, episodio.dataLancamento) && Objects.equals(serie, episodio.serie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, temporada, titulo, numeroEpisodio, avaliacao, dataLancamento, serie);
    }

    @Override
    public String toString() {
        return "Episodio{" +
                "id=" + id +
                ", temporada=" + temporada +
                ", titulo='" + titulo + '\'' +
                ", numeroEpisodio=" + numeroEpisodio +
                ", avaliacao=" + avaliacao +
                ", dataLancamento=" + dataLancamento;
    }
}