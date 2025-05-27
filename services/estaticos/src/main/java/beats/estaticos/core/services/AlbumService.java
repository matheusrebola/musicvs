package beats.estaticos.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import beats.estaticos.core.models.Album;
import beats.estaticos.core.repositories.AlbumRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AlbumService {
  private final AlbumRepository repository;

  public Album salvar(Album a) {
    return repository.save(a);
  }

  public Album encontrarPeloId(String id) {
    return repository.findById(id).orElse(null);
  }

  public Album atualizar(Album a, String b) {
    deletar(b);
    a.setId(b);
    return salvar(a);
  }

  public void deletar(String id){
    repository.deleteById(id);
  }

  public List<Album> encontrarTodos() {
    return repository.findAll();
  }
}
