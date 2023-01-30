package egovframework.let.cop.trl.service;

import java.util.List;

public interface TranslateService {
	
	Integer insertRecord(Translate translate) throws Exception;
	
	Translate selectRecord(Integer recordNo) throws Exception;
	
	List<Translate> selectRecordList() throws Exception;
	
	Translate updateRecord(Translate translate) throws Exception;
	
	void updateRecordList(List<Translate> translateList) throws Exception;
	
	boolean deleteRecord(Integer recordNo) throws Exception;
	
}
