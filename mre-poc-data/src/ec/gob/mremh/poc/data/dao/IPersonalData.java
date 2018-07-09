/*
 * Copyright 2016 MINISTERIO DE RELACIONES EXTERIORES Y MOVILIDAD HUMANA
 * Todos los derechos reservados
 */
package ec.gob.mremh.poc.data.dao;

import java.util.List;

import javax.ejb.Local;

import ec.gob.mremh.poc.data.entity.PocPersonalData;

/**
 * <b> Interfaz que expone métodos. </b>
 * 
 * @author cyumbillo
 * @version $Revision: 1.0 $
 *          <p>
 * 			[$Author: cyumbillo $, $Date: 11 nov. 2016 $]
 *          </p>
 */
@Local
public interface IPersonalData {

	/**
	 * 
	 * <b> Lista los idiomas activos. </b>
	 * <p>
	 * [Author: cyumbillo, Date: 11 nov. 2016]
	 * </p>
	 *
	 * @return
	 */
	List<PocPersonalData> listarIdiomas();
}
