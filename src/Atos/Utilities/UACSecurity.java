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
import jio.System.Windows.Forms.*;

public abstract class UACSecurity {
  protected NObject javonetHandle;

  public UACSecurity(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long SendMessage(
      IntPtr hWnd, java.lang.Long msg, java.lang.Long wParam, java.lang.Long lParam) {
    try {
      java.lang.Long res =
          Javonet.getType("Atos.Utilities.UACSecurity")
              .invoke("SendMessage", hWnd, msg, wParam, lParam);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsVistaOrHigher() {
    try {
      java.lang.Boolean res =
          Javonet.getType("Atos.Utilities.UACSecurity").invoke("IsVistaOrHigher");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean CanElevateToAdmin() {
    try {
      java.lang.Boolean res =
          Javonet.getType("Atos.Utilities.UACSecurity").invoke("CanElevateToAdmin");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean RunningStandardButCanElevate() {
    try {
      java.lang.Boolean res =
          Javonet.getType("Atos.Utilities.UACSecurity").invoke("RunningStandardButCanElevate");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsAdmin() {
    try {
      java.lang.Boolean res = Javonet.getType("Atos.Utilities.UACSecurity").invoke("IsAdmin");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void AddShieldToButton(Button b) {
    try {
      Javonet.getType("Atos.Utilities.UACSecurity").invoke("AddShieldToButton", b);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void RestartElevated(java.lang.String parameter) {
    try {
      Javonet.getType("Atos.Utilities.UACSecurity").invoke("RestartElevated", parameter);
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
