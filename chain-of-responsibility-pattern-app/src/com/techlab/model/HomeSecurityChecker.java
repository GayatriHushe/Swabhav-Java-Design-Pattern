
package com.techlab.model;

public abstract class HomeSecurityChecker {
	private HomeSecurityChecker next;
	public void setNext(HomeSecurityChecker next) {
		this.next=next;
	}
	public abstract void check(HomeStatusDTO dto) throws Exception;
	protected void checkNext(HomeStatusDTO dto) throws Exception {
		if(next!=null) {
			next.check(dto);
		}
	}

}
