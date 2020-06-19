package org.zeroch.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

// Chef 클래스를 주입받음
@Component
@Data
public class Restaurant {

//	setter를 이용한 주입
	@Setter(onMethod_=@Autowired) 
	private Chef chef;
}
