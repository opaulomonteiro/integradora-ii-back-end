package br.com.integradora.service

import br.com.integradora.contract.FileInfos
import org.springframework.http.*
import org.springframework.web.client.RestTemplate

class DataLoadService {

    private RestTemplate restTemplate

    DataLoadService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate
    }

    FileInfos loadInfos() {
        String path = "https://sigel.aneel.gov.br/arcgis/rest/services/PORTAL/Distribui%C3%A7%C3%A3o/MapServer/0/query?" +
                "f=json&where=(1%3D1)%20AND%20(1%3D1)&returnGeometry=false&spatialRel=esriSpatialRelIntersects&" +
                "outFields=*&orderByFields=OBJECTID%20ASC&outSR=102100&resultOffset=50&resultRecordCount=50"

        HttpHeaders headers = new HttpHeaders()
        headers.accept = [MediaType.APPLICATION_JSON]
        headers.contentType = MediaType.APPLICATION_JSON

        HttpEntity<String> entity = new HttpEntity(headers)
        ResponseEntity<FileInfos> responseEntity = restTemplate.exchange(URI.create(path), HttpMethod.GET, entity, FileInfos)
        return responseEntity.body
    }
}