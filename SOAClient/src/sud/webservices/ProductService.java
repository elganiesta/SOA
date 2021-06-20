/**
 * ProductService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sud.webservices;

public interface ProductService extends javax.xml.rpc.Service {
    public java.lang.String getProductsManagerImplPortAddress();

    public sud.webservices.ProductsManagerImpl getProductsManagerImplPort() throws javax.xml.rpc.ServiceException;

    public sud.webservices.ProductsManagerImpl getProductsManagerImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
