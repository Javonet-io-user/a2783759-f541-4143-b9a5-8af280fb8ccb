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

public class Asn1Parser {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setParseEncapsulatedData(java.lang.Boolean value) {
    try {
      javonetHandle.set("ParseEncapsulatedData", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getParseEncapsulatedData() {
    try {
      java.lang.Boolean res = javonetHandle.get("ParseEncapsulatedData");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte[] getRawData(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("RawData");
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Asn1Node getRootNode() {
    try {
      Object res = javonetHandle.<NObject>get("RootNode");
      if (res == null) return null;
      return new Asn1Node((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Asn1Parser() {
    try {
      javonetHandle = Javonet.New("Atos.Asn1Library.Asn1Parser");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Asn1Parser(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadData(java.lang.String fileName) {
    try {
      javonetHandle.invoke("LoadData", fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadPemData(java.lang.String fileName) {
    try {
      javonetHandle.invoke("LoadPemData", fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadData(Stream stream) {
    try {
      javonetHandle.invoke("LoadData", stream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadData(java.lang.Byte[] data) {
    try {
      javonetHandle.invoke("LoadData", new Object[] {data});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveData(java.lang.String fileName) {
    try {
      javonetHandle.invoke("SaveData", fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Asn1Node GetNodeByPath(java.lang.String nodePath) {
    try {
      Object res = javonetHandle.invoke("GetNodeByPath", nodePath);
      if (res == null) return null;
      return new Asn1Node((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Asn1Node GetNodeByOid(java.lang.String oid) {
    try {
      Object res = javonetHandle.invoke("GetNodeByOid", oid);
      if (res == null) return null;
      return new Asn1Node((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetNodeTextHeader(java.lang.Integer lineLen) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Asn1Library.Asn1Parser").invoke("GetNodeTextHeader", lineLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
  public static java.lang.String GetNodeText(Asn1Node node, java.lang.Integer lineLen) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Asn1Library.Asn1Parser").invoke("GetNodeText", node, lineLen);
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
