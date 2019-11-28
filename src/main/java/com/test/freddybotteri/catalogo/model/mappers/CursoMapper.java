/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.freddybotteri.catalogo.model.mappers;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.test.freddybotteri.catalogo.model.entities.Curso;


/**
 * Mapper de MyBatis para la gestión de la entidad 'Course'
    cur_nid
    cur_vtitulo
    cur_nsts
    cur_vnivel
    cur_vhoras
    cur_vprofesor
    cur_fcatalogo

 */
@Mapper
public interface CursoMapper {

	@Insert("INSERT INTO cat_curso(cur_vtitulo, cur_vnivel, cur_vhoras, prof_nid, cur_nsts,cur_fcatalogo) VALUES(#{titulo}, #{nivel}, #{numerohoras}, #{profesor}, #{state},#{catalogo})")
	@Options(useGeneratedKeys=true, keyProperty="cur_nid", keyColumn="cur_nid")
	public int insert(Curso course);


	@Select("SELECT c.cur_nid, c.cur_vtitulo, c.cur_vnivel, c.cur_vhoras, CONCAT(p.prof_vname,' ',p.prof_vapellido) as fullname, c.cur_nsts,cur_fcatalogo FROM cat_curso c"
                + " INNER JOIN cat_profesor as p ON c.prof_nid = p.prof_nid"
                + " where c.cur_nsts = 1 ORDER BY c.cur_vtitulo ASC "
                )
	@Results(value = {
			  @Result(property = "cur_nid", column = "cur_nid"),
			  @Result(property = "cur_vtitulo", column = "cur_vtitulo"),
			  @Result(property = "cur_vnivel", column = "cur_vnivel"),
			  @Result(property = "cur_vhoras", column = "cur_vhoras"),
			  @Result(property = "fullname", column = "fullname"),
			  @Result(property = "cur_nsts", column = "cur_nsts"),
                          @Result(property = "cur_fcatalogo", column = "cur_fcatalogo")
			})
	public List<Curso> getAll();



}

