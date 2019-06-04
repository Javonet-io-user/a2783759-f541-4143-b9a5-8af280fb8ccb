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

public interface IAsn1Node {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean LoadData(Stream xdata);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean SaveData(Stream xdata);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void AddChild(Asn1Node xdata);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer InsertChild(Asn1Node xdata, java.lang.Integer index);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer InsertChild(Asn1Node xdata, Asn1Node indexNode);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer InsertChildAfter(Asn1Node xdata, java.lang.Integer index);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer InsertChildAfter(Asn1Node xdata, Asn1Node indexNode);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Asn1Node RemoveChild(java.lang.Integer index);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Asn1Node RemoveChild(Asn1Node node);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Asn1Node GetChildNode(java.lang.Integer index);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Asn1Node GetDescendantNodeByPath(java.lang.String nodePath);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetText(Asn1Node startNode, java.lang.Integer lineLen);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetDataStr(java.lang.Boolean pureHexMode);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetLabel(java.lang.Long mask);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Asn1Node Clone();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void ClearAll();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Asn1Node getParentNode();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getChildNodeCount();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte getTag();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTagName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getDataLength();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getLengthFieldBytes();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getDataOffset();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte getUnusedBits();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte[] getData(Class<?> returnArrayType);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getParseEncapsulatedData();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getDeepness();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPath();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setTag(java.lang.Byte value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setData(java.lang.Byte[] value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setParseEncapsulatedData(java.lang.Boolean value);
}
