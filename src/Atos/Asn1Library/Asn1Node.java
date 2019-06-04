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
import jio.System.IO.*;

public class Asn1Node implements IAsn1Node {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setIsIndefiniteLength(java.lang.Boolean value) {
    try {
      javonetHandle.set("IsIndefiniteLength", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsIndefiniteLength() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsIndefiniteLength");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTag(java.lang.Byte value) {
    try {
      javonetHandle.explicitInterface("Atos.Asn1Library.IAsn1Node").invoke("set_Tag", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte getTag() {
    try {
      java.lang.Byte res =
          javonetHandle.explicitInterface("Atos.Asn1Library.IAsn1Node").invoke("get_Tag");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsEmptyData() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsEmptyData");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getChildNodeCount() {
    try {
      java.lang.Long res =
          javonetHandle
              .explicitInterface("Atos.Asn1Library.IAsn1Node")
              .invoke("get_ChildNodeCount");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTagName() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Atos.Asn1Library.IAsn1Node").invoke("get_TagName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Asn1Node getParentNode() {
    try {
      Object res =
          javonetHandle.explicitInterface("Atos.Asn1Library.IAsn1Node").invoke("get_ParentNode");
      if (res == null) return null;
      return new Asn1Node((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPath() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Atos.Asn1Library.IAsn1Node").invoke("get_Path");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getDataLength() {
    try {
      java.lang.Long res =
          javonetHandle.explicitInterface("Atos.Asn1Library.IAsn1Node").invoke("get_DataLength");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getLengthFieldBytes() {
    try {
      java.lang.Long res =
          javonetHandle
              .explicitInterface("Atos.Asn1Library.IAsn1Node")
              .invoke("get_LengthFieldBytes");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setData(java.lang.Byte[] value) {
    try {
      javonetHandle
          .explicitInterface("Atos.Asn1Library.IAsn1Node")
          .invoke("set_Data", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte[] getData(Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle.explicitInterface("Atos.Asn1Library.IAsn1Node").invoke("get_Data");
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getDeepness() {
    try {
      java.lang.Long res =
          javonetHandle.explicitInterface("Atos.Asn1Library.IAsn1Node").invoke("get_Deepness");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getDataOffset() {
    try {
      java.lang.Long res =
          javonetHandle.explicitInterface("Atos.Asn1Library.IAsn1Node").invoke("get_DataOffset");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUnusedBits(java.lang.Byte value) {
    try {
      javonetHandle.set("UnusedBits", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte getUnusedBits() {
    try {
      java.lang.Byte res =
          javonetHandle.explicitInterface("Atos.Asn1Library.IAsn1Node").invoke("get_UnusedBits");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setParseEncapsulatedData(java.lang.Boolean value) {
    try {
      javonetHandle
          .explicitInterface("Atos.Asn1Library.IAsn1Node")
          .invoke("set_ParseEncapsulatedData", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getParseEncapsulatedData() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("Atos.Asn1Library.IAsn1Node")
              .invoke("get_ParseEncapsulatedData");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getdefaultLineLen() {
    try {
      java.lang.Integer res = Javonet.getType("Atos.Asn1Library.Asn1Node").get("defaultLineLen");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setdefaultLineLen(java.lang.Integer param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Node").set("defaultLineLen", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getminLineLen() {
    try {
      java.lang.Integer res = Javonet.getType("Atos.Asn1Library.Asn1Node").get("minLineLen");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setminLineLen(java.lang.Integer param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Node").set("minLineLen", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getTagLength() {
    try {
      java.lang.Integer res = Javonet.getType("Atos.Asn1Library.Asn1Node").get("TagLength");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTagLength(java.lang.Integer param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Node").set("TagLength", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getBitStringUnusedFiledLength() {
    try {
      java.lang.Integer res =
          Javonet.getType("Atos.Asn1Library.Asn1Node").get("BitStringUnusedFiledLength");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBitStringUnusedFiledLength(java.lang.Integer param) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1Node").set("BitStringUnusedFiledLength", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Asn1Node() {
    try {
      javonetHandle = Javonet.New("Atos.Asn1Library.Asn1Node");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Asn1Node(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean LoadData(Stream xdata) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("Atos.Asn1Library.IAsn1Node").invoke("LoadData", xdata);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SaveData(Stream xdata) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("Atos.Asn1Library.IAsn1Node").invoke("SaveData", xdata);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddChild(Asn1Node xdata) {
    try {
      javonetHandle.explicitInterface("Atos.Asn1Library.IAsn1Node").invoke("AddChild", xdata);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer InsertChild(Asn1Node xdata, java.lang.Integer index) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Atos.Asn1Library.IAsn1Node")
              .invoke("InsertChild", xdata, index);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer InsertChild(Asn1Node xdata, Asn1Node indexNode) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Atos.Asn1Library.IAsn1Node")
              .invoke("InsertChild", xdata, indexNode);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer InsertChildAfter(Asn1Node xdata, java.lang.Integer index) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Atos.Asn1Library.IAsn1Node")
              .invoke("InsertChildAfter", xdata, index);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer InsertChildAfter(Asn1Node xdata, Asn1Node indexNode) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Atos.Asn1Library.IAsn1Node")
              .invoke("InsertChildAfter", xdata, indexNode);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Asn1Node RemoveChild(java.lang.Integer index) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Atos.Asn1Library.IAsn1Node")
              .invoke("RemoveChild", index);
      if (res == null) return null;
      return new Asn1Node((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Asn1Node RemoveChild(Asn1Node node) {
    try {
      Object res =
          javonetHandle.explicitInterface("Atos.Asn1Library.IAsn1Node").invoke("RemoveChild", node);
      if (res == null) return null;
      return new Asn1Node((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Asn1Node GetChildNode(java.lang.Integer index) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Atos.Asn1Library.IAsn1Node")
              .invoke("GetChildNode", index);
      if (res == null) return null;
      return new Asn1Node((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Asn1Node GetDescendantNodeByPath(java.lang.String nodePath) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Atos.Asn1Library.IAsn1Node")
              .invoke("GetDescendantNodeByPath", nodePath);
      if (res == null) return null;
      return new Asn1Node((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetText(Asn1Node startNode, java.lang.Integer lineLen) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Atos.Asn1Library.IAsn1Node")
              .invoke("GetText", startNode, lineLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetDataStr(java.lang.Boolean pureHexMode) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Atos.Asn1Library.IAsn1Node")
              .invoke("GetDataStr", pureHexMode);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetLabel(java.lang.Long mask) {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Atos.Asn1Library.IAsn1Node").invoke("GetLabel", mask);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Asn1Node Clone() {
    try {
      Object res = javonetHandle.explicitInterface("Atos.Asn1Library.IAsn1Node").invoke("Clone");
      if (res == null) return null;
      return new Asn1Node((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ClearAll() {
    try {
      javonetHandle.explicitInterface("Atos.Asn1Library.IAsn1Node").invoke("ClearAll");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean LoadData(java.lang.Byte[] byteData) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("LoadData", new Object[] {byteData});
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long GetDescendantNodeCount(Asn1Node node) {
    try {
      java.lang.Long res =
          Javonet.getType("Atos.Asn1Library.Asn1Node").invoke("GetDescendantNodeCount", node);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte[] GetRawData(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetRawData");
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
  public java.lang.String GetDataFromASCII() {
    try {
      java.lang.String res = javonetHandle.invoke("GetDataFromASCII");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Asn1Node GetDecendantNodeByOid(java.lang.String oid, Asn1Node startNode) {
    try {
      Object res =
          Javonet.getType("Atos.Asn1Library.Asn1Node")
              .invoke("GetDecendantNodeByOid", oid, startNode);
      if (res == null) return null;
      return new Asn1Node((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public static class TagTextMask {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.Long getSHOW_OFFSET() {
      try {
        java.lang.Long res = Javonet.getType("Atos.Asn1Library.TagTextMask").get("SHOW_OFFSET");
        if (res == null) return null;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setSHOW_OFFSET(java.lang.Long param) {
      try {
        Javonet.getType("Atos.Asn1Library.TagTextMask").set("SHOW_OFFSET", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.Long getSHOW_DATA() {
      try {
        java.lang.Long res = Javonet.getType("Atos.Asn1Library.TagTextMask").get("SHOW_DATA");
        if (res == null) return null;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setSHOW_DATA(java.lang.Long param) {
      try {
        Javonet.getType("Atos.Asn1Library.TagTextMask").set("SHOW_DATA", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.Long getUSE_HEX_OFFSET() {
      try {
        java.lang.Long res = Javonet.getType("Atos.Asn1Library.TagTextMask").get("USE_HEX_OFFSET");
        if (res == null) return null;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setUSE_HEX_OFFSET(java.lang.Long param) {
      try {
        Javonet.getType("Atos.Asn1Library.TagTextMask").set("USE_HEX_OFFSET", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.Long getSHOW_TAG_NUMBER() {
      try {
        java.lang.Long res = Javonet.getType("Atos.Asn1Library.TagTextMask").get("SHOW_TAG_NUMBER");
        if (res == null) return null;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setSHOW_TAG_NUMBER(java.lang.Long param) {
      try {
        Javonet.getType("Atos.Asn1Library.TagTextMask").set("SHOW_TAG_NUMBER", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public static java.lang.Long getSHOW_PATH() {
      try {
        java.lang.Long res = Javonet.getType("Atos.Asn1Library.TagTextMask").get("SHOW_PATH");
        if (res == null) return null;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public static void setSHOW_PATH(java.lang.Long param) {
      try {
        Javonet.getType("Atos.Asn1Library.TagTextMask").set("SHOW_PATH", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public TagTextMask() {
      try {
        javonetHandle = Javonet.New("Atos.Asn1Library.Asn1Node+TagTextMask");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public TagTextMask(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
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
