package br.com.cbf.campeonatobrasileiro.rest;

import br.com.cbf.campeonatobrasileiro.dto.TimeDTO;
import br.com.cbf.campeonatobrasileiro.entity.Time;
import br.com.cbf.campeonatobrasileiro.service.TimeServico;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/times")
public class TimeRestController {

    @Autowired
    private TimeServico timeServico;

    @GetMapping("/listartimes")
    public ResponseEntity<List<TimeDTO>> getTimes(){

        return ResponseEntity.ok().body(timeServico.listarTimes());
    }


    @GetMapping("{id}")
    public ResponseEntity<TimeDTO> getTime(@PathVariable Integer id){
        return ResponseEntity.ok().body(timeServico.obterTime(id));
    }

    @PostMapping
    public ResponseEntity<TimeDTO> cadastrarTime(@Valid @RequestBody TimeDTO time){
        timeServico.cadastrarTime(time);
        return ResponseEntity.ok().body(time);
    }
}
