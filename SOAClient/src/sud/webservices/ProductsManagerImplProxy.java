package sud.webservices;

public class ProductsManagerImplProxy implements sud.webservices.ProductsManagerImpl {
  private String _endpoint = null;
  private sud.webservices.ProductsManagerImpl productsManagerImpl = null;
  
  public ProductsManagerImplProxy() {
    _initProductsManagerImplProxy();
  }
  
  public ProductsManagerImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductsManagerImplProxy();
  }
  
  private void _initProductsManagerImplProxy() {
    try {
      productsManagerImpl = (new sud.webservices.ProductServiceLocator()).getProductsManagerImplPort();
      if (productsManagerImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)productsManagerImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)productsManagerImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (productsManagerImpl != null)
      ((javax.xml.rpc.Stub)productsManagerImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public sud.webservices.ProductsManagerImpl getProductsManagerImpl() {
    if (productsManagerImpl == null)
      _initProductsManagerImplProxy();
    return productsManagerImpl;
  }
  
  public void addProduct(sud.webservices.Product arg0) throws java.rmi.RemoteException{
    if (productsManagerImpl == null)
      _initProductsManagerImplProxy();
    productsManagerImpl.addProduct(arg0);
  }
  
  public sud.webservices.Product getProduct(long arg0) throws java.rmi.RemoteException, sud.webservices.NoSuchProductException{
    if (productsManagerImpl == null)
      _initProductsManagerImplProxy();
    return productsManagerImpl.getProduct(arg0);
  }
  
  public double getProductPrice(long arg0) throws java.rmi.RemoteException, sud.webservices.NoSuchProductException{
    if (productsManagerImpl == null)
      _initProductsManagerImplProxy();
    return productsManagerImpl.getProductPrice(arg0);
  }
  
  public sud.webservices.Product[] getProducts() throws java.rmi.RemoteException{
    if (productsManagerImpl == null)
      _initProductsManagerImplProxy();
    return productsManagerImpl.getProducts();
  }
  
  public sud.webservices.Product updateProduct(sud.webservices.Product arg0) throws java.rmi.RemoteException{
    if (productsManagerImpl == null)
      _initProductsManagerImplProxy();
    return productsManagerImpl.updateProduct(arg0);
  }
  
  public boolean deleteProduct(long arg0) throws java.rmi.RemoteException{
    if (productsManagerImpl == null)
      _initProductsManagerImplProxy();
    return productsManagerImpl.deleteProduct(arg0);
  }
  
  public boolean deleteAllProducts() throws java.rmi.RemoteException{
    if (productsManagerImpl == null)
      _initProductsManagerImplProxy();
    return productsManagerImpl.deleteAllProducts();
  }
  
  
}