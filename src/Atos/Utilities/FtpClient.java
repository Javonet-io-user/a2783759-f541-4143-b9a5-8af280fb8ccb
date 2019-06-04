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
import jio.System.IO.*;
import jio.System.*;

public class FtpClient {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setHostname(java.lang.String value) {
    try {
      javonetHandle.set("Hostname", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getHostname() {
    try {
      java.lang.String res = javonetHandle.get("Hostname");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUsername(java.lang.String value) {
    try {
      javonetHandle.set("Username", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUsername() {
    try {
      java.lang.String res = javonetHandle.get("Username");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPassword(java.lang.String value) {
    try {
      javonetHandle.set("Password", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPassword() {
    try {
      java.lang.String res = javonetHandle.get("Password");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCurrentDirectory(java.lang.String value) {
    try {
      javonetHandle.set("CurrentDirectory", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCurrentDirectory() {
    try {
      java.lang.String res = javonetHandle.get("CurrentDirectory");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setWelcomeMessage(java.lang.String value) {
    try {
      javonetHandle.set("WelcomeMessage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getWelcomeMessage() {
    try {
      java.lang.String res = javonetHandle.get("WelcomeMessage");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExitMessage(java.lang.String value) {
    try {
      javonetHandle.set("ExitMessage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getExitMessage() {
    try {
      java.lang.String res = javonetHandle.get("ExitMessage");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getRemoveSlashOnAbsolutePaths() {
    try {
      java.lang.Boolean res = javonetHandle.get("RemoveSlashOnAbsolutePaths");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setRemoveSlashOnAbsolutePaths(java.lang.Boolean param) {
    try {
      javonetHandle.set("RemoveSlashOnAbsolutePaths", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FtpClient() {
    try {
      javonetHandle = Javonet.New("Atos.Utilities.FtpClient");
      javonetHandle.addEventListener(
          "OnDownloadProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FtpClient.DownloadProgressChangedHandler handler :
                  _OnDownloadProgressChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadProgressChangedArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnDownloadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FtpClient.DownloadCompletedHandler handler : _OnDownloadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadCompletedArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnNewMessageReceived",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FtpClient.NewMessageHandler handler : _OnNewMessageReceivedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NewMessageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnUploadProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FtpClient.UploadProgressChangedHandler handler :
                  _OnUploadProgressChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadProgressChangedArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnUploadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FtpClient.UploadCompletedHandler handler : _OnUploadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadCompletedArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FtpClient(java.lang.String hostname) {
    try {
      javonetHandle = Javonet.New("Atos.Utilities.FtpClient", hostname);
      javonetHandle.addEventListener(
          "OnDownloadProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FtpClient.DownloadProgressChangedHandler handler :
                  _OnDownloadProgressChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadProgressChangedArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnDownloadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FtpClient.DownloadCompletedHandler handler : _OnDownloadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadCompletedArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnNewMessageReceived",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FtpClient.NewMessageHandler handler : _OnNewMessageReceivedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NewMessageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnUploadProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FtpClient.UploadProgressChangedHandler handler :
                  _OnUploadProgressChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadProgressChangedArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnUploadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FtpClient.UploadCompletedHandler handler : _OnUploadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadCompletedArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FtpClient(
      java.lang.String hostname, java.lang.String username, java.lang.String password) {
    try {
      javonetHandle = Javonet.New("Atos.Utilities.FtpClient", hostname, username, password);
      javonetHandle.addEventListener(
          "OnDownloadProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FtpClient.DownloadProgressChangedHandler handler :
                  _OnDownloadProgressChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadProgressChangedArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnDownloadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FtpClient.DownloadCompletedHandler handler : _OnDownloadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadCompletedArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnNewMessageReceived",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FtpClient.NewMessageHandler handler : _OnNewMessageReceivedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], NewMessageEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnUploadProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FtpClient.UploadProgressChangedHandler handler :
                  _OnUploadProgressChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadProgressChangedArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnUploadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (FtpClient.UploadCompletedHandler handler : _OnUploadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadCompletedArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FtpClient(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public List<java.lang.String> ListDirectory(java.lang.String directory) {
    try {
      Object res = javonetHandle.invoke("ListDirectory", directory);
      if (res == null) return null;
      return new List<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FtpDirectory ListDirectoryDetail(java.lang.String directory) {
    try {
      Object res = javonetHandle.invoke("ListDirectoryDetail", directory);
      if (res == null) return null;
      return new FtpDirectory((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Upload(java.lang.String localFilename, java.lang.String targetFilename) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Upload", localFilename, targetFilename);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Upload(FileInfo fi, java.lang.String targetFilename) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Upload", fi, targetFilename);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Upload(java.lang.Byte[] dataToSend, java.lang.String targetFilename) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke("Upload", new Object[] {dataToSend}, targetFilename);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CancelUpload(java.lang.String uploadFileName) {
    try {
      javonetHandle.invoke("CancelUpload", uploadFileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Download(
      java.lang.String sourceFilename,
      java.lang.String localFilename,
      java.lang.Boolean permitOverwrite) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke("Download", sourceFilename, localFilename, permitOverwrite);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Download(
      FtpFileInfo file, java.lang.String localFilename, java.lang.Boolean permitOverwrite) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke("Download", file, localFilename, permitOverwrite);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Download(
      FtpFileInfo file, FileInfo localFi, java.lang.Boolean permitOverwrite) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Download", file, localFi, permitOverwrite);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Download(
      java.lang.String sourceFilename, FileInfo targetFi, java.lang.Boolean permitOverwrite) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke("Download", sourceFilename, targetFi, permitOverwrite);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Download(
      java.lang.String sourceFilename, AtomicReference<java.lang.Byte[]> dataDownloaded) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke("Download", sourceFilename, new NRef(dataDownloaded));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CancelDownload() {
    try {
      javonetHandle.invoke("CancelDownload");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean FtpDelete(java.lang.String filename) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("FtpDelete", filename);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean FtpFileExists(java.lang.String filename) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("FtpFileExists", filename);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long GetFileSize(java.lang.String filename) {
    try {
      java.lang.Long res = javonetHandle.invoke("GetFileSize", filename);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean FtpRename(java.lang.String sourceFilename, java.lang.String newName) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("FtpRename", sourceFilename, newName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean FtpCreateDirectory(java.lang.String dirpath) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("FtpCreateDirectory", dirpath);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean FtpDeleteDirectory(java.lang.String dirpath) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("FtpDeleteDirectory", dirpath);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Event */

  private java.util.ArrayList<FtpClient.DownloadProgressChangedHandler>
      _OnDownloadProgressChangedListeners =
          new java.util.ArrayList<FtpClient.DownloadProgressChangedHandler>();

  public void addOnDownloadProgressChanged(FtpClient.DownloadProgressChangedHandler toAdd) {
    _OnDownloadProgressChangedListeners.add(toAdd);
  }

  public void removeOnDownloadProgressChanged(FtpClient.DownloadProgressChangedHandler toRemove) {
    _OnDownloadProgressChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<FtpClient.DownloadCompletedHandler> _OnDownloadCompletedListeners =
      new java.util.ArrayList<FtpClient.DownloadCompletedHandler>();

  public void addOnDownloadCompleted(FtpClient.DownloadCompletedHandler toAdd) {
    _OnDownloadCompletedListeners.add(toAdd);
  }

  public void removeOnDownloadCompleted(FtpClient.DownloadCompletedHandler toRemove) {
    _OnDownloadCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<FtpClient.NewMessageHandler> _OnNewMessageReceivedListeners =
      new java.util.ArrayList<FtpClient.NewMessageHandler>();

  public void addOnNewMessageReceived(FtpClient.NewMessageHandler toAdd) {
    _OnNewMessageReceivedListeners.add(toAdd);
  }

  public void removeOnNewMessageReceived(FtpClient.NewMessageHandler toRemove) {
    _OnNewMessageReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<FtpClient.UploadProgressChangedHandler>
      _OnUploadProgressChangedListeners =
          new java.util.ArrayList<FtpClient.UploadProgressChangedHandler>();

  public void addOnUploadProgressChanged(FtpClient.UploadProgressChangedHandler toAdd) {
    _OnUploadProgressChangedListeners.add(toAdd);
  }

  public void removeOnUploadProgressChanged(FtpClient.UploadProgressChangedHandler toRemove) {
    _OnUploadProgressChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<FtpClient.UploadCompletedHandler> _OnUploadCompletedListeners =
      new java.util.ArrayList<FtpClient.UploadCompletedHandler>();

  public void addOnUploadCompleted(FtpClient.UploadCompletedHandler toAdd) {
    _OnUploadCompletedListeners.add(toAdd);
  }

  public void removeOnUploadCompleted(FtpClient.UploadCompletedHandler toRemove) {
    _OnUploadCompletedListeners.remove(toRemove);
  }

  public interface DownloadProgressChangedHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, DownloadProgressChangedArgs e);
  }

  public interface DownloadCompletedHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, DownloadCompletedArgs e);
  }

  public interface NewMessageHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, NewMessageEventArgs e);
  }

  public interface UploadProgressChangedHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, UploadProgressChangedArgs e);
  }

  public interface UploadCompletedHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, UploadCompletedArgs e);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
