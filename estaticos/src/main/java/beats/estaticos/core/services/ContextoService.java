package beats.estaticos.core.services;

import org.springframework.stereotype.Service;

import beats.estaticos.core.models.Contexto;
import beats.estaticos.core.repositories.ContextoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContextoService {
  private final ContextoRepository repository;

  public Contexto salvar(Contexto c) {
    return repository.save(c);
  }

}
