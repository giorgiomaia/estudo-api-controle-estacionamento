package com.estudoapicontroleestacionamento.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_VAGA_ESTACIONAMENTO")
public class VagaEstacionamento implements Serializable {
    private static final long serialVersionUIDLONG = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id; //Representa um identificador universalmente exclusivo imutável. Um UUID representa um valor de 128 bits.
    @Column(nullable = false, unique = true, length = 10)
    private String numeroVagaEstacionamento;
    @Column(nullable = false, length = 130)
    private String nomeResponsavelVaga;
    @Column(nullable = false)
    private LocalDateTime dataRegistro;
    @Column(nullable = false, length = 70)
    private String fabricanteCarro;
    @Column(nullable = false, length = 70)
    private String modeloCarro;
    @Column(nullable = false, length = 70)
    private String corCarro;
    @Column(nullable = false, unique = true, length = 7)
    private String placaCarro;
    @Column(nullable = false, length = 30)
    private String apartamento;
    @Column(nullable = false, length = 30)
    private String bloco;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNumeroVagaEstacionamento() {
        return numeroVagaEstacionamento;
    }

    public void setNumeroVagaEstacionamento(String numeroVagaEstacionamento) {
        this.numeroVagaEstacionamento = numeroVagaEstacionamento;
    }

    public String getNomeResponsavelVaga() {
        return nomeResponsavelVaga;
    }

    public void setNomeResponsavelVaga(String nomeResponsavelVaga) {
        this.nomeResponsavelVaga = nomeResponsavelVaga;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getFabricanteCarro() {
        return fabricanteCarro;
    }

    public void setFabricanteCarro(String fabricanteCarro) {
        this.fabricanteCarro = fabricanteCarro;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public void setCorCarro(String corCarro) {
        this.corCarro = corCarro;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }
}
