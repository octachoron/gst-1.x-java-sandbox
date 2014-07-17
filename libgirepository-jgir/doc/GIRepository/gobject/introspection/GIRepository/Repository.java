package gobject.introspection.GIRepository;

import gobject.runtime.*;
import com.sun.jna.*;



public class Repository extends gobject.runtime.GObject  {

public static native  gobject.runtime.GType getGType ();

protected Repository (gobject.internals.Handle.Initializer arg0);

public Repository ();

public Repository (java.lang.Object[] arg0);

public Repository (java.util.Map arg0);

protected Repository (gobject.runtime.GType arg0, java.lang.Object[] arg1);

protected Repository (gobject.runtime.GType arg0, java.util.Map arg1);

public static native  boolean dump (com.sun.jna.ptr.IntByReference arg0);

public static native  int errorQuark ();

public static native  java.lang.Long getDefault ();

public static native  float getSearchPath ();

public static native  void prependLibraryPath (com.sun.jna.ptr.IntByReference arg0);

public static native  void prependSearchPath (com.sun.jna.ptr.IntByReference arg0);

public native  java.lang.Long enumerateVersions (com.sun.jna.ptr.IntByReference arg0);

public native  java.lang.Long findByErrorDomain (int arg0);

public native  java.lang.Long findByGtype (int arg0);

public native  java.lang.Long findByName (com.sun.jna.ptr.IntByReference arg0, com.sun.jna.ptr.IntByReference arg1);

public native  int getCPrefix (com.sun.jna.ptr.IntByReference arg0);

public native  java.lang.Long getDependencies (com.sun.jna.ptr.IntByReference arg0);

public native  java.lang.Long getInfo (com.sun.jna.ptr.IntByReference arg0, int arg1);

public native  java.lang.Long getLoadedNamespaces ();

public native  int getNInfos (com.sun.jna.ptr.IntByReference arg0);

public native  int getSharedLibrary (com.sun.jna.ptr.IntByReference arg0);

public native  int getTypelibPath (com.sun.jna.ptr.IntByReference arg0);

public native  int getVersion (com.sun.jna.ptr.IntByReference arg0);

public native  boolean isRegistered (com.sun.jna.ptr.IntByReference arg0, com.sun.jna.ptr.IntByReference arg1);

public native  int loadTypelib (gobject.internals.UnmappedPointer arg0, long arg1);

public native  java.lang.Long require (com.sun.jna.ptr.IntByReference arg0, com.sun.jna.ptr.IntByReference arg1, long arg2);

public native  java.lang.Long requirePrivate (com.sun.jna.ptr.IntByReference arg0, com.sun.jna.ptr.IntByReference arg1, com.sun.jna.ptr.IntByReference arg2, long arg3);


}

