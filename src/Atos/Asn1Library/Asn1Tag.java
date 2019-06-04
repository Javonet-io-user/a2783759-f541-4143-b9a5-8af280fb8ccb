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

public class Asn1Tag {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getTAG_MASK() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("TAG_MASK");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTAG_MASK(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("TAG_MASK", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getTERMINATOR() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("TERMINATOR");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTERMINATOR(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("TERMINATOR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getBOOLEAN() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("BOOLEAN");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBOOLEAN(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("BOOLEAN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getINTEGER() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("INTEGER");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setINTEGER(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("INTEGER", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getBIT_STRING() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("BIT_STRING");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBIT_STRING(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("BIT_STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getOCTET_STRING() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("OCTET_STRING");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOCTET_STRING(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("OCTET_STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getTAG_NULL() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("TAG_NULL");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTAG_NULL(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("TAG_NULL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getOBJECT_IDENTIFIER() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("OBJECT_IDENTIFIER");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJECT_IDENTIFIER(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("OBJECT_IDENTIFIER", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getOBJECT_DESCRIPTOR() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("OBJECT_DESCRIPTOR");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJECT_DESCRIPTOR(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("OBJECT_DESCRIPTOR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getEXTERNAL() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("EXTERNAL");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEXTERNAL(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("EXTERNAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getREAL() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("REAL");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setREAL(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("REAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getENUMERATED() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("ENUMERATED");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setENUMERATED(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("ENUMERATED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getUTF8_STRING() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("UTF8_STRING");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUTF8_STRING(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("UTF8_STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getRELATIVE_OID() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("RELATIVE_OID");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRELATIVE_OID(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("RELATIVE_OID", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getSEQUENCE() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("SEQUENCE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSEQUENCE(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("SEQUENCE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getSET() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("SET");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSET(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("SET", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getNUMERIC_STRING() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("NUMERIC_STRING");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNUMERIC_STRING(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("NUMERIC_STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getPRINTABLE_STRING() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("PRINTABLE_STRING");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPRINTABLE_STRING(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("PRINTABLE_STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getT61_STRING() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("T61_STRING");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setT61_STRING(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("T61_STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getVIDEOTEXT_STRING() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("VIDEOTEXT_STRING");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setVIDEOTEXT_STRING(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("VIDEOTEXT_STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getIA5_STRING() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("IA5_STRING");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIA5_STRING(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("IA5_STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getUTC_TIME() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("UTC_TIME");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUTC_TIME(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("UTC_TIME", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getGENERALIZED_TIME() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("GENERALIZED_TIME");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGENERALIZED_TIME(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("GENERALIZED_TIME", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getGRAPHIC_STRING() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("GRAPHIC_STRING");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGRAPHIC_STRING(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("GRAPHIC_STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getVISIBLE_STRING() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("VISIBLE_STRING");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setVISIBLE_STRING(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("VISIBLE_STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getGENERAL_STRING() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("GENERAL_STRING");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGENERAL_STRING(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("GENERAL_STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getUNIVERSAL_STRING() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("UNIVERSAL_STRING");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUNIVERSAL_STRING(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("UNIVERSAL_STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getBMPSTRING() {
    try {
      java.lang.Byte res = Javonet.getType("Atos.Asn1Library.Asn1Tag").get("BMPSTRING");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBMPSTRING(java.lang.Byte param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Tag").set("BMPSTRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Asn1Tag() {
    try {
      javonetHandle = Javonet.New("Atos.Asn1Library.Asn1Tag");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Asn1Tag(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
