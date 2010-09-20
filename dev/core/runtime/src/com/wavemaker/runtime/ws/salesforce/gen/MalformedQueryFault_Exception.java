
package com.wavemaker.runtime.ws.salesforce.gen;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.5-b03-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "MalformedQueryFault", targetNamespace = "urn:fault.partner.soap.sforce.com")
public class MalformedQueryFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private MalformedQueryFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public MalformedQueryFault_Exception(String message, MalformedQueryFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param message
     * @param cause
     */
    public MalformedQueryFault_Exception(String message, MalformedQueryFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.wavemaker.runtime.ws.salesforce.gen.MalformedQueryFault
     */
    public MalformedQueryFault getFaultInfo() {
        return faultInfo;
    }

}
