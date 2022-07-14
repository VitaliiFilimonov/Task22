//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.14 at 02:03:03 PM UTC 
//


package ru.homework;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.homework package. 
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

    private final static QName _Employees_QNAME = new QName("", "employees");
    private final static QName _Offices_QNAME = new QName("", "offices");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.homework
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Employees }
     * 
     */
    public Employees createEmployees() {
        return new Employees();
    }

    /**
     * Create an instance of {@link Offices }
     * 
     */
    public Offices createOffices() {
        return new Offices();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employees }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Employees }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "employees")
    public JAXBElement<Employees> createEmployees(Employees value) {
        return new JAXBElement<Employees>(_Employees_QNAME, Employees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Offices }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Offices }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "offices")
    public JAXBElement<Offices> createOffices(Offices value) {
        return new JAXBElement<Offices>(_Offices_QNAME, Offices.class, null, value);
    }

}
