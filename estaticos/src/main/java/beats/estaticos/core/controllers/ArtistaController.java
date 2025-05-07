package beats.estaticos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import beats.estaticos.core.dtos.ArtistaCreateDTO;
import beats.estaticos.core.dtos.ArtistaDTO;
import beats.estaticos.core.mappers.ArtistaMapper;
import beats.estaticos.core.models.Artista;
import beats.estaticos.core.services.ArtistaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/artistas")
@RequiredArgsConstructor
public class ArtistaController {
  private final ArtistaMapper mapper;
  private final ArtistaService service;
  
  @PostMapping
  public ResponseEntity<ArtistaDTO> criar(@RequestBody ArtistaCreateDTO dto){
    Artista a = mapper.map(dto);
    Artista s = service.salvar(a);
    ArtistaDTO r = mapper.map(s);
    return new ResponseEntity<>(r, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<ArtistaDTO> atualizar(@RequestBody ArtistaDTO dto, @PathVariable String id){
    if (service.encontrarPeloId(id) == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Artista a = mapper.map(dto);
    Artista s = service.atualizar(id, a);
    ArtistaDTO r = mapper.map(s);
    return new ResponseEntity<>(r, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public void buscarPorId(@PathVariable String id){

  }

  @GetMapping
  public void encontrarTodos(){
    
  }
}
