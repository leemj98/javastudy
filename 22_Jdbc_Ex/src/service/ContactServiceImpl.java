package service;

import java.util.Map;

import dao.ContactDao;
import dto.ContactDto;
//요청 순서 contactMain -> contactController -> ContactService -> ContactServiceImpl -> ContactDao -> DB

public class ContactServiceImpl implements ContactService {
// impl = 구현체라는 뜻
	
	// ContactDao는 싱글톤 패턴으로 작성되어있음
	private ContactDao contactDao = ContactDao.getDao();
	
	@Override
	public int insert(Map<String, Object> map) {
		// Map -> ContactDto
		ContactDto contactDto = new ContactDto();
		contactDto.setName((String)map.get("name")); //오브젝트로 저장되어 있기 때문에 캐스팅해서 사용
		contactDto.setTel((String)map.get("tel"));
		contactDto.setEmail((String)map.get("email"));
		contactDto.setAddress((String)map.get("address"));
		// 실행 + 결과반환
		return contactDao.insert(contactDto);
	}

	@Override
	public int update(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return 0;
	}

}
