package br.com.integradora.controller

import br.com.integradora.contract.FileInfos
import br.com.integradora.service.DataLoadService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/data")
class DataLoadController {

    private DataLoadService dataLoadService

    DataLoadController(DataLoadService dataLoadService) {
        this.dataLoadService = dataLoadService
    }

    @PostMapping
    ResponseEntity<FileInfos> loadData() {
        return new ResponseEntity<FileInfos>(dataLoadService.loadInfos(), HttpStatus.OK)
    }
}