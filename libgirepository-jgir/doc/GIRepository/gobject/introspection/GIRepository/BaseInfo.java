package gobject.introspection.GIRepository;

import gobject.runtime.*;
import com.sun.jna.*;



public class BaseInfo extends gobject.runtime.GBoxed  {

public static native  gobject.runtime.GType getGType ();

public BaseInfo (gobject.runtime.GType arg0, com.sun.jna.Pointer arg1, com.sun.jna.TypeMapper arg2);

public BaseInfo ();

public native  boolean equal (gobject.internals.UnmappedPointer arg0);

public native  int getAttribute (com.sun.jna.ptr.IntByReference arg0);

public native  java.lang.Long getContainer ();

public native  int getName ();

public native  int getNamespace ();

public native  java.lang.Long getType ();

public native  java.lang.Long getTypelib ();

public native  boolean isDeprecated ();

public native  boolean iterateAttributes (gobject.internals.UnmappedPointer arg0, com.sun.jna.ptr.IntByReference arg1, com.sun.jna.ptr.IntByReference arg2);


}

