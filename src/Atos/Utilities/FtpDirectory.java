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
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;

public class FtpDirectory extends List<FtpFileInfo>
    implements jio.System.Collections.Generic.IList<FtpFileInfo>,
        jio.System.Collections.Generic.ICollection<FtpFileInfo>,
        jio.System.Collections.Generic.IEnumerable<FtpFileInfo>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IList,
        jio.System.Collections.ICollection,
        IReadOnlyList<FtpFileInfo>,
        IReadOnlyCollection<FtpFileInfo> {
  protected NObject javonetHandle;

  public FtpDirectory() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Atos.Utilities.FtpDirectory");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FtpDirectory(java.lang.String dir, java.lang.String path) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Atos.Utilities.FtpDirectory", dir, path);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FtpDirectory(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FtpDirectory GetFiles(java.lang.String ext) {
    try {
      Object res = javonetHandle.invoke("GetFiles", ext);
      if (res == null) return null;
      return new FtpDirectory((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FtpDirectory GetDirectories() {
    try {
      Object res = javonetHandle.invoke("GetDirectories");
      if (res == null) return null;
      return new FtpDirectory((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean FileExists(java.lang.String filename) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("FileExists", filename);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetParentDirectory(java.lang.String dir) {
    try {
      java.lang.String res =
          Javonet.getType("Atos.Utilities.FtpDirectory").invoke("GetParentDirectory", dir);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
