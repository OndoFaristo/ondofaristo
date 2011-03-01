/*
 * Copyright (C) 2011 WaveMaker Software, Inc.
 *
 * This file is part of WaveMaker Enterprise.
 *  You may not use this file in any manner except through written agreement with WaveMaker Software, Inc.
 *
 */ 


package com.wavemaker.runtime.ws.salesforce.gen;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.5-b03-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "InvalidNewPasswordFault", targetNamespace = "urn:fault.partner.soap.sforce.com")
public class InvalidNewPasswordFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidNewPasswordFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InvalidNewPasswordFault_Exception(String message, InvalidNewPasswordFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param message
     * @param cause
     */
    public InvalidNewPasswordFault_Exception(String message, InvalidNewPasswordFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.wavemaker.runtime.ws.salesforce.gen.InvalidNewPasswordFault
     */
    public InvalidNewPasswordFault getFaultInfo() {
        return faultInfo;
    }

}
