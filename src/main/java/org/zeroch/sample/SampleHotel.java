package org.zeroch.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Component
@ToString
@Getter
@AllArgsConstructor
public class SampleHotel {
// 	생성자를 이용한 주입
	private Chef chef;
	
//	public SampleHotel(Chef chef) {
//		this.chef = chef;
//	}
}
