package ec.gob.mremh.poc.service;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import ec.gob.mremh.arquitectura.dto.PocDataPersonalDTO;
import ec.gob.mremh.poc.logic.DataPersonalLogica;


/**
 * Clase que contiene los recursos proporcionados
 * 
 * @author nmoreno
 *
 */
@Path("/mensaje")
@Produces(MediaType.APPLICATION_JSON)
public class DataPersonalServicio implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB(lookup = "java:global/mre-poc-logic-0.0.1-SNAPSHOT/DataPersonalLogica")
	private DataPersonalLogica dataPersonalLogica;
	

	@POST
	@Path("/pocRest")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	/**
	 * 
	 * <b> Obtiene usuario dado la cuenta. </b>
	 * <p>
	 * [Author: nmoreno, Date: 03 jul. 2018]
	 * </p>
	 *
	 * @return
	 */
	public List<PocDataPersonalDTO> getMethodVal(@FormParam("val") String val) {
		List<PocDataPersonalDTO> poc = new ArrayList<>();
		try {
			poc = dataPersonalLogica.getResultList(val);
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return poc;
	}

	

}
