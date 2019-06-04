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
import jio.System.*;
import jio.System.Collections.Generic.*;

public abstract class ConversionUtils {
  protected NObject javonetHandle;

  public ConversionUtils(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] ConvertToSByte(java.lang.Byte[] array, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Atos.Utilities.ConversionUtils")
              .invoke("ConvertToSByte", new Object[] {array});
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
  public static java.lang.String ConvertBytesToPrettyString(
      java.lang.Byte[] data,
      java.lang.Integer rowElements,
      java.lang.Integer groupSeparator,
      java.lang.Integer newLineSpaceNumber) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.ConversionUtils")
              .invoke(
                  "ConvertBytesToPrettyString",
                  new Object[] {data},
                  rowElements,
                  groupSeparator,
                  newLineSpaceNumber);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] ConvertFromPem(java.lang.String pem, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Atos.Utilities.ConversionUtils").invoke("ConvertFromPem", pem);
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
  public static java.lang.String ConvertToPem(java.lang.Byte[] der, java.lang.String type) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.ConversionUtils")
              .invoke("ConvertToPem", new Object[] {der}, type);
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
      Object[] res = Javonet.getType("Atos.Utilities.ConversionUtils").invoke("StringToBytes", msg);
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
  public static DateTime GetCRLValidity(java.lang.Byte[] crl) {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.ConversionUtils")
              .invoke("GetCRLValidity", new Object[] {crl});
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] GetBMPString(java.lang.String datas, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Atos.Utilities.ConversionUtils").invoke("GetBMPString", datas);
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
  public static java.lang.Byte[] GetUTF8String(java.lang.String datas, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Atos.Utilities.ConversionUtils").invoke("GetUTF8String", datas);
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
  public static java.lang.String ConvertDataToString(java.lang.Byte[] data) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.ConversionUtils")
              .invoke("ConvertDataToString", new Object[] {data});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] ConvertStringToData(
      java.lang.String datastring, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Atos.Utilities.ConversionUtils")
              .invoke("ConvertStringToData", datastring);
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
  public static java.lang.Byte[] ConvertStringToByte(
      java.lang.String datastring, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Atos.Utilities.ConversionUtils")
              .invoke("ConvertStringToByte", datastring);
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
  public static java.lang.String ConvertStringToHex(java.lang.String asciiString) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.ConversionUtils")
              .invoke("ConvertStringToHex", asciiString);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ConvertHexToString(java.lang.String HexValue) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.ConversionUtils").invoke("ConvertHexToString", HexValue);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] ConvertLongToData(java.lang.Long ll, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Atos.Utilities.ConversionUtils").invoke("ConvertLongToData", ll);
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
  public static java.lang.Byte[] ConvertDateTimeToUTCbytes(
      DateTime date, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Atos.Utilities.ConversionUtils")
              .invoke("ConvertDateTimeToUTCbytes", date);
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
  public static DateTime ConvertUTCbytesToDateTime(java.lang.Byte[] datebyte) {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.ConversionUtils")
              .invoke("ConvertUTCbytesToDateTime", new Object[] {datebyte});
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DateTime ConvertGTData(java.lang.Byte[] data) {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.ConversionUtils")
              .invoke("ConvertGTData", new Object[] {data});
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DateTime ConvertGTData(java.lang.String Data) {
    try {
      Object res = Javonet.getType("Atos.Utilities.ConversionUtils").invoke("ConvertGTData", Data);
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DateTime ConvertUTCData(java.lang.String Data) {
    try {
      Object res = Javonet.getType("Atos.Utilities.ConversionUtils").invoke("ConvertUTCData", Data);
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String EncodeToUTF8(
      java.lang.String source, java.lang.Boolean limitedLine, java.lang.Integer maxLineLength) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.ConversionUtils")
              .invoke("EncodeToUTF8", source, limitedLine, maxLineLength);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String DecodeFromUTF8(java.lang.String source) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.ConversionUtils").invoke("DecodeFromUTF8", source);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static List<java.lang.Integer> ParseRanges(
      java.lang.String ranges,
      java.lang.Boolean isDuplicateAllowed,
      java.lang.Boolean isReorderRequired) {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.ConversionUtils")
              .invoke("ParseRanges", ranges, isDuplicateAllowed, isReorderRequired);
      if (res == null) return null;
      return new List<java.lang.Integer>((NObject) res);
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
