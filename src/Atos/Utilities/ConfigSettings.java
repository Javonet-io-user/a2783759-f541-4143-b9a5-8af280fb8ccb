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
import jio.System.Collections.Specialized.*;
import jio.System.Collections.Generic.*;
import jio.System.Xml.*;

public class ConfigSettings {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setConfigFileName(java.lang.String value) {
    try {
      javonetHandle.set("ConfigFileName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getConfigFileName() {
    try {
      java.lang.String res = javonetHandle.get("ConfigFileName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setXmlDocument(XmlDocument value) {
    try {
      javonetHandle.set("XmlDocument", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public XmlDocument getXmlDocument() {
    try {
      Object res = javonetHandle.<NObject>get("XmlDocument");
      if (res == null) return null;
      return new XmlDocument((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setWriter(XmlTextWriter value) {
    try {
      javonetHandle.set("Writer", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public XmlTextWriter getWriter() {
    try {
      Object res = javonetHandle.<NObject>get("Writer");
      if (res == null) return null;
      return new XmlTextWriter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setXmlNodeList(XmlNodeList value) {
    try {
      javonetHandle.set("XmlNodeList", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public XmlNodeList getXmlNodeList() {
    try {
      Object res = javonetHandle.<NObject>get("XmlNodeList");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAppSettingsNode(XmlElement value) {
    try {
      javonetHandle.set("AppSettingsNode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public XmlElement getAppSettingsNode() {
    try {
      Object res = javonetHandle.<NObject>get("AppSettingsNode");
      if (res == null) return null;
      return new XmlElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNode(XmlElement value) {
    try {
      javonetHandle.set("Node", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public XmlElement getNode() {
    try {
      Object res = javonetHandle.<NObject>get("Node");
      if (res == null) return null;
      return new XmlElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setQuery(java.lang.String value) {
    try {
      javonetHandle.set("Query", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getQuery() {
    try {
      java.lang.String res = javonetHandle.get("Query");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setXmlAttribute1(XmlAttribute value) {
    try {
      javonetHandle.set("XmlAttribute1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public XmlAttribute getXmlAttribute1() {
    try {
      Object res = javonetHandle.<NObject>get("XmlAttribute1");
      if (res == null) return null;
      return new XmlAttribute((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setXmlAttribute2(XmlAttribute value) {
    try {
      javonetHandle.set("XmlAttribute2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public XmlAttribute getXmlAttribute2() {
    try {
      Object res = javonetHandle.<NObject>get("XmlAttribute2");
      if (res == null) return null;
      return new XmlAttribute((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSectionName(java.lang.String value) {
    try {
      javonetHandle.set("SectionName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSectionName() {
    try {
      java.lang.String res = javonetHandle.get("SectionName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFileExists(java.lang.Boolean value) {
    try {
      javonetHandle.set("FileExists", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getFileExists() {
    try {
      java.lang.Boolean res = javonetHandle.get("FileExists");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public ConfigSettings(
      java.lang.String configurationName, java.lang.Boolean standaloneApplication) {
    try {
      javonetHandle =
          Javonet.New("Atos.Utilities.ConfigSettings", configurationName, standaloneApplication);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ConfigSettings(java.lang.String configurationName) {
    try {
      javonetHandle = Javonet.New("Atos.Utilities.ConfigSettings", configurationName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ConfigSettings() {
    try {
      javonetHandle = Javonet.New("Atos.Utilities.ConfigSettings");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ConfigSettings(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public NameValueCollection GetConfig() {
    try {
      Object res = javonetHandle.invoke("GetConfig");
      if (res == null) return null;
      return new NameValueCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public NameValueCollection GetConfig(java.lang.String SectionName) {
    try {
      Object res = javonetHandle.invoke("GetConfig", SectionName);
      if (res == null) return null;
      return new NameValueCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public List<java.lang.String> GetKeysStartingWith(java.lang.String prefix) {
    try {
      Object res = javonetHandle.invoke("GetKeysStartingWith", prefix);
      if (res == null) return null;
      return new List<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetValue(java.lang.String AttributeName) {
    try {
      java.lang.String res = javonetHandle.invoke("GetValue", AttributeName);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetValue(java.lang.String AttributeName, java.lang.String Value) {
    try {
      javonetHandle.invoke("SetValue", AttributeName, Value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CreateConfigFile(java.lang.String ConfigFileName, java.lang.String sectionName) {
    try {
      javonetHandle.invoke("CreateConfigFile", ConfigFileName, sectionName);
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
