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
import jio.System.Security.Cryptography.X509Certificates.*;

public class SslPolicyIgnoreDefects implements ICertificatePolicy {
  protected NObject javonetHandle;

  public SslPolicyIgnoreDefects() {
    try {
      javonetHandle = Javonet.New("Atos.Utilities.SslPolicyIgnoreDefects");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SslPolicyIgnoreDefects(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean CheckValidationResult(
      ServicePoint srvPoint,
      X509Certificate certificate,
      WebRequest request,
      java.lang.Integer certificateProblem) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Net.ICertificatePolicy")
              .invoke("CheckValidationResult", srvPoint, certificate, request, certificateProblem);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
