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

public class Asn1ClipboardData {
  protected NObject javonetHandle;

  public Asn1ClipboardData() {
    try {
      javonetHandle = Javonet.New("Atos.Asn1Library.Asn1ClipboardData");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Asn1ClipboardData(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Copy(Asn1Node node) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1ClipboardData").invoke("Copy", node);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Asn1Node Paste() {
    try {
      Object res = Javonet.getType("Atos.Asn1Library.Asn1ClipboardData").invoke("Paste");
      if (res == null) return null;
      return new Asn1Node((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsDataReady() {
    try {
      java.lang.Boolean res =
          Javonet.getType("Atos.Asn1Library.Asn1ClipboardData").invoke("IsDataReady");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
