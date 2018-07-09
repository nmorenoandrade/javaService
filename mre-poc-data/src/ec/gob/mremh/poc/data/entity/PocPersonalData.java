package ec.gob.mremh.poc.data.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the poc_personal_data database table.
 * 
 */
@Entity
@Table(name="poc_personal_data", schema = "interoperador")
@NamedQuery(name="PocPersonalData.findAll", query="SELECT p FROM PocPersonalData p")
public class PocPersonalData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="poc_personal_data_id")
	private Integer pocPersonalDataId;

	@Column(name="poc_age")
	private String pocAge;

	@Column(name="poc_description")
	private String pocDescription;

	@Column(name="poc_feelings")
	private String pocFeelings;

	@Column(name="poc_gender")
	private String pocGender;

	@Column(name="poc_marital_status")
	private String pocMaritalStatus;

	@Column(name="poc_names")
	private String pocNames;

	@Column(name="poc_nationality")
	private String pocNationality;

	@Column(name="poc_profession")
	private String pocProfession;

	public PocPersonalData() {
	}

	public Integer getPocPersonalDataId() {
		return this.pocPersonalDataId;
	}

	public void setPocPersonalDataId(Integer pocPersonalDataId) {
		this.pocPersonalDataId = pocPersonalDataId;
	}

	public String getPocAge() {
		return this.pocAge;
	}

	public void setPocAge(String pocAge) {
		this.pocAge = pocAge;
	}

	public String getPocDescription() {
		return this.pocDescription;
	}

	public void setPocDescription(String pocDescription) {
		this.pocDescription = pocDescription;
	}

	public String getPocFeelings() {
		return this.pocFeelings;
	}

	public void setPocFeelings(String pocFeelings) {
		this.pocFeelings = pocFeelings;
	}

	public String getPocGender() {
		return this.pocGender;
	}

	public void setPocGender(String pocGender) {
		this.pocGender = pocGender;
	}

	public String getPocMaritalStatus() {
		return this.pocMaritalStatus;
	}

	public void setPocMaritalStatus(String pocMaritalStatus) {
		this.pocMaritalStatus = pocMaritalStatus;
	}

	public String getPocNames() {
		return this.pocNames;
	}

	public void setPocNames(String pocNames) {
		this.pocNames = pocNames;
	}

	public String getPocNationality() {
		return this.pocNationality;
	}

	public void setPocNationality(String pocNationality) {
		this.pocNationality = pocNationality;
	}

	public String getPocProfession() {
		return this.pocProfession;
	}

	public void setPocProfession(String pocProfession) {
		this.pocProfession = pocProfession;
	}

}