package gobject.introspection.GIRepository;

import gobject.runtime.*;
import com.sun.jna.*;



public class Argument extends com.sun.jna.Union  {

protected Argument (com.sun.jna.TypeMapper arg0);

public Argument ();

public class ByReference extends gobject.introspection.GIRepository.Argument implements com.sun.jna.Structure.ByReference {

public ByReference ();


}

public class ByValue extends gobject.introspection.GIRepository.Argument implements com.sun.jna.Structure.ByValue {

public ByValue ();


}


}

