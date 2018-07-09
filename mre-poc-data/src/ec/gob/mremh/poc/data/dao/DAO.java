/*
 * Copyright 2017 MINISTERIO DE RELACIONES EXTERIORES Y MOVILIDAD HUMANA
 * Todos los derechos reservados
 */
package ec.gob.mremh.poc.data.dao;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.gob.mre.system.persistence.Persistencia;



/**
 * <b> Instancia el Persistence Unit. </b>
 * 
 * @author jatiencia
 * @version $Revision: 1.0 $
 *          <p>
 *          [$Author: jatiencia $, $Date: 13 nov. 2017 $]
 *          </p>
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class DAO {

	@PersistenceContext(unitName = "mre-poc-data")
	private EntityManager entityManager;

	private Persistencia persistencia;

	@PostConstruct
	public void init() {

		this.persistencia = new Persistencia(entityManager);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public Persistencia getPersistencia() {
		return persistencia;
	}

}
