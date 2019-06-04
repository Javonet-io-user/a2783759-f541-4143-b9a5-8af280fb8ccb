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
import Microsoft.Win32.*;

public abstract class WinRegistryUtils {
  protected NObject javonetHandle;

  public WinRegistryUtils(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object ReadRegInfo(java.lang.String path, java.lang.String name) {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.WinRegistryUtils").invoke("ReadRegInfo", path, name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static RegistryKey OpenKey(
      java.lang.String keyname, java.lang.Boolean writeable, RegistryHive position) {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.WinRegistryUtils")
              .invoke("OpenKey", keyname, writeable, NEnum.fromJavaEnum(position));
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static RegistryKey OpenKey(java.lang.String keyname, java.lang.Boolean writeable) {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.WinRegistryUtils").invoke("OpenKey", keyname, writeable);
      if (res == null) return null;
      return new RegistryKey((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object GetRegValue(RegistryKey key, java.lang.String value) {
    try {
      Object res =
          Javonet.getType("Atos.Utilities.WinRegistryUtils").invoke("GetRegValue", key, value);
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
