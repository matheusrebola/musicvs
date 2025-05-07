package beats.estaticos.core.services;

import org.springframework.stereotype.Service;

import beats.estaticos.core.models.Artista;
import beats.estaticos.core.repositories.ArtistaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArtistaService {
  private final ArtistaRepository repository;

  public Artista salvar(Artista a) {
    return repository.save(a);
  }

  public Artista encontrarPeloId(String id) {
    return repository.findById(id).orElse(null);
  }

  public Artista atualizar(String id, Artista a) {
    deletarPeloId(id);
    a.setId(id);
    return salvar(a);
  }

  public void deletarPeloId(String id){
    repository.deleteById(id);
  }

}
