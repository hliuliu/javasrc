package org.omg.IOP;


/**
* org/omg/IOP/MultipleComponentProfileHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Wednesday, May 7, 2014 12:49:10 PM PDT
*/


/** An array of tagged components, forming a multiple component profile. */
public final class MultipleComponentProfileHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.IOP.TaggedComponent value[] = null;

  public MultipleComponentProfileHolder ()
  {
  }

  public MultipleComponentProfileHolder (org.omg.IOP.TaggedComponent[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.IOP.MultipleComponentProfileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.IOP.MultipleComponentProfileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.IOP.MultipleComponentProfileHelper.type ();
  }

}
