package org.zeroch.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("SELECT sysdate FROM dual")
	public String getTime();
	
	// SQL 구문이 복잡해질 수록 어노테이션 옆에 쓰기 부담스러우므로, 
	// 따로 xml파일을 만들어서 작성 후, 메서드에 연결시킨다.
	// 파일은 resources에 package와 같은 폴더에 위치시킨다.
	public String getTime2();
}
