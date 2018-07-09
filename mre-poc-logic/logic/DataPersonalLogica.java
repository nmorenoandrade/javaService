package ec.gob.mremh.poc.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;

import ec.gob.mremh.arquitectura.dto.PocDataPersonalDTO;
import ec.gob.mremh.poc.data.dao.IPersonalData;
import ec.gob.mremh.poc.data.entity.PocPersonalData;;

@Stateless
@LocalBean
public class DataPersonalLogica implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB(lookup = "java:global/mre-poc-data-0.0.1-SNAPSHOT/IPersonalDataImpl")
	IPersonalData personalData;



	public List<PocDataPersonalDTO> getResultList(String val) {

		List<PocPersonalData> listaPD = new ArrayList<>();
		List<PocDataPersonalDTO> lstRetorno = new ArrayList<>();

		try {
				listaPD = personalData.listarIdiomas();
				PocDataPersonalDTO aux;
				for (PocPersonalData pocDataPersonal : listaPD) {
					aux = new PocDataPersonalDTO();
					aux = convertToDto(pocDataPersonal);
					lstRetorno.add(aux);					
				}
				
		} catch (Exception e) {
			throw e;
		}
		
		return lstRetorno;
	}



	private PocDataPersonalDTO convertToDto(PocPersonalData usuario) {
		ModelMapper modelMapper = new ModelMapper();
		PocDataPersonalDTO postDto = modelMapper.map(usuario, PocDataPersonalDTO.class);
		return postDto;
	}



}
