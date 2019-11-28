package com.test.freddybotteri.catalogo.model.entities;




import java.io.Serializable;
import java.util.List;

/**
 * entidad cursos
 * 
    cur_nid
    cur_vtitulo
    cur_nsts
    cur_vnivel
    cur_vhoras
    prof_nid
    cur_fcatalogo

 */
public class Curso implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * Identificador del curso
	 */
	private Long cur_nid;

	/**
	 * Titulo del curso
	 */
	private String cur_vtitulo;
        
        private String cur_fcatalogo;
	/**
	 * Nivel del curso
	 */
	private String cur_vnivel;
        
        /*
        union nombre apellido
        */
        private String fullname;

	/**
	 * Número de horas del curso
	 */
	private Integer cur_vhoras;

	/**
	 * Profesor del curso
	 */
	private Integer prof_nid;

	/**
	 * Estado del curso
	 */
	private Boolean cur_nsts;

	/**
	 * Devuelve el identificador del curso
	 * @return id
	 */
	public Long getId() {
		return cur_nid;
	}

	/**
	 * Establece el identificador del curso
	 * @param id
	 */
	public void setId(Long cur_nid) {
		this.cur_nid = cur_nid;
	}

	/**
	 * Devuelve el título del curso
	 * @return title
	 */
	public String getTitulo() {
		return cur_vtitulo;
	}

	/**
	 * Establece el título del curso
	 * @param title
	 */
	public void setTitulo(String cur_vtitulo) {
		this.cur_vtitulo = cur_vtitulo;
	}

	/**
	 * Devuelve el nivel del curso
	 * @return level
	 */
	public String getNivel() {
		return cur_vnivel;
	}

	/**
	 * Establece el nivel del curso
	 * @param levelId
	 */
	public void setNivel(String nivel) {
		this.cur_vnivel = nivel;
	}

	/**
	 * Devuelve el número de horas del curso
	 * @return numberOfHours
	 */
	public Integer getNumerohoras() {
		return cur_vhoras;
	}

	/**
	 * Establece el número de horas del curso
	 * @param numberOfHours
	 */
	public void setNumerohoras(Integer numerohoras) {
		this.cur_vhoras = numerohoras;
	}

	/**
	 * Devuelve el profesor del curso
	 * @return the teacher
	 */
	public Integer getProfesor() {
		return prof_nid;
	}

	/**
	 * Establece el profesor del curso
	 * @param teacher
	 */
	public void setProfesor(Integer profesor) {
		this.prof_nid = profesor;
	}
        
        
        public String getFullname() {
		return fullname;
	}

	/**
	 * Establece el profesor del curso
	 * @param teacher
	 */
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	/**
	 * Devuelve el estado del curso
	 * @return the state
	 */
	public Boolean getState() {
		return cur_nsts;
	}

	/**
	 * Establece el estado del curso
	 * @param state
	 */
	public void setState(Boolean catalogo) {
		this.cur_nsts = catalogo;
	}
        
        
        public String getCatalogo() {
		return cur_fcatalogo;
	}

	/**
	 * Establece el estado del curso
	 * @param state
	 */
	public void setCatalogo(String catalogo) {
		this.cur_fcatalogo = catalogo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cur_nid == null) ? 0 : cur_nid.hashCode());
		result = prime * result + ((cur_vnivel == null) ? 0 : cur_vnivel.hashCode());
		result = prime * result + ((cur_vhoras == null) ? 0 : cur_vhoras.hashCode());
		result = prime * result + ((cur_nsts == null) ? 0 : cur_nsts.hashCode());
		result = prime * result + ((prof_nid == null) ? 0 : prof_nid.hashCode());
		result = prime * result + ((cur_vtitulo == null) ? 0 : cur_vtitulo.hashCode());
                result = prime * result + ((cur_fcatalogo == null) ? 0 : cur_fcatalogo.hashCode());
                        result = prime * result + ((fullname == null) ? 0 : fullname.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Curso)) {
			return false;
		}
		Curso other = (Curso) obj;
		if (cur_nid == null) {
			if (other.cur_nid != null) {
				return false;
			}
		} else if (!cur_nid.equals(other.cur_nid)) {
			return false;
		}
		if (cur_vnivel == null) {
			if (other.cur_vnivel != null) {
				return false;
			}
		} else if (!cur_vnivel.equals(other.cur_vnivel)) {
			return false;
		}
		if (cur_vhoras == null) {
			if (other.cur_vhoras != null) {
				return false;
			}
		} else if (!cur_vhoras.equals(other.cur_vhoras)) {
			return false;
		}
		if (cur_nsts == null) {
			if (other.cur_nsts != null) {
				return false;
			}
		} else if (!cur_nsts.equals(other.cur_nsts)) {
			return false;
		}
		if (prof_nid == null) {
			if (other.prof_nid != null) {
				return false;
			}
		} else if (!prof_nid.equals(other.prof_nid)) {
			return false;
		}
		if (cur_vtitulo == null) {
			if (other.cur_vtitulo != null) {
				return false;
			}
		} else if (!cur_vtitulo.equals(other.cur_vtitulo)) {
			return false;
		} 
                if (cur_fcatalogo == null) {
			if (other.cur_fcatalogo != null) {
				return false;
			}
		}else if (!cur_fcatalogo.equals(other.cur_fcatalogo)) {
			return false;
		}
                if (fullname == null) {
			if (other.fullname != null) {
				return false;
			}
		}else if (!fullname.equals(other.fullname)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName());
		builder.append(" [");
		if (cur_nid != null) {
			builder.append("id=");
			builder.append(cur_nid);
			builder.append(", ");
		}
		if (cur_vtitulo != null) {
			builder.append("Titulo=");
			builder.append(cur_vtitulo);
			builder.append(", ");
		}
		if (cur_vnivel != null) {
			builder.append("Nivel=");
			builder.append(cur_vnivel);
			builder.append(", ");
		}
		if (cur_vhoras != null) {
			builder.append("NumeroHoras=");
			builder.append(cur_vhoras);
			builder.append(", ");
		}
		if (prof_nid != null) {
			builder.append("Profesor=");
			builder.append(prof_nid);
			builder.append(", ");
		}
		if (cur_nsts != null) {
			builder.append("state=");
			builder.append(cur_nsts);
		}
                if (cur_fcatalogo != null) {
			builder.append("catalogo=");
			builder.append(cur_fcatalogo);
		}
                if (fullname != null) {
			builder.append("fullname=");
			builder.append(fullname);
		}
		builder.append("]");
		return builder.toString();
	}


}
