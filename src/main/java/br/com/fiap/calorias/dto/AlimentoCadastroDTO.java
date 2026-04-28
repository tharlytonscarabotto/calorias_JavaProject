package br.com.fiap.calorias.dto;

import br.com.fiap.calorias.model.Alimento;

public record AlimentoCadastroDTO(
        Long alimentoId,
        String nome,
        String porcao,
        Double quantidadeProteina,
        Double quantidadeCarboidrato,
        Double quantidadeGorduras
        ){
}
