package egovframework.com.cmm;

public enum EgovDomainType {
	
	/* 관광자원		*/	TOUR_RSRC		("tourRsrc",		"관광자원"),
	/* 관광자원 카테고리	*/	TOUR_RSRC_CTGRY	("tourrsrcctgry",	"관광자원구분"),
	/* 관광해설예약		*/	COTRY_RESV		("cotryResv",		"관광해설예약"),
	/* 시설대관예약		*/	FAC_RESV		("facResv",			"시설대관예약");
	
	private EgovDomainType(String id, String name) {
		this.id = id;
		this.name = name;
	}

	private String id;
	
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
