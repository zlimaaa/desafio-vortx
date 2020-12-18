package br.com.vortx.vxtel.dtos;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDTO {

	public ResponseDTO(BigDecimal valueWithPlan, BigDecimal valueWithoutPlan) {
		this.valueWithPlan = valueWithPlan;
		this.valueWithoutPlan = valueWithoutPlan;
	}
	
	private BigDecimal valueWithPlan;
	private BigDecimal valueWithoutPlan;
}
