package com.school.management.mapper;

import com.school.management.domain.DTO.ResultDTO;
import com.school.management.domain.Result;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResultMapper extends EntityMapper<ResultDTO, Result>{
}
