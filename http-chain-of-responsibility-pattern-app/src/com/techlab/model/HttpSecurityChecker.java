
package com.techlab.model;

public abstract class HttpSecurityChecker {
	private HttpSecurityChecker next;
	public void setNext(HttpSecurityChecker next) {
		this.next=next;
	}
	public abstract void check(HttpRequestDTO dto) throws Exception;
	protected void checkNext(HttpRequestDTO dto) throws Exception {
		if(next!=null) {
			next.check(dto);
		}
	}

}
