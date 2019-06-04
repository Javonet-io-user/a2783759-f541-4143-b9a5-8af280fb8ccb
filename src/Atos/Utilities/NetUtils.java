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
import Microsoft.Win32.*;
import jio.System.Collections.Generic.*;
import jio.System.Net.*;
import jio.System.*;

public abstract class NetUtils {
  protected NObject javonetHandle;

  public NetUtils(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void SetGlobalProxyFromRegistry(java.lang.String registryKey, RegistryHive hive) {
    try {
      Javonet.getType("Atos.Utilities.NetUtils")
          .invoke("SetGlobalProxyFromRegistry", registryKey, NEnum.fromJavaEnum(hive));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void SetGlobalProxyFromConfiguration() {
    try {
      Javonet.getType("Atos.Utilities.NetUtils").invoke("SetGlobalProxyFromConfiguration");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void SetGlobalProxyFromParameters(
      java.lang.String host,
      java.lang.String domain,
      java.lang.String username,
      java.lang.String password) {
    try {
      Javonet.getType("Atos.Utilities.NetUtils")
          .invoke("SetGlobalProxyFromParameters", host, domain, username, password);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Dictionary<java.lang.String, java.lang.String> GetMacAddresses(
      java.lang.Boolean withIpEnabled) {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.NetUtils").invoke("GetMacAddresses", withIpEnabled);
      if (res == null) return null;
      return new Dictionary<java.lang.String, java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long InspectHttpFileSize(
      java.lang.String urlFile,
      java.lang.Boolean downloadIfNotAvailable,
      AtomicReference<java.lang.Byte[]> maybeDownloadedFile) {
    try {
      java.lang.Long res =
          Javonet.getType("Atos.Utilities.NetUtils")
              .invoke(
                  "InspectHttpFileSize",
                  urlFile,
                  downloadIfNotAvailable,
                  new NRef(maybeDownloadedFile));
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] DownloadHTTP(java.lang.String urlFile, Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("Atos.Utilities.NetUtils").invoke("DownloadHTTP", urlFile);
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
  public static HttpStatusCode InspectResponseCode(WebException exc) {
    try {
      Object res = Javonet.getType("Atos.Utilities.NetUtils").invoke("InspectResponseCode", exc);
      if (res == null) return null;
      return HttpStatusCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static List<java.lang.String> GetIpAddresses() {
    try {
      Object res = Javonet.getType("Atos.Utilities.NetUtils").invoke("GetIpAddresses");
      if (res == null) return null;
      return new List<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DateTime GetLastModified(java.lang.String uri) {
    try {
      Object res = Javonet.getType("Atos.Utilities.NetUtils").invoke("GetLastModified", uri);
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
