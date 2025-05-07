package beats.estaticos.core.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import beats.estaticos.core.dtos.ContextoCreateDTO;
import beats.estaticos.core.dtos.ContextoDTO;
import beats.estaticos.core.models.Contexto;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ContextoMapper {
  private final ModelMapper mapper;

  public Contexto map(ContextoCreateDTO c) {
    return mapper.map(c, Contexto.class);
  }

  public ContextoDTO map(Contexto c) {
    return mapper.map(c, ContextoDTO.class);
  }

}
