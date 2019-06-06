package online.tangbk.kanban.mapper;

import org.springframework.stereotype.Component;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@Component
public class DeveloperMapper {

	MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

}
