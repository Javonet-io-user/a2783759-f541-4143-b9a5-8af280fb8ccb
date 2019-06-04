package Atos.Utilities.DNParser;

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
import Atos.Utilities.DNParser.*;
import jio.System.*;

public class Dn {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setCharsToEscape(EscapeChars value) {
    try {
      javonetHandle.set("CharsToEscape", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public EscapeChars getCharsToEscape() {
    try {
      Object res = javonetHandle.<NEnum>get("CharsToEscape");
      if (res == null) return null;
      return EscapeChars.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public RdnList getRDNs() {
    try {
      Object res = javonetHandle.<NObject>get("RDNs");
      if (res == null) return null;
      return new RdnList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Dn getParent() {
    try {
      Object res = javonetHandle.<NObject>get("Parent");
      if (res == null) return null;
      return new Dn((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultEscapeChars(EscapeChars value) {
    try {
      Javonet.getType("Atos.Utilities.DNParser.Dn")
          .set("DefaultEscapeChars", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static EscapeChars getDefaultEscapeChars() {
    try {
      Object res = Javonet.getType("Atos.Utilities.DNParser.Dn").<NEnum>get("DefaultEscapeChars");
      if (res == null) return null;
      return EscapeChars.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Dn(java.lang.String dnString) {
    try {
      javonetHandle = Javonet.New("Atos.Utilities.DNParser.Dn", dnString);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Dn(java.lang.String dnString, EscapeChars escapeChars) {
    try {
      javonetHandle =
          Javonet.New("Atos.Utilities.DNParser.Dn", dnString, NEnum.fromJavaEnum(escapeChars));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Dn(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Equals(Object obj) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Equals", obj);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetHashCode() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetHashCode");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString(EscapeChars escapeChars) {
    try {
      java.lang.String res = javonetHandle.invoke("ToString", NEnum.fromJavaEnum(escapeChars));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Contains(Dn childDn) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Contains", childDn);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Dn GetChild(java.lang.String childRDN) {
    try {
      Object res = javonetHandle.invoke("GetChild", childRDN);
      if (res == null) return null;
      return new Dn((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
