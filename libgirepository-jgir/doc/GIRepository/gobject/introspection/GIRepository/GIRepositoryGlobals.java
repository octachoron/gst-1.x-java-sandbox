package gobject.introspection.GIRepository;

import gobject.runtime.*;
import com.sun.jna.*;



public final class GIRepositoryGlobals extends java.lang.Object  {

public final static native  int argInfoGetClosure (gobject.internals.UnmappedPointer arg0);

public final static native  int argInfoGetDestroy (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long argInfoGetDirection (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long argInfoGetOwnershipTransfer (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long argInfoGetScope (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long argInfoGetType (gobject.internals.UnmappedPointer arg0);

public final static native  boolean argInfoIsCallerAllocates (gobject.internals.UnmappedPointer arg0);

public final static native  boolean argInfoIsOptional (gobject.internals.UnmappedPointer arg0);

public final static native  boolean argInfoIsReturnValue (gobject.internals.UnmappedPointer arg0);

public final static native  boolean argInfoIsSkip (gobject.internals.UnmappedPointer arg0);

public final static native  void argInfoLoadType (gobject.internals.UnmappedPointer arg0, gobject.internals.UnmappedPointer arg1);

public final static native  boolean argInfoMayBeNull (gobject.internals.UnmappedPointer arg0);

public final static native  boolean callableInfoCanThrowGerror (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long callableInfoGetArg (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  java.lang.Long callableInfoGetCallerOwns (gobject.internals.UnmappedPointer arg0);

public final static native  int callableInfoGetNArgs (gobject.internals.UnmappedPointer arg0);

public final static native  int callableInfoGetReturnAttribute (gobject.internals.UnmappedPointer arg0, com.sun.jna.ptr.IntByReference arg1);

public final static native  java.lang.Long callableInfoGetReturnType (gobject.internals.UnmappedPointer arg0);

public final static native  boolean callableInfoInvoke (gobject.internals.UnmappedPointer arg0, com.sun.jna.Pointer arg1, gobject.internals.UnmappedPointer arg2, int arg3, gobject.internals.UnmappedPointer arg4, int arg5, gobject.internals.UnmappedPointer arg6, boolean arg7, boolean arg8);

public final static native  boolean callableInfoIsMethod (gobject.internals.UnmappedPointer arg0);

public final static native  boolean callableInfoIterateReturnAttributes (gobject.internals.UnmappedPointer arg0, gobject.internals.UnmappedPointer arg1, com.sun.jna.ptr.IntByReference arg2, com.sun.jna.ptr.IntByReference arg3);

public final static native  void callableInfoLoadArg (gobject.internals.UnmappedPointer arg0, int arg1, gobject.internals.UnmappedPointer arg2);

public final static native  void callableInfoLoadReturnType (gobject.internals.UnmappedPointer arg0, gobject.internals.UnmappedPointer arg1);

public final static native  boolean callableInfoMayReturnNull (gobject.internals.UnmappedPointer arg0);

public final static native  boolean callableInfoSkipReturn (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long constantInfoGetType (gobject.internals.UnmappedPointer arg0);

public final static native  int enumInfoGetErrorDomain (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long enumInfoGetMethod (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  int enumInfoGetNMethods (gobject.internals.UnmappedPointer arg0);

public final static native  int enumInfoGetNValues (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long enumInfoGetStorageType (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long enumInfoGetValue (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  java.lang.Long fieldInfoGetFlags (gobject.internals.UnmappedPointer arg0);

public final static native  int fieldInfoGetOffset (gobject.internals.UnmappedPointer arg0);

public final static native  int fieldInfoGetSize (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long fieldInfoGetType (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long functionInfoGetFlags (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long functionInfoGetProperty (gobject.internals.UnmappedPointer arg0);

public final static native  int functionInfoGetSymbol (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long functionInfoGetVfunc (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long infoNew (long arg0, gobject.internals.UnmappedPointer arg1, gobject.internals.UnmappedPointer arg2, int arg3);

public final static native  int infoTypeToString (long arg0);

public final static native  java.lang.Long interfaceInfoFindMethod (gobject.internals.UnmappedPointer arg0, com.sun.jna.ptr.IntByReference arg1);

public final static native  java.lang.Long interfaceInfoFindSignal (gobject.internals.UnmappedPointer arg0, com.sun.jna.ptr.IntByReference arg1);

public final static native  java.lang.Long interfaceInfoFindVfunc (gobject.internals.UnmappedPointer arg0, com.sun.jna.ptr.IntByReference arg1);

public final static native  java.lang.Long interfaceInfoGetConstant (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  java.lang.Long interfaceInfoGetIfaceStruct (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long interfaceInfoGetMethod (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  int interfaceInfoGetNConstants (gobject.internals.UnmappedPointer arg0);

public final static native  int interfaceInfoGetNMethods (gobject.internals.UnmappedPointer arg0);

public final static native  int interfaceInfoGetNPrerequisites (gobject.internals.UnmappedPointer arg0);

public final static native  int interfaceInfoGetNProperties (gobject.internals.UnmappedPointer arg0);

public final static native  int interfaceInfoGetNSignals (gobject.internals.UnmappedPointer arg0);

public final static native  int interfaceInfoGetNVfuncs (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long interfaceInfoGetPrerequisite (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  java.lang.Long interfaceInfoGetProperty (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  java.lang.Long interfaceInfoGetSignal (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  java.lang.Long interfaceInfoGetVfunc (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  int invokeErrorQuark ();

public final static native  java.lang.Long objectInfoFindMethod (gobject.internals.UnmappedPointer arg0, com.sun.jna.ptr.IntByReference arg1);

public final static native  java.lang.Long objectInfoFindMethodUsingInterfaces (gobject.internals.UnmappedPointer arg0, com.sun.jna.ptr.IntByReference arg1, gobject.internals.UnmappedPointer arg2);

public final static native  java.lang.Long objectInfoFindVfunc (gobject.internals.UnmappedPointer arg0, com.sun.jna.ptr.IntByReference arg1);

public final static native  java.lang.Long objectInfoFindVfuncUsingInterfaces (gobject.internals.UnmappedPointer arg0, com.sun.jna.ptr.IntByReference arg1, gobject.internals.UnmappedPointer arg2);

public final static native  boolean objectInfoGetAbstract (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long objectInfoGetClassStruct (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long objectInfoGetConstant (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  java.lang.Long objectInfoGetField (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  boolean objectInfoGetFundamental (gobject.internals.UnmappedPointer arg0);

public final static native  int objectInfoGetGetValueFunction (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long objectInfoGetInterface (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  java.lang.Long objectInfoGetMethod (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  int objectInfoGetNConstants (gobject.internals.UnmappedPointer arg0);

public final static native  int objectInfoGetNFields (gobject.internals.UnmappedPointer arg0);

public final static native  int objectInfoGetNInterfaces (gobject.internals.UnmappedPointer arg0);

public final static native  int objectInfoGetNMethods (gobject.internals.UnmappedPointer arg0);

public final static native  int objectInfoGetNProperties (gobject.internals.UnmappedPointer arg0);

public final static native  int objectInfoGetNSignals (gobject.internals.UnmappedPointer arg0);

public final static native  int objectInfoGetNVfuncs (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long objectInfoGetParent (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long objectInfoGetProperty (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  int objectInfoGetRefFunction (gobject.internals.UnmappedPointer arg0);

public final static native  int objectInfoGetSetValueFunction (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long objectInfoGetSignal (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  int objectInfoGetTypeInit (gobject.internals.UnmappedPointer arg0);

public final static native  int objectInfoGetTypeName (gobject.internals.UnmappedPointer arg0);

public final static native  int objectInfoGetUnrefFunction (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long objectInfoGetVfunc (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  java.lang.Long propertyInfoGetFlags (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long propertyInfoGetOwnershipTransfer (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long propertyInfoGetType (gobject.internals.UnmappedPointer arg0);

public final static native  int registeredTypeInfoGetGType (gobject.internals.UnmappedPointer arg0);

public final static native  int registeredTypeInfoGetTypeInit (gobject.internals.UnmappedPointer arg0);

public final static native  int registeredTypeInfoGetTypeName (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long signalInfoGetClassClosure (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long signalInfoGetFlags (gobject.internals.UnmappedPointer arg0);

public final static native  boolean signalInfoTrueStopsEmit (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long structInfoFindMethod (gobject.internals.UnmappedPointer arg0, com.sun.jna.ptr.IntByReference arg1);

public final static native  long structInfoGetAlignment (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long structInfoGetField (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  java.lang.Long structInfoGetMethod (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  int structInfoGetNFields (gobject.internals.UnmappedPointer arg0);

public final static native  int structInfoGetNMethods (gobject.internals.UnmappedPointer arg0);

public final static native  long structInfoGetSize (gobject.internals.UnmappedPointer arg0);

public final static native  boolean structInfoIsForeign (gobject.internals.UnmappedPointer arg0);

public final static native  boolean structInfoIsGtypeStruct (gobject.internals.UnmappedPointer arg0);

public final static native  int typeInfoGetArrayFixedSize (gobject.internals.UnmappedPointer arg0);

public final static native  int typeInfoGetArrayLength (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long typeInfoGetArrayType (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long typeInfoGetInterface (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long typeInfoGetParamType (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  java.lang.Long typeInfoGetTag (gobject.internals.UnmappedPointer arg0);

public final static native  boolean typeInfoIsPointer (gobject.internals.UnmappedPointer arg0);

public final static native  boolean typeInfoIsZeroTerminated (gobject.internals.UnmappedPointer arg0);

public final static native  int typeTagToString (long arg0);

public final static native  java.lang.Long unionInfoFindMethod (gobject.internals.UnmappedPointer arg0, com.sun.jna.ptr.IntByReference arg1);

public final static native  long unionInfoGetAlignment (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long unionInfoGetDiscriminator (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  int unionInfoGetDiscriminatorOffset (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long unionInfoGetDiscriminatorType (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long unionInfoGetField (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  java.lang.Long unionInfoGetMethod (gobject.internals.UnmappedPointer arg0, int arg1);

public final static native  int unionInfoGetNFields (gobject.internals.UnmappedPointer arg0);

public final static native  int unionInfoGetNMethods (gobject.internals.UnmappedPointer arg0);

public final static native  long unionInfoGetSize (gobject.internals.UnmappedPointer arg0);

public final static native  boolean unionInfoIsDiscriminated (gobject.internals.UnmappedPointer arg0);

public final static native  long valueInfoGetValue (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long vfuncInfoGetFlags (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long vfuncInfoGetInvoker (gobject.internals.UnmappedPointer arg0);

public final static native  int vfuncInfoGetOffset (gobject.internals.UnmappedPointer arg0);

public final static native  java.lang.Long vfuncInfoGetSignal (gobject.internals.UnmappedPointer arg0);

public final class Internals extends java.lang.Object  {

public Internals ();


}


}

