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
import jio.System.*;

public class Asn1Util {
  protected NObject javonetHandle;

  public Asn1Util(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsAsn1EncodedHexStr(java.lang.String dataStr) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("IsAsn1EncodedHexStr", dataStr);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String FormatString(
      java.lang.String inStr, java.lang.Integer lineLen, java.lang.Integer groupLen) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Asn1Library.Asn1Util")
              .invoke("FormatString", inStr, lineLen, groupLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GenStr(java.lang.Integer len, java.lang.Character xch) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("GenStr", len, xch);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long BytesToLong(java.lang.Byte[] bytes) {
    try {
      java.lang.Long res =
          Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("BytesToLong", new Object[] {bytes});
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String BytesToString(java.lang.Byte[] bytes) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Asn1Library.Asn1Util")
              .invoke("BytesToString", new Object[] {bytes});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] StringToBytes(java.lang.String msg, Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("StringToBytes", msg);
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
  public static java.lang.Boolean IsEqual(java.lang.Byte[] source, java.lang.Byte[] target) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Atos.Asn1Library.Asn1Util")
              .invoke("IsEqual", new Object[] {source}, new Object[] {target});
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToHexString(java.lang.Byte[] bytes) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("ToHexString", new Object[] {bytes});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsValidHexDigits(java.lang.Character ch) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("IsValidHexDigits", ch);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte GetHexDigitsVal(java.lang.Character ch) {
    try {
      java.lang.Byte res =
          Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("GetHexDigitsVal", ch);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] HexStrToBytes(java.lang.String hexStr, Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("HexStrToBytes", hexStr);
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
  public static java.lang.Boolean IsHexStr(java.lang.String hexStr) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("IsHexStr", hexStr);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsPemFormated(java.lang.String pemStr) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("IsPemFormated", pemStr);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsPemFormatedFile(java.lang.String fileName) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("IsPemFormatedFile", fileName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Stream PemToStream(java.lang.String pemStr) {
    try {
      Object res = Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("PemToStream", pemStr);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] PemToBytes(java.lang.String pemStr, Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("PemToBytes", pemStr);
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
  public static java.lang.String BytesToPem(java.lang.Byte[] data) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("BytesToPem", new Object[] {data});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetPemFileHeader(java.lang.String fileName) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("GetPemFileHeader", fileName);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetPemHeader(java.lang.String pemStr) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("GetPemHeader", pemStr);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String BytesToPem(java.lang.Byte[] data, java.lang.String pemHeader) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Asn1Library.Asn1Util")
              .invoke("BytesToPem", new Object[] {data}, pemHeader);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer BitPrecision(java.math.BigInteger ivalue) {
    try {
      java.lang.Integer res =
          Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("BitPrecision", ivalue);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer BytePrecision(java.math.BigInteger value) {
    try {
      java.lang.Integer res =
          Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("BytePrecision", value);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer DERLengthEncode(
      Stream xdata, java.math.BigInteger length, java.lang.Boolean isIndefiniteLength) {
    try {
      java.lang.Integer res =
          Javonet.getType("Atos.Asn1Library.Asn1Util")
              .invoke("DERLengthEncode", xdata, length, isIndefiniteLength);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long DerLengthDecode(
      Stream bt, AtomicReference<java.lang.Boolean> isIndefiniteLength) {
    try {
      java.lang.Long res =
          Javonet.getType("Atos.Asn1Library.Asn1Util")
              .invoke("DerLengthDecode", bt, new NRef(isIndefiniteLength));
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetTagName(java.lang.Byte tag) {
    try {
      java.lang.String res = Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("GetTagName", tag);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object ReadRegInfo(java.lang.String path, java.lang.String name) {
    try {
      Object res = Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("ReadRegInfo", path, name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void WriteRegInfo(java.lang.String path, java.lang.String name, Object data) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("WriteRegInfo", path, name, data);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Asn1Node FindChildNodeByTag(
      Asn1Node node, java.lang.Byte tag, java.lang.Integer firstNode) {
    try {
      Object res =
          Javonet.getType("Atos.Asn1Library.Asn1Util")
              .invoke("FindChildNodeByTag", node, tag, firstNode);
      if (res == null) return null;
      return new Asn1Node((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Asn1Node FindChildNodeByOID(
      Asn1Node node,
      java.lang.String OIDString,
      java.lang.Integer firstNode,
      java.lang.String path) {
    try {
      Object res =
          Javonet.getType("Atos.Asn1Library.Asn1Util")
              .invoke("FindChildNodeByOID", node, OIDString, firstNode, path);
      if (res == null) return null;
      return new Asn1Node((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Asn1Node GetAsn1NodeTypebyPath(
      Asn1Node Parent,
      java.lang.String paths,
      java.lang.String types,
      AtomicReference<java.lang.String> rtype,
      AtomicReference<java.lang.String> rpath) {
    try {
      Object res =
          Javonet.getType("Atos.Asn1Library.Asn1Util")
              .invoke(
                  "GetAsn1NodeTypebyPath", Parent, paths, types, new NRef(rtype), new NRef(rpath));
      if (res == null) return null;
      return new Asn1Node((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Asn1Node GetAsn1NodebyPath(Asn1Node Parent, java.lang.String path) {
    try {
      Object res =
          Javonet.getType("Atos.Asn1Library.Asn1Util").invoke("GetAsn1NodebyPath", Parent, path);
      if (res == null) return null;
      return new Asn1Node((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String FormatString(
      java.lang.Byte[] Signature, java.lang.Integer lineLen, java.lang.Integer groupLen) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Asn1Library.Asn1Util")
              .invoke("FormatString", new Object[] {Signature}, lineLen, groupLen);
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
