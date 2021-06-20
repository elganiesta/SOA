/**
 * ProductsManagerImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sud.webservices;

public interface ProductsManagerImpl extends java.rmi.Remote {
    public void addProduct(sud.webservices.Product arg0) throws java.rmi.RemoteException;
    public sud.webservices.Product getProduct(long arg0) throws java.rmi.RemoteException, sud.webservices.NoSuchProductException;
    public double getProductPrice(long arg0) throws java.rmi.RemoteException, sud.webservices.NoSuchProductException;
    public sud.webservices.Product[] getProducts() throws java.rmi.RemoteException;
    public sud.webservices.Product updateProduct(sud.webservices.Product arg0) throws java.rmi.RemoteException;
    public boolean deleteProduct(long arg0) throws java.rmi.RemoteException;
    public boolean deleteAllProducts() throws java.rmi.RemoteException;
}
