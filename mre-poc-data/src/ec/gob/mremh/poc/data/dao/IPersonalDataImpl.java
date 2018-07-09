/*
 * Copyright 2016 MINISTERIO DE RELACIONES EXTERIORES Y MOVILIDAD HUMANA
 * Todos los derechos reservados
 */
package ec.gob.mremh.poc.data.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import ec.gob.mremh.poc.data.entity.PocPersonalData;



/**
 * <b> Clase para controlar funcionalidad del idioma. </b>
 * 
 * @author cyumbillo
 * @version $Revision: 1.0 $
 *          <p>
 * 			[$Author: cyumbillo $, $Date: 11 nov. 2016 $]
 *          </p>
 */
@Stateless
public class IPersonalDataImpl extends DAO implements Serializable, IPersonalData {

	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.gob.mre.seguridades.bl.IIdioma#listarIdiomas()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PocPersonalData> listarIdiomas() {
		
		Query query = this.getEntityManager().createNamedQuery("PocPersonalData.findAll", PocPersonalData.class);
		return query.getResultList();
	}

}
