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
import jio.System.*;

public class NTreeNode<T> {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "Method")
  public void setTreeData(T value) {
    try {
      javonetHandle.invoke("set_TreeData", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public T getTreeData(Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("get_TreeData");
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFather(NTreeNode<T> value) {
    try {
      javonetHandle.set("Father", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public NTreeNode<T> getFather() {
    try {
      Object res = javonetHandle.<NObject>get("Father");
      if (res == null) return null;
      return new NTreeNode<T>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setChildIndex(java.lang.Integer value) {
    try {
      javonetHandle.set("ChildIndex", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getChildIndex() {
    try {
      java.lang.Integer res = javonetHandle.get("ChildIndex");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public NTreeNode(T data, Class<?> T) {
    try {
      javonetHandle =
          Javonet.getType("Atos.Utilities.NTreeNode`1", getReturnObjectName(T)).create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NTreeNode(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public NTreeNode<T> AddChild(T childData) {
    try {
      Object res = javonetHandle.invoke("AddChild", childData);
      if (res == null) return null;
      return new NTreeNode<T>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddChild(NTreeNode<T> subTree) {
    try {
      javonetHandle.invoke("AddChild", subTree);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public NTreeNode<T> GetChild(java.lang.Integer i) {
    try {
      Object res = javonetHandle.invoke("GetChild", i);
      if (res == null) return null;
      return new NTreeNode<T>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Traverse(NTreeNode<T> node, TreeVisitor<T> visitor) {
    try {
      javonetHandle.invoke("Traverse", node, visitor);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetDescendantNodesList(NTreeNode<T> node, List<T> list) {
    try {
      javonetHandle.invoke("GetDescendantNodesList", node, list);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Traverse(NTreeNode<T> node, TreeVisitorWithParameter<T> visitor, Object parameter) {
    try {
      javonetHandle.invoke("Traverse", node, visitor, parameter);
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
