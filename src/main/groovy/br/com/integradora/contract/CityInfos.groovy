package br.com.integradora.contract

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import groovy.transform.Canonical

@Canonical
@JsonIgnoreProperties(ignoreUnknown = true)
class CityInfos {
    @JsonProperty('OBJECTID')
    Integer objectId
    @JsonProperty('NM_MUNICIP')
    String nomeMunicipio
    @JsonProperty('CD_GEOCMU')
    Integer codMunicipio
    @JsonProperty('Centroide_')
    Double longitude
    @JsonProperty('Centroide1')
    Double latitude
    @JsonProperty('UF')
    String uf
    @JsonProperty('COD_UF')
    Integer codUf
    @JsonProperty('FONTES')
    String fonteDoDado
    @JsonProperty('Densidade')
    Double dencidadePopulacional
    @JsonProperty('Populacao_')
    Double populacao
    @JsonProperty('Região')
    String regiao
    @JsonProperty('Mesorregia')
    Integer codMessoRegiao
    @JsonProperty('Nome_Messo')
    String nomeMessoRegiao
    @JsonProperty('Microrregi')
    Integer codMicroRegiao
    @JsonProperty('Mome_Micro')
    String nomeMicroRegiao
    @JsonProperty('Estim_Pop_')
    Double populacaoEstimada
    @JsonProperty('TIPO')
    String tipoConcessao
    @JsonProperty('SIGR_ATUAL')
    Integer sigAtual
    @JsonProperty('SARI_ATUAL')
    Integer sariAtual
    @JsonProperty('SIGR_ANTIG')
    Integer sigAntigo
    @JsonProperty('SARI_ANTIG')
    Integer sariAntigo
    @JsonProperty('SIGL_ANTIG')
    String siglaAntiga
    @JsonProperty('SIGL_ATUAL')
    String siglaAtual
    @JsonProperty('D_ATUANTES')
    String distribuidorasAtuantes
    @JsonProperty('VIGENCIA')
    String vigencia
    @JsonProperty('SARI_AUTOR')
    Integer sariAutorizada
    @JsonProperty('SIGL_AUTOR')
    String siglaAutorizada
    @JsonProperty('SARI_REGUL')
    Integer sariRegularizada
    @JsonProperty('SIGLA_REGU')
    String siglaRegularizada
    @JsonProperty('CNPJ')
    String cnpj
    @JsonProperty('ATO_LEGAL_')
    String atoLegal
}