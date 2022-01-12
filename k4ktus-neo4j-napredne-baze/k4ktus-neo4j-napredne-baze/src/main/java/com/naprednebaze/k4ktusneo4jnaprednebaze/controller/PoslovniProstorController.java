package com.naprednebaze.k4ktusneo4jnaprednebaze.controller;

import com.naprednebaze.k4ktusneo4jnaprednebaze.dto.PoslovniProstorDTO;
import com.naprednebaze.k4ktusneo4jnaprednebaze.model.PoslovniProstor;
import com.naprednebaze.k4ktusneo4jnaprednebaze.service.PoslovniProstorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/rest/neo4j/prostor")
public class PoslovniProstorController {

    private final PoslovniProstorService poslovniProstorService;

    public PoslovniProstorController(PoslovniProstorService poslovniProstorService) {
        this.poslovniProstorService = poslovniProstorService;
    }

    @GetMapping(
            value = "/getAll",
            produces = {"application/json"}
    )
    public Collection<PoslovniProstor> getAll() {
        return poslovniProstorService.getAll();
    }

    @PostMapping(
            value = "/addPoslovniProstor",
            produces = {"application/json"}
    )
    public HttpStatus addPoslovniProstor(Long jmbg, String datum_kupovine, @RequestBody(required = true) PoslovniProstorDTO poslovniProstorDTO) {
        try {
            poslovniProstorService.addPoslovniProstor(poslovniProstorDTO, jmbg, datum_kupovine);
        } catch (RuntimeException e) {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.ACCEPTED;
    }

    @DeleteMapping(
            value = "/deletePoslovniProstor",
            produces = {"application/json"}
    )
    public HttpStatus deletePoslovniProstor(@RequestBody(required = true) PoslovniProstorDTO poslovniProstorDTO) {
        try {
            poslovniProstorService.deletePoslovniProstor(poslovniProstorDTO);
        } catch (RuntimeException e) {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.ACCEPTED;
    }

    @PutMapping(
            value = "/updatePoslovniProstor",
            produces = {"application/json"}
    )
    public HttpStatus updatePoslovniProstor(@RequestBody(required = true) PoslovniProstorDTO poslovniProstorDTO) {
        try {
            poslovniProstorService.updatePoslovniProstor(poslovniProstorDTO);
        } catch (RuntimeException e) {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.ACCEPTED;
    }

    @DeleteMapping(
            value = "/deleteAllPoslovniProstor",
            produces = {"application/json"}
    )
    public HttpStatus deleteAllPoslovniProstor() {
        try {
            poslovniProstorService.deleteAllPoslovniProstor();
        } catch (RuntimeException e) {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.ACCEPTED;
    }
}
