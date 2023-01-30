package egovframework.let.cop.trl.service;

import egovframework.com.cmm.EgovDomainType;
import egovframework.com.cmm.EgovEntity;

public class Translate extends EgovEntity {

	public Translate() {
		super();
	}
	
	public Translate(EgovDomainType egovDomainType) {
		super(egovDomainType);
	}
	
	private String lang;

	private String item;
	
	private String translation;

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
}
