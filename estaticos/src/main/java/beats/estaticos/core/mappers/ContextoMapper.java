package beats.estaticos.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

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

  public Contexto map(ContextoDTO c) {
    return mapper.map(c, Contexto.class);
  }

  public List<ContextoDTO> map(List<Contexto> c) {
    return c.stream()
            .map(con -> {
              ContextoDTO dto = mapper.map(con, ContextoDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }

}
