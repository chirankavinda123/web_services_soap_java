
package com.wijesekara.carsalesoap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wijesekara.carsalesoap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ClassNotFoundException_QNAME = new QName("http://carsalesoap.wijesekara.com/", "ClassNotFoundException");
    private final static QName _CarAvailabilityResponse_QNAME = new QName("http://carsalesoap.wijesekara.com/", "carAvailabilityResponse");
    private final static QName _CarAvailability_QNAME = new QName("http://carsalesoap.wijesekara.com/", "carAvailability");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wijesekara.carsalesoap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CarAvailability }
     * 
     */
    public CarAvailability createCarAvailability() {
        return new CarAvailability();
    }

    /**
     * Create an instance of {@link CarAvailabilityResponse }
     * 
     */
    public CarAvailabilityResponse createCarAvailabilityResponse() {
        return new CarAvailabilityResponse();
    }

    /**
     * Create an instance of {@link ClassNotFoundException }
     * 
     */
    public ClassNotFoundException createClassNotFoundException() {
        return new ClassNotFoundException();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://carsalesoap.wijesekara.com/", name = "ClassNotFoundException")
    public JAXBElement<ClassNotFoundException> createClassNotFoundException(ClassNotFoundException value) {
        return new JAXBElement<ClassNotFoundException>(_ClassNotFoundException_QNAME, ClassNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarAvailabilityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://carsalesoap.wijesekara.com/", name = "carAvailabilityResponse")
    public JAXBElement<CarAvailabilityResponse> createCarAvailabilityResponse(CarAvailabilityResponse value) {
        return new JAXBElement<CarAvailabilityResponse>(_CarAvailabilityResponse_QNAME, CarAvailabilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarAvailability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://carsalesoap.wijesekara.com/", name = "carAvailability")
    public JAXBElement<CarAvailability> createCarAvailability(CarAvailability value) {
        return new JAXBElement<CarAvailability>(_CarAvailability_QNAME, CarAvailability.class, null, value);
    }

}
