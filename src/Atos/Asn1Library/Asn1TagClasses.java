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

public class Asn1TagClasses {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getCLASS_MASK() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1TagClasses").get("CLASS_MASK");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCLASS_MASK(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1TagClasses").set("CLASS_MASK", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getUNIVERSAL() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1TagClasses").get("UNIVERSAL");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUNIVERSAL(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1TagClasses").set("UNIVERSAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getCONSTRUCTED() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1TagClasses").get("CONSTRUCTED");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCONSTRUCTED(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1TagClasses").set("CONSTRUCTED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getAPPLICATION() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1TagClasses").get("APPLICATION");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAPPLICATION(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1TagClasses").set("APPLICATION", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getCONTEXT_SPECIFIC() {
    try {
      java.lang.Byte res =
          Javonet.getType("Atos.Asn1Library.Asn1TagClasses").get("CONTEXT_SPECIFIC");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCONTEXT_SPECIFIC(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1TagClasses").set("CONTEXT_SPECIFIC", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getPRIVATE() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1TagClasses").get("PRIVATE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPRIVATE(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1TagClasses").set("PRIVATE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Asn1TagClasses() {
    try {
      javonetHandle = Javonet.New("Atos.Asn1Library.Asn1TagClasses");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Asn1TagClasses(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
