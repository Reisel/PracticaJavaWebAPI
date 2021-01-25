
package com.invertir;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.invertir package. 
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

    private final static QName _NombreInexistenteException_QNAME = new QName("http://invertir.com/", "NombreInexistenteException");
    private final static QName _ObtenerCotizacionesResponse_QNAME = new QName("http://invertir.com/", "obtenerCotizacionesResponse");
    private final static QName _Hola_QNAME = new QName("http://invertir.com/", "Hola");
    private final static QName _ProvocarErrorResponse_QNAME = new QName("http://invertir.com/", "provocarErrorResponse");
    private final static QName _ProvocarError_QNAME = new QName("http://invertir.com/", "provocarError");
    private final static QName _HolaResponse_QNAME = new QName("http://invertir.com/", "HolaResponse");
    private final static QName _ObtenerCotizaciones_QNAME = new QName("http://invertir.com/", "obtenerCotizaciones");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.invertir
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProvocarErrorResponse }
     * 
     */
    public ProvocarErrorResponse createProvocarErrorResponse() {
        return new ProvocarErrorResponse();
    }

    /**
     * Create an instance of {@link ProvocarError }
     * 
     */
    public ProvocarError createProvocarError() {
        return new ProvocarError();
    }

    /**
     * Create an instance of {@link ObtenerCotizaciones }
     * 
     */
    public ObtenerCotizaciones createObtenerCotizaciones() {
        return new ObtenerCotizaciones();
    }

    /**
     * Create an instance of {@link HolaResponse }
     * 
     */
    public HolaResponse createHolaResponse() {
        return new HolaResponse();
    }

    /**
     * Create an instance of {@link DetalleError }
     * 
     */
    public DetalleError createDetalleError() {
        return new DetalleError();
    }

    /**
     * Create an instance of {@link ObtenerCotizacionesResponse }
     * 
     */
    public ObtenerCotizacionesResponse createObtenerCotizacionesResponse() {
        return new ObtenerCotizacionesResponse();
    }

    /**
     * Create an instance of {@link Hola }
     * 
     */
    public Hola createHola() {
        return new Hola();
    }

    /**
     * Create an instance of {@link Cotizacion }
     * 
     */
    public Cotizacion createCotizacion() {
        return new Cotizacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invertir.com/", name = "NombreInexistenteException")
    public JAXBElement<DetalleError> createNombreInexistenteException(DetalleError value) {
        return new JAXBElement<DetalleError>(_NombreInexistenteException_QNAME, DetalleError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCotizacionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invertir.com/", name = "obtenerCotizacionesResponse")
    public JAXBElement<ObtenerCotizacionesResponse> createObtenerCotizacionesResponse(ObtenerCotizacionesResponse value) {
        return new JAXBElement<ObtenerCotizacionesResponse>(_ObtenerCotizacionesResponse_QNAME, ObtenerCotizacionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hola }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invertir.com/", name = "Hola")
    public JAXBElement<Hola> createHola(Hola value) {
        return new JAXBElement<Hola>(_Hola_QNAME, Hola.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvocarErrorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invertir.com/", name = "provocarErrorResponse")
    public JAXBElement<ProvocarErrorResponse> createProvocarErrorResponse(ProvocarErrorResponse value) {
        return new JAXBElement<ProvocarErrorResponse>(_ProvocarErrorResponse_QNAME, ProvocarErrorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvocarError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invertir.com/", name = "provocarError")
    public JAXBElement<ProvocarError> createProvocarError(ProvocarError value) {
        return new JAXBElement<ProvocarError>(_ProvocarError_QNAME, ProvocarError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HolaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invertir.com/", name = "HolaResponse")
    public JAXBElement<HolaResponse> createHolaResponse(HolaResponse value) {
        return new JAXBElement<HolaResponse>(_HolaResponse_QNAME, HolaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCotizaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invertir.com/", name = "obtenerCotizaciones")
    public JAXBElement<ObtenerCotizaciones> createObtenerCotizaciones(ObtenerCotizaciones value) {
        return new JAXBElement<ObtenerCotizaciones>(_ObtenerCotizaciones_QNAME, ObtenerCotizaciones.class, null, value);
    }

}
