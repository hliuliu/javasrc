package org.omg.PortableServer;


/**
* org/omg/PortableServer/ServantActivatorPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, May 7, 2014 12:49:09 PM PDT
*/


/**
	 * When the POA has the RETAIN policy it uses servant 
	 * managers that are ServantActivators. 
	 */
public abstract class ServantActivatorPOA extends org.omg.PortableServer.Servant
 implements org.omg.PortableServer.ServantActivatorOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("incarnate", new java.lang.Integer (0));
    _methods.put ("etherealize", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    throw new org.omg.CORBA.BAD_OPERATION();
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/PortableServer/ServantActivator:2.3", 
    "IDL:omg.org/PortableServer/ServantManager:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ServantActivator _this() 
  {
    return ServantActivatorHelper.narrow(
    super._this_object());
  }

  public ServantActivator _this(org.omg.CORBA.ORB orb) 
  {
    return ServantActivatorHelper.narrow(
    super._this_object(orb));
  }


} // class ServantActivatorPOA
