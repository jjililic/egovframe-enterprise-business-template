package egovframework.com.cmm;

public class EgovEntity extends EgovDomain {
	
	public EgovEntity() {
		super(null);
	}
	
	public EgovEntity(EgovDomainType egovDomainType) {
		super(egovDomainType);
	}
	
	private Integer entityNo;
	
	private String entityName;

	public Integer getEntityNo() {
		return entityNo;
	}

	public void setEntityNo(Integer entityNo) {
		this.entityNo = entityNo;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	
}
