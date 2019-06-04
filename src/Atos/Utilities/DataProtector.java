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

public class DataProtector {
  protected NObject javonetHandle;

  public DataProtector(DataProtector.Store tempStore) {
    try {
      javonetHandle = Javonet.New("Atos.Utilities.DataProtector", NEnum.fromJavaEnum(tempStore));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DataProtector(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte[] Encrypt(
      java.lang.Byte[] plainText, java.lang.Byte[] optionalEntropy, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle.invoke("Encrypt", new Object[] {plainText}, new Object[] {optionalEntropy});
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
  public java.lang.Byte[] Decrypt(
      java.lang.Byte[] cipherText, java.lang.Byte[] optionalEntropy, Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle.invoke(
              "Decrypt", new Object[] {cipherText}, new Object[] {optionalEntropy});
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public enum Store {
    USE_MACHINE_STORE(1L),
    USE_USER_STORE(2L),
    ;
    private long numVal;

    Store(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
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
