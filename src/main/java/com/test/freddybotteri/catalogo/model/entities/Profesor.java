/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.freddybotteri.catalogo.model.entities;

import java.io.Serializable;

/**
 *
 * @author Freddy
 */
public class Profesor implements Serializable{
    private static final long serialVersionUID = 1L;

	/**
	 * Identificador del profesor
	 */
	private Long prof_nid;

	/**
	 * Titulo del curso
	 */
	private String prof_vname;
        
        private String prof_vapellido;
        
        private String fullname;



	/**
	 * Devuelve el identificador del curso
	 * @return id
	 */
	public Long getId() {
		return prof_nid;
	}

	/**
	 * Establece el identificador del curso
	 * @param id
	 */
	public void setId(Long prof_nid) {
		this.prof_nid = prof_nid;
	}


	public String getNombre() {
		return prof_vname;
	}


	public void setNombre(String prof_vname) {
		this.prof_vname = prof_vname;
	}
        
        
        public String getApelido() {
		return prof_vapellido;
	}


	public void setApellido(String prof_vapellido) {
		this.prof_vapellido = prof_vapellido;
	}
        
        
        public String getFullname() {
		return fullname = this.fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	

	

	

	
        
        


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((prof_nid == null) ? 0 : prof_nid.hashCode());
		result = prime * result + ((prof_vname == null) ? 0 : prof_vname.hashCode());
		result = prime * result + ((prof_vapellido == null) ? 0 : prof_vapellido.hashCode());
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
		if (!(obj instanceof Profesor)) {
			return false;
		}
		Profesor other = (Profesor) obj;
		if (prof_nid == null) {
			if (other.prof_nid != null) {
				return false;
			}
		} else if (!prof_nid.equals(other.prof_nid)) {
			return false;
		}
		if (prof_vname == null) {
			if (other.prof_vname != null) {
				return false;
			}
		} else if (!prof_vname.equals(other.prof_vname)) {
			return false;
		}
		if (prof_vapellido == null) {
			if (other.prof_vapellido != null) {
				return false;
			}
		} else if (!prof_vapellido.equals(other.prof_vapellido)) {
			return false;
		}
                
                if (fullname == null) {
			if (other.fullname != null) {
				return false;
			}
		} else if (!fullname.equals(other.fullname)) {
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
		if (prof_nid != null) {
			builder.append("id=");
			builder.append(prof_nid);
			builder.append(", ");
		}
		if (prof_vname != null) {
			builder.append("Nombre=");
			builder.append(prof_vname);
			builder.append(", ");
		}
		if (prof_vapellido != null) {
			builder.append("Apellido=");
			builder.append(prof_vapellido);
			builder.append(", ");
		}
                
                if (fullname != null) {
			builder.append("Fullname=");
			builder.append(fullname);
			builder.append(", ");
		}
		
		builder.append("]");
		return builder.toString();
	}
}
