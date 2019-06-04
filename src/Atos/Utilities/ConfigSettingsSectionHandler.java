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
import jio.System.Xml.*;
import jio.System.Configuration.*;

public class ConfigSettingsSectionHandler implements IConfigurationSectionHandler {
  protected NObject javonetHandle;

  public ConfigSettingsSectionHandler() {
    try {
      javonetHandle = Javonet.New("Atos.Utilities.ConfigSettingsSectionHandler");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ConfigSettingsSectionHandler(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object Create(Object parent, Object configContext, XmlNode section) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Configuration.IConfigurationSectionHandler")
              .invoke("Create", parent, configContext, section);
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
