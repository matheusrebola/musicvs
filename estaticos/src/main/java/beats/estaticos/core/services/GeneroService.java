package beats.estaticos.core.services;

import org.springframework.stereotype.Service;

import beats.estaticos.core.models.Genero;
import beats.estaticos.core.repositories.GeneroRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GeneroService {
  private final GeneroRepository repository;

  public Genero salvar(Genero g) {
    return repository.save(g);
  }

}
