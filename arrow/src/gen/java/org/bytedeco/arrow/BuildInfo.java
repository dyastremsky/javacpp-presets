// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BuildInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BuildInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BuildInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BuildInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BuildInfo position(long position) {
        return (BuildInfo)super.position(position);
    }
    @Override public BuildInfo getPointer(long i) {
        return new BuildInfo((Pointer)this).offsetAddress(i);
    }

  /** The packed version number, e.g. 1002003 (decimal) for Arrow 1.2.3 */
  public native int version(); public native BuildInfo version(int setter);
  /** The "major" version number, e.g. 1 for Arrow 1.2.3 */
  public native int version_major(); public native BuildInfo version_major(int setter);
  /** The "minor" version number, e.g. 2 for Arrow 1.2.3 */
  public native int version_minor(); public native BuildInfo version_minor(int setter);
  /** The "patch" version number, e.g. 3 for Arrow 1.2.3 */
  public native int version_patch(); public native BuildInfo version_patch(int setter);
  /** The version string, e.g. "1.2.3" */
  public native @StdString String version_string(); public native BuildInfo version_string(String setter);
  public native @StdString String so_version(); public native BuildInfo so_version(String setter);
  public native @StdString String full_so_version(); public native BuildInfo full_so_version(String setter);
  public native @StdString String compiler_id(); public native BuildInfo compiler_id(String setter);
  public native @StdString String compiler_version(); public native BuildInfo compiler_version(String setter);
  public native @StdString String compiler_flags(); public native BuildInfo compiler_flags(String setter);
  public native @StdString String git_id(); public native BuildInfo git_id(String setter);
  public native @StdString String git_description(); public native BuildInfo git_description(String setter);
  public native @StdString String package_kind(); public native BuildInfo package_kind(String setter);
}
