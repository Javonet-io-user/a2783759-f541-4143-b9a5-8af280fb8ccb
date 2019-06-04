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
import jio.System.Xml.*;
import jio.System.*;
import jio.System.Collections.*;
import jio.System.Xml.Xsl.*;

public abstract class XmlUtils {
  protected NObject javonetHandle;

  public XmlUtils(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object DeserializeObject(XmlDocument stream, jio.System.Type type) {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.XmlUtils").invoke("DeserializeObject", stream, type);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static XmlDocument SerializeObject(Object objectToSerialize, jio.System.Type type) {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.XmlUtils")
              .invoke("SerializeObject", objectToSerialize, type);
      if (res == null) return null;
      return new XmlDocument((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String CreateXmlString(
      Hashtable ht,
      java.lang.String types,
      java.lang.String type,
      java.lang.Boolean insertXmlDecl) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.XmlUtils")
              .invoke("CreateXmlString", ht, types, type, insertXmlDecl);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String CreateParametersXmlString(Hashtable ht) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.XmlUtils").invoke("CreateParametersXmlString", ht);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String CreateFieldsList(Hashtable ht) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.XmlUtils").invoke("CreateFieldsList", ht);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Hashtable CreateParametersHashtable(java.lang.String xmlParams) {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.XmlUtils").invoke("CreateParametersHashtable", xmlParams);
      if (res == null) return null;
      return new Hashtable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Hashtable CreateHashtable(java.lang.String field, java.lang.String xmlParams) {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.XmlUtils").invoke("CreateHashtable", field, xmlParams);
      if (res == null) return null;
      return new Hashtable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ApplyXSL(
      java.lang.String xmlContent, java.lang.String xslFilePath, XsltArgumentList xslArgs) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.XmlUtils")
              .invoke("ApplyXSL", xmlContent, xslFilePath, xslArgs);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ApplyXSLtoXMLfile(
      java.lang.String XMLContent, java.lang.String XSLFilePath) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.XmlUtils")
              .invoke("ApplyXSLtoXMLfile", XMLContent, XSLFilePath);
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
