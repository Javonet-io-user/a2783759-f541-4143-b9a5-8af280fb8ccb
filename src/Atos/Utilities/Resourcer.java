package Atos.Utilities;

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
import Atos.Utilities.*;
import jio.System.Globalization.*;
import jio.System.Reflection.*;
import jio.System.*;

public class Resourcer {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public static void setForceCultureOnNextCall(java.lang.String value) {
    try {
      Javonet.getType("Atos.Utilities.Resourcer").set("ForceCultureOnNextCall", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getForceCultureOnNextCall() {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.Resourcer").get("ForceCultureOnNextCall");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public Resourcer() {
    try {
      javonetHandle = Javonet.New("Atos.Utilities.Resourcer");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Resourcer(java.lang.String culture) {
    try {
      javonetHandle = Javonet.New("Atos.Utilities.Resourcer", culture);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Resourcer(jio.System.Type obj) {
    try {
      javonetHandle = Javonet.New("Atos.Utilities.Resourcer", obj);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Resourcer(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ChangeResourceManager(CultureInfo culture) {
    try {
      javonetHandle.invoke("ChangeResourceManager", culture);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ChangeResourceManager(CultureInfo culture, Assembly assembly) {
    try {
      javonetHandle.invoke("ChangeResourceManager", culture, assembly);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetString(java.lang.String code, java.lang.String defaultString) {
    try {
      java.lang.String res = javonetHandle.invoke("GetString", code, defaultString);
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
