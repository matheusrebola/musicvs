package beats.estaticos.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import beats.estaticos.core.dtos.AlbumCreateDTO;
import beats.estaticos.core.dtos.AlbumDTO;
import beats.estaticos.core.mappers.AlbumMapper;
import beats.estaticos.core.models.Album;
import beats.estaticos.core.services.AlbumService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/albuns")
@RequiredArgsConstructor
public class AlbumController {
  private final AlbumService service;
  private final AlbumMapper mapper;

  @PostMapping
  public ResponseEntity<AlbumDTO> criar(@RequestBody AlbumCreateDTO dto){
    Album a = mapper.map(dto);
    Album s = service.salvar(a);
    AlbumDTO r = mapper.map(s);
    return new ResponseEntity<>(r, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<AlbumDTO> atualizar(@RequestBody AlbumCreateDTO dto, @PathVariable String id){
    if (service.encontrarPeloId(id) == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Album a = mapper.map(dto);
    Album s = service.atualizar(a, id);
    AlbumDTO r = mapper.map(s);
    return new ResponseEntity<>(r, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<AlbumDTO> buscarPorId(@PathVariable String id){
    Album a = service.encontrarPeloId(id);
    AlbumDTO r = mapper.map(a);
    return new ResponseEntity<>(r, HttpStatus.OK);    
  }

  @GetMapping
  public ResponseEntity<List<AlbumDTO>> encontrarTodos(){
    List<Album> a = service.encontrarTodos();
    List<AlbumDTO> r = mapper.map(a);
    return new ResponseEntity<>(r, HttpStatus.OK);
  }
}
