/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.freddybotteri.catalogo.model.mappers;


import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import com.test.freddybotteri.catalogo.model.entities.Profesor;
/**
 *
 * @author Freddy
 */
@Mapper
public interface ProfesorMapper {
    @Select("SELECT p.prof_nid,CONCAT(p.prof_vname,' ',p.prof_vapellido) as fullname   FROM cat_profesor p")
    @Results(value = {
                      @Result(property = "prof_nid", column = "prof_nid"),
                      @Result(property = "fullname", column = "fullname")
                    })
    public List<Profesor> getAllProfesor();
}
