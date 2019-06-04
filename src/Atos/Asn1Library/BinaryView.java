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

public class BinaryView {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getOffsetWidth() {
    try {
      java.lang.Integer res = javonetHandle.get("OffsetWidth");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getDataWidth() {
    try {
      java.lang.Integer res = javonetHandle.get("DataWidth");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getTotalWidth() {
    try {
      java.lang.Integer res = javonetHandle.get("TotalWidth");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getHexWidth() {
    try {
      java.lang.Integer res = javonetHandle.get("HexWidth");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public BinaryView() {
    try {
      javonetHandle = Javonet.New("Atos.Asn1Library.BinaryView");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BinaryView(java.lang.Integer offsetWidth, java.lang.Integer dataWidth) {
    try {
      javonetHandle = Javonet.New("Atos.Asn1Library.BinaryView", offsetWidth, dataWidth);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BinaryView(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetPar(java.lang.Integer offsetWidth, java.lang.Integer dataWidth) {
    try {
      javonetHandle.invoke("SetPar", offsetWidth, dataWidth);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GenerateText(java.lang.Byte[] data) {
    try {
      java.lang.String res = javonetHandle.invoke("GenerateText", new Object[] {data});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetLocation(java.lang.Integer byteOffset, ByteLocation loc) {
    try {
      javonetHandle.invoke("GetLocation", byteOffset, loc);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetBinaryViewText(
      java.lang.Byte[] data, java.lang.Integer offsetWidth, java.lang.Integer dataWidth) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Asn1Library.BinaryView")
              .invoke("GetBinaryViewText", new Object[] {data}, offsetWidth, dataWidth);
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
