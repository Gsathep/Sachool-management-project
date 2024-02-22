package com.school.management.mapper;

import com.school.management.domain.DTO.StudentDTO;
import com.school.management.domain.Student;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper extends EntityMapper<StudentDTO, Student>


{

}
