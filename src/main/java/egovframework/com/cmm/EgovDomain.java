package egovframework.com.cmm;

public class EgovDomain {

	private String domainId;
	
	private String domainName;
	
	public EgovDomain(EgovDomainType egovDomainType) {
		this.domainId = egovDomainType.getId();
		this.domainName = egovDomainType.getName();
	}
	
	public EgovDomain(String id, String name) {
		super();
		this.domainId = id;
		this.domainName = name;
	}

	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

}
