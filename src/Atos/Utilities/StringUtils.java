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
import jio.System.Collections.*;
import jio.System.Collections.Generic.*;

public abstract class StringUtils {
  protected NObject javonetHandle;

  public StringUtils(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Hashtable ParseCommonName(java.lang.String cnString) {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.StringUtils").invoke("ParseCommonName", cnString);
      if (res == null) return null;
      return new Hashtable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String Summarize(java.lang.String text, java.lang.Integer maxLength) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.StringUtils").invoke("Summarize", text, maxLength);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String SplitOnMultipleLines(
      java.lang.String source, java.lang.Integer maxLineLength, java.lang.String lineEnding) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.StringUtils")
              .invoke("SplitOnMultipleLines", source, maxLineLength, lineEnding);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String FormatString(
      java.lang.String inStr,
      java.lang.Integer lineLen,
      java.lang.Integer groupLen,
      java.lang.Boolean nr) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.StringUtils")
              .invoke("FormatString", inStr, lineLen, groupLen, nr);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String FormatString(
      java.lang.Byte[] Signature, java.lang.Integer lineLen, java.lang.Integer groupLen) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.StringUtils")
              .invoke("FormatString", new Object[] {Signature}, lineLen, groupLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer FindInStringArray(
      java.lang.String[] strings, java.lang.String key) {
    try {
      java.lang.Integer res =
          Javonet.getType("Atos.Utilities.StringUtils")
              .invoke("FindInStringArray", new Object[] {strings}, key);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetCNFromName(java.lang.String name) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.StringUtils").invoke("GetCNFromName", name);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static jio.System.Collections.Generic.IList<java.lang.String> SplitIntoChunks(
      java.lang.String text, java.lang.Integer chunkSize) {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.StringUtils").invoke("SplitIntoChunks", text, chunkSize);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
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
