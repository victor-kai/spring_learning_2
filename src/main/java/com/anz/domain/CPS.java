package com.anz.domain;

import javax.persistence.*;

@Entity
@Table(name = "prdm_cps")
public class CPS {

	@Id
	@Column(name = "cps_id")
	private long cpsId;

	@Column(name = "collection_id")
	private long collectionId;

	@Column(name = "delivery_method_code")
	private long deliveryMethodCode;

	@Column(name = "delivery_method_name")
	private String deliveryMethodName;

	@Column(name = "ps_schedule_code")
	private long psScheduleCode;

	@Column(name = "cps_file_name_reg_expre")
	private String cpsFileNameRegExpre;

	@Column(name = "configuration_version_code")
	private long configurationVersionId;

	public long getCpsId() {
		return cpsId;
	}

	public void setCpsId(long cpsId) {
		this.cpsId = cpsId;
	}

	public long getCollectionId() {
		return collectionId;
	}

	public void setCollectionId(long collectionId) {
		this.collectionId = collectionId;
	}

	public long getDeliveryMethodCode() {
		return deliveryMethodCode;
	}

	public void setDeliveryMethodCode(long deliveryMethodCode) {
		this.deliveryMethodCode = deliveryMethodCode;
	}

	public String getDeliveryMethodName() {
		return deliveryMethodName;
	}

	public void setDeliveryMethodName(String deliveryMethodName) {
		this.deliveryMethodName = deliveryMethodName;
	}

	public long getPsScheduleCode() {
		return psScheduleCode;
	}

	public void setPsScheduleCode(long psScheduleCode) {
		this.psScheduleCode = psScheduleCode;
	}

	public String getCpsFileNameRegExpre() {
		return cpsFileNameRegExpre;
	}

	public void setCpsFileNameRegExpre(String cpsFileNameRegExpre) {
		this.cpsFileNameRegExpre = cpsFileNameRegExpre;
	}

	public long getConfigurationVersionId() {
		return configurationVersionId;
	}

	public void setConfigurationVersionId(long configurationVersionId) {
		this.configurationVersionId = configurationVersionId;
	}

}
