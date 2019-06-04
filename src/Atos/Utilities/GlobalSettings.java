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
import jio.System.Net.*;
import jio.System.Collections.Generic.*;
import jio.System.*;

public abstract class GlobalSettings {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static RevocationInformationType getPreferredVerificationMode() {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.GlobalSettings").<NEnum>get("PreferredVerificationMode");
      if (res == null) return null;
      return RevocationInformationType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPreferredVerificationMode(RevocationInformationType param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings")
          .set("PreferredVerificationMode", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Boolean getByPassWindowsCertificateCheck() {
    try {
      java.lang.Boolean res =
          Javonet.getType("Atos.Utilities.GlobalSettings").get("ByPassWindowsCertificateCheck");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setByPassWindowsCertificateCheck(java.lang.Boolean param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").set("ByPassWindowsCertificateCheck", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Boolean getAutomaticallyImportCACertificateFromQCTSL() {
    try {
      java.lang.Boolean res =
          Javonet.getType("Atos.Utilities.GlobalSettings")
              .get("AutomaticallyImportCACertificateFromQCTSL");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAutomaticallyImportCACertificateFromQCTSL(java.lang.Boolean param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings")
          .set("AutomaticallyImportCACertificateFromQCTSL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCacheCRL() {
    try {
      java.lang.String res = Javonet.getType("Atos.Utilities.GlobalSettings").get("CacheCRL");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCacheCRL(java.lang.String param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").set("CacheCRL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTSAServerUrl() {
    try {
      java.lang.String res = Javonet.getType("Atos.Utilities.GlobalSettings").get("TSAServerUrl");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTSAServerUrl(java.lang.String param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").set("TSAServerUrl", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getUseDefaultSSLCertificate() {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.GlobalSettings").get("UseDefaultSSLCertificate");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUseDefaultSSLCertificate(java.lang.String param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").set("UseDefaultSSLCertificate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getDefaultSSLCertificate() {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.GlobalSettings").get("DefaultSSLCertificate");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultSSLCertificate(java.lang.String param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").set("DefaultSSLCertificate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getLdapServerUrl() {
    try {
      java.lang.String res = Javonet.getType("Atos.Utilities.GlobalSettings").get("LdapServerUrl");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLdapServerUrl(java.lang.String param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").set("LdapServerUrl", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Boolean getDoDigitPADigestTimeCheck() {
    try {
      java.lang.Boolean res =
          Javonet.getType("Atos.Utilities.GlobalSettings").get("DoDigitPADigestTimeCheck");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDoDigitPADigestTimeCheck(java.lang.Boolean param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").set("DoDigitPADigestTimeCheck", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getProxyActive() {
    try {
      java.lang.String res = Javonet.getType("Atos.Utilities.GlobalSettings").get("ProxyActive");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setProxyActive(java.lang.String param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").set("ProxyActive", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getProxyDomain() {
    try {
      java.lang.String res = Javonet.getType("Atos.Utilities.GlobalSettings").get("ProxyDomain");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setProxyDomain(java.lang.String param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").set("ProxyDomain", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getProxyHost() {
    try {
      java.lang.String res = Javonet.getType("Atos.Utilities.GlobalSettings").get("ProxyHost");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setProxyHost(java.lang.String param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").set("ProxyHost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getProxyUsername() {
    try {
      java.lang.String res = Javonet.getType("Atos.Utilities.GlobalSettings").get("ProxyUsername");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setProxyUsername(java.lang.String param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").set("ProxyUsername", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getProxyPassword() {
    try {
      java.lang.String res = Javonet.getType("Atos.Utilities.GlobalSettings").get("ProxyPassword");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setProxyPassword(java.lang.String param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").set("ProxyPassword", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Dictionary<java.lang.String, NetworkCredential> getServiceCredential() {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.GlobalSettings").<NObject>get("ServiceCredential");
      if (res == null) return null;
      return new Dictionary<java.lang.String, NetworkCredential>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setServiceCredential(Dictionary<java.lang.String, NetworkCredential> param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").set("ServiceCredential", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Boolean getAllowTSU() {
    try {
      java.lang.Boolean res = Javonet.getType("Atos.Utilities.GlobalSettings").get("AllowTSU");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAllowTSU(java.lang.Boolean param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").set("AllowTSU", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Boolean getAllowAC() {
    try {
      java.lang.Boolean res = Javonet.getType("Atos.Utilities.GlobalSettings").get("AllowAC");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAllowAC(java.lang.Boolean param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").set("AllowAC", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Boolean getAllowBulkSignature() {
    try {
      java.lang.Boolean res =
          Javonet.getType("Atos.Utilities.GlobalSettings").get("AllowBulkSignature");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAllowBulkSignature(java.lang.Boolean param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").set("AllowBulkSignature", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Object getSignatureCheck() {
    try {
      Object res = Javonet.getType("Atos.Utilities.GlobalSettings").<NObject>get("SignatureCheck");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSignatureCheck(Object param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").set("SignatureCheck", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static ConfigSettings getCurrentConfigurationSettings() {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.GlobalSettings")
              .<NObject>get("CurrentConfigurationSettings");
      if (res == null) return null;
      return new ConfigSettings((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCurrentConfigurationSettings(ConfigSettings param) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").set("CurrentConfigurationSettings", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GlobalSettings(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void SaveServiceCredential(java.lang.String serviceCode) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings").invoke("SaveServiceCredential", serviceCode);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ReadValuesFromConfiguration(ConfigSettings configSettings) {
    try {
      Javonet.getType("Atos.Utilities.GlobalSettings")
          .invoke("ReadValuesFromConfiguration", configSettings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
