package br.com.devmedia.java.cadastro.model.entities;

public enum EstadoCivil {

    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    SEPARADO("Separado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Viúvo");

    private String descricao;

    EstadoCivil(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
