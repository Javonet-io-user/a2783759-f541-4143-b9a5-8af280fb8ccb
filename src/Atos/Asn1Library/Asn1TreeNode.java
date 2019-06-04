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
import jio.System.Windows.Forms.*;
import Atos.Asn1Library.*;
import jio.System.*;
import jio.System.Runtime.Serialization.*;

public class Asn1TreeNode extends TreeNode implements ICloneable, ISerializable {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public Asn1Node getANode() {
    try {
      Object res = javonetHandle.<NObject>get("ANode");
      if (res == null) return null;
      return new Asn1Node((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Asn1TreeNode(Asn1Node node, java.lang.Long mask) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Atos.Asn1Library.Asn1TreeNode", node, mask);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Asn1TreeNode(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void AddSubNode(Asn1TreeNode node, java.lang.Long mask, TreeView treeView) {
    try {
      Javonet.getType("Atos.Asn1Library.Asn1TreeNode").invoke("AddSubNode", node, mask, treeView);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static TreeNode SearchTreeNode(TreeNode treeNode, Asn1Node node) {
    try {
      Object res =
          Javonet.getType("Atos.Asn1Library.Asn1TreeNode").invoke("SearchTreeNode", treeNode, node);
      if (res == null) return null;
      return new TreeNode((NObject) res);
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
