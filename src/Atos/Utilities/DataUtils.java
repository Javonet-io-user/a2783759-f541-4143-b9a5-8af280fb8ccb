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

public abstract class DataUtils {
  protected NObject javonetHandle;

  public DataUtils(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> T[] SubArray(
      T[] source,
      java.lang.Integer index,
      java.lang.Integer length,
      Class<?> returnType,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Atos.Utilities.DataUtils")
              .generic(getGetObjectName(source), getReturnObjectName(returnType))
              .invoke("SubArray", new Object[] {source}, index, length);
      if (res == null) return null;
      return (T[]) JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String CreateRandomPassword(
      java.lang.Integer size, java.lang.String allowedChars) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.DataUtils")
              .invoke("CreateRandomPassword", size, allowedChars);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DateTime CreateRandomDate(DateTime min, DateTime max) {
    try {
      Object res = Javonet.getType("Atos.Utilities.DataUtils").invoke("CreateRandomDate", min, max);
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] IsBase64(java.lang.Byte[] document, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Atos.Utilities.DataUtils").invoke("IsBase64", new Object[] {document});
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
  public static java.lang.String CreateRandomNameVAsString(
      java.lang.Integer maxLength, Case caseSensitiveness) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.DataUtils")
              .invoke(
                  "CreateRandomNameVAsString", maxLength, NEnum.fromJavaEnum(caseSensitiveness));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String CreateRandomNameCAsString(
      java.lang.Integer length, Case caseSensitiveness) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.DataUtils")
              .invoke("CreateRandomNameCAsString", length, NEnum.fromJavaEnum(caseSensitiveness));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer CreateRandomNumber(java.lang.Integer max) {
    try {
      java.lang.Integer res =
          Javonet.getType("Atos.Utilities.DataUtils").invoke("CreateRandomNumber", max);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] CreateRandomNameV(
      java.lang.Integer maxLength, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Atos.Utilities.DataUtils").invoke("CreateRandomNameV", maxLength);
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
  public static java.lang.Byte[] CreateRandomNameC(
      java.lang.Integer length, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Atos.Utilities.DataUtils").invoke("CreateRandomNameC", length);
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
  public static java.lang.Byte[] GetFileBytes(java.lang.String filename, Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("Atos.Utilities.DataUtils").invoke("GetFileBytes", filename);
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
  public static void PutFileBytes(
      java.lang.String outfile, java.lang.Byte[] data, java.lang.Integer bytes) {
    try {
      Javonet.getType("Atos.Utilities.DataUtils")
          .invoke("PutFileBytes", outfile, new Object[] {data}, bytes);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void PutFileBytes(java.lang.String outfile, java.lang.Byte[] data) {
    try {
      Javonet.getType("Atos.Utilities.DataUtils")
          .invoke("PutFileBytes", outfile, new Object[] {data});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ClearIsolatedStorage() {
    try {
      Javonet.getType("Atos.Utilities.DataUtils").invoke("ClearIsolatedStorage");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] GetIsolatedFileBytes(
      java.lang.String fileName, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Atos.Utilities.DataUtils").invoke("GetIsolatedFileBytes", fileName);
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
  public static void PutIsolatedFileBytes(java.lang.String fileName, java.lang.Byte[] data) {
    try {
      Javonet.getType("Atos.Utilities.DataUtils")
          .invoke("PutIsolatedFileBytes", fileName, new Object[] {data});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean CompareBytes(java.lang.Byte[] b1, java.lang.Byte[] b2) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Atos.Utilities.DataUtils")
              .invoke("CompareBytes", new Object[] {b1}, new Object[] {b2});
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer IndexOf(
      java.lang.Byte[] arrayToSearchThrough, java.lang.Byte[] patternToFind) {
    try {
      java.lang.Integer res =
          Javonet.getType("Atos.Utilities.DataUtils")
              .invoke("IndexOf", new Object[] {arrayToSearchThrough}, new Object[] {patternToFind});
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void SaveStringToFile(java.lang.String smail, java.lang.String filename) {
    try {
      Javonet.getType("Atos.Utilities.DataUtils").invoke("SaveStringToFile", smail, filename);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String LoadStringFromFile(java.lang.String filename) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.DataUtils").invoke("LoadStringFromFile", filename);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] InsertPadding(
      java.lang.Byte[] digest, java.lang.Integer length, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Atos.Utilities.DataUtils")
              .invoke("InsertPadding", new Object[] {digest}, length);
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
  public static java.lang.String CreateRandomPin(java.lang.Integer length) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.DataUtils").invoke("CreateRandomPin", length);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] GetRandomBytes(
      java.lang.Integer length, Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("Atos.Utilities.DataUtils").invoke("GetRandomBytes", length);
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
  public static java.lang.Byte[] Combine(
      java.lang.Byte[] first, java.lang.Byte[] second, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Atos.Utilities.DataUtils")
              .invoke("Combine", new Object[] {first}, new Object[] {second});
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
  public static java.lang.String GetMimeType(java.lang.Byte[] content) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.DataUtils").invoke("GetMimeType", new Object[] {content});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetCodeForString(java.lang.String message) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.DataUtils").invoke("GetCodeForString", message);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetMimeType(java.lang.String filename) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.DataUtils").invoke("GetMimeType", filename);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String DecryptIfSecret(java.lang.String text) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.DataUtils").invoke("DecryptIfSecret", text);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] DecryptSecret(java.lang.Byte[] data, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Atos.Utilities.DataUtils").invoke("DecryptSecret", new Object[] {data});
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
  public static java.lang.Boolean ValidateLuhn(java.lang.String data) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Atos.Utilities.DataUtils").invoke("ValidateLuhn", data);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetLuhnCheckDigit(java.lang.String data) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.DataUtils").invoke("GetLuhnCheckDigit", data);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] InitilizeArrayBytes(
      java.lang.Byte[] input, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Atos.Utilities.DataUtils")
              .invoke("InitilizeArrayBytes", new Object[] {input});
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
  public static java.lang.String AddZerosToString(
      java.lang.String input, java.lang.Integer finalLength, java.lang.Boolean inFrontOf) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.DataUtils")
              .invoke("AddZerosToString", input, finalLength, inFrontOf);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String AddEmptyToString(
      java.lang.String input, java.lang.Integer finalLength, java.lang.Boolean inFrontOf) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.DataUtils")
              .invoke("AddEmptyToString", input, finalLength, inFrontOf);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] AddZerosToByte(
      java.lang.Byte[] input,
      java.lang.Integer finalLength,
      java.lang.Boolean inFrontOf,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Atos.Utilities.DataUtils")
              .invoke("AddZerosToByte", new Object[] {input}, finalLength, inFrontOf);
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
  public static DateTime CalculateExpirationDateItalianEdoc(
      DateTime dataNascita, java.lang.Integer eDocValidityInYears) {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.DataUtils")
              .invoke("CalculateExpirationDateItalianEdoc", dataNascita, eDocValidityInYears);
      if (res == null) return null;
      return new DateTime((NObject) res);
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
