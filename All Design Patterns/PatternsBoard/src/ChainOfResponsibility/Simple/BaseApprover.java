/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibility.Simple;

/**
 *
 * @author Mukhtiar
 */
public abstract class BaseApprover implements Approver{
	protected Approver next = null;
	
	public void setNext(Approver next){
		this.next = next;
	}
}
