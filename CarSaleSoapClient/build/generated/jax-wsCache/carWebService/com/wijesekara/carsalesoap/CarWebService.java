
package com.wijesekara.carsalesoap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "carWebService", targetNamespace = "http://carsalesoap.wijesekara.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CarWebService {


    /**
     * 
     * @param year
     * @param model
     * @param brand
     * @return
     *     returns java.lang.String
     * @throws ClassNotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "carAvailability", targetNamespace = "http://carsalesoap.wijesekara.com/", className = "com.wijesekara.carsalesoap.CarAvailability")
    @ResponseWrapper(localName = "carAvailabilityResponse", targetNamespace = "http://carsalesoap.wijesekara.com/", className = "com.wijesekara.carsalesoap.CarAvailabilityResponse")
    @Action(input = "http://carsalesoap.wijesekara.com/carWebService/carAvailabilityRequest", output = "http://carsalesoap.wijesekara.com/carWebService/carAvailabilityResponse", fault = {
        @FaultAction(className = ClassNotFoundException_Exception.class, value = "http://carsalesoap.wijesekara.com/carWebService/carAvailability/Fault/ClassNotFoundException")
    })
    public String carAvailability(
        @WebParam(name = "brand", targetNamespace = "")
        String brand,
        @WebParam(name = "model", targetNamespace = "")
        String model,
        @WebParam(name = "year", targetNamespace = "")
        String year)
        throws ClassNotFoundException_Exception
    ;

}
