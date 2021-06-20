/**
 * ProductServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sud.webservices;

public class ProductServiceLocator extends org.apache.axis.client.Service implements sud.webservices.ProductService {

    public ProductServiceLocator() {
    }


    public ProductServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProductServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProductsManagerImplPort
    private java.lang.String ProductsManagerImplPort_address = "http://localhost:8081/";

    public java.lang.String getProductsManagerImplPortAddress() {
        return ProductsManagerImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProductsManagerImplPortWSDDServiceName = "ProductsManagerImplPort";

    public java.lang.String getProductsManagerImplPortWSDDServiceName() {
        return ProductsManagerImplPortWSDDServiceName;
    }

    public void setProductsManagerImplPortWSDDServiceName(java.lang.String name) {
        ProductsManagerImplPortWSDDServiceName = name;
    }

    public sud.webservices.ProductsManagerImpl getProductsManagerImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProductsManagerImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProductsManagerImplPort(endpoint);
    }

    public sud.webservices.ProductsManagerImpl getProductsManagerImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            sud.webservices.ProductsManagerImplPortBindingStub _stub = new sud.webservices.ProductsManagerImplPortBindingStub(portAddress, this);
            _stub.setPortName(getProductsManagerImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProductsManagerImplPortEndpointAddress(java.lang.String address) {
        ProductsManagerImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (sud.webservices.ProductsManagerImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                sud.webservices.ProductsManagerImplPortBindingStub _stub = new sud.webservices.ProductsManagerImplPortBindingStub(new java.net.URL(ProductsManagerImplPort_address), this);
                _stub.setPortName(getProductsManagerImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ProductsManagerImplPort".equals(inputPortName)) {
            return getProductsManagerImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.sud/", "ProductService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.sud/", "ProductsManagerImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProductsManagerImplPort".equals(portName)) {
            setProductsManagerImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
