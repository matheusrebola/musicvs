package beats.estaticos.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import beats.estaticos.core.dtos.AlbumCreateDTO;
import beats.estaticos.core.dtos.AlbumDTO;
import beats.estaticos.core.models.Album;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AlbumMapper {
  private final ModelMapper mapper;

  public Album map(AlbumCreateDTO a) {
   return mapper.map(a, Album.class);
  }

  public AlbumDTO map(Album a) {
    return mapper.map(a, AlbumDTO.class);
  }

  public Album map(AlbumDTO a) {
    return mapper.map(a, Album.class);
  }

  public List<AlbumDTO> map(List<Album> a) {
    return a.stream()
            .map(al -> {
              AlbumDTO dto = mapper.map(al, AlbumDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }

}
