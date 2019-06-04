package jio.System.Collections;

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
import jio.System.Collections.*;
import jio.System.Runtime.Serialization.*;
import jio.System.*;

public class Hashtable
    implements IDictionary,
        ICollection,
        IEnumerable,
        ISerializable,
        IDeserializationCallback,
        ICloneable,
        Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.IDictionary_GetEnumerator();
  }

  public Hashtable() {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(java.lang.Integer capacity) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", capacity);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(java.lang.Integer capacity, java.lang.Float loadFactor) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", capacity, loadFactor);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(
      java.lang.Integer capacity,
      java.lang.Float loadFactor,
      IHashCodeProvider hcp,
      IComparer comparer) {
    try {
      javonetHandle =
          Javonet.New("System.Collections.Hashtable", capacity, loadFactor, hcp, comparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(
      java.lang.Integer capacity, java.lang.Float loadFactor, IEqualityComparer equalityComparer) {
    try {
      javonetHandle =
          Javonet.New("System.Collections.Hashtable", capacity, loadFactor, equalityComparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(IHashCodeProvider hcp, IComparer comparer) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", hcp, comparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(IEqualityComparer equalityComparer) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", equalityComparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(java.lang.Integer capacity, IHashCodeProvider hcp, IComparer comparer) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", capacity, hcp, comparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(java.lang.Integer capacity, IEqualityComparer equalityComparer) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", capacity, equalityComparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(IDictionary d) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", d);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(IDictionary d, java.lang.Float loadFactor) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", d, loadFactor);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(IDictionary d, IHashCodeProvider hcp, IComparer comparer) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", d, hcp, comparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(IDictionary d, IEqualityComparer equalityComparer) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", d, equalityComparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(
      IDictionary d, java.lang.Float loadFactor, IHashCodeProvider hcp, IComparer comparer) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", d, loadFactor, hcp, comparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(IDictionary d, java.lang.Float loadFactor, IEqualityComparer equalityComparer) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", d, loadFactor, equalityComparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IDictionaryEnumerator IDictionary_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerable")
              .invoke("GetEnumerator");
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
