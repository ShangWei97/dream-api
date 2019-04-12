package com.dreamfield.dreamapi.enums;

/**
 * @author: shangwei
 * @date: 2019-04-12 20:43
 */
public enum OrderStatusEnum {
	SEND_BOOK("已发货",1),
	RECEIVER_BOOK("已收货",2),
	COMPLETED("已完成",3);



	private String description;

	private Integer value;

	OrderStatusEnum(String description, Integer value) {
		this.description = description;
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public static String getDescription(Integer value){
		for (OrderStatusEnum orderStatusEnum : OrderStatusEnum.values()){
			if ( orderStatusEnum.getValue().equals(value)){
				return orderStatusEnum.getDescription();
			}
		}
		return null;
	}
}
