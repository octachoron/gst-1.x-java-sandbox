package gobject.introspection.GIRepository;

import gobject.runtime.*;
import com.sun.jna.*;



public class Typelib extends com.sun.jna.PointerType  {

public Typelib ();

public native  void free ();

public native  int getNamespace ();

public native  boolean symbol (com.sun.jna.ptr.IntByReference arg0, com.sun.jna.Pointer arg1);


}

