package Atos.Asn1Library;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import Atos.Asn1Library.*;
import jio.System.IO.*;

public class Oid {
  protected NObject javonetHandle;

  public Oid() {
    try {
      javonetHandle = Javonet.New("Atos.Asn1Library.Oid");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Oid(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetOidName(java.lang.String inOidStr) {
    try {
      java.lang.String res = javonetHandle.invoke("GetOidName", inOidStr);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte[] Encode(java.lang.String oidStr, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("Encode", oidStr);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] EncodeStatic(java.lang.String oidStr, Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("Atos.Asn1Library.Oid").invoke("EncodeStatic", oidStr);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String Decode(java.lang.Byte[] data) {
    try {
      java.lang.String res = javonetHandle.invoke("Decode", new Object[] {data});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String DecodeStatic(java.lang.Byte[] data) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Asn1Library.Oid").invoke("DecodeStatic", new Object[] {data});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Encode(Stream bt, java.lang.String oidStr) {
    try {
      javonetHandle.invoke("Encode", bt, oidStr);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void EncodeStatic(Stream bt, java.lang.String oidStr) {
    try {
      Javonet.getType("Atos.Asn1Library.Oid").invoke("EncodeStatic", bt, oidStr);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String Decode(Stream bt) {
    try {
      java.lang.String res = javonetHandle.invoke("Decode", bt);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String DecodeStatic(Stream bt) {
    try {
      java.lang.String res = Javonet.getType("Atos.Asn1Library.Oid").invoke("DecodeStatic", bt);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
