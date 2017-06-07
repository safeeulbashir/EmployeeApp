package com.safee.employeeMainAppMvn;

public enum OPTIONS {
	FIND(1),EXIT(2);
	private Integer value;
	OPTIONS(Integer val)
	{
		this.value=val;
	}
	static OPTIONS valueOf(Integer number) {

		for (OPTIONS opt : OPTIONS.values()) {
			if (opt.value == number) {
				return opt;
			}
		}
		return null;
	}
}
