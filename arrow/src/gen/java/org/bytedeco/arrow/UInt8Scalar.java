// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class UInt8Scalar extends BaseUInt8Type {
    static { Loader.load(); }

  
  
    public UInt8Scalar(@Cast("arrow::NumericScalar<arrow::UInt8Type>::ValueType") byte value) { super((Pointer)null); allocate(value); }
    private native void allocate(@Cast("arrow::NumericScalar<arrow::UInt8Type>::ValueType") byte value);
  
    public UInt8Scalar() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UInt8Scalar(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public UInt8Scalar(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public UInt8Scalar position(long position) {
        return (UInt8Scalar)super.position(position);
    }
    @Override public UInt8Scalar getPointer(long i) {
        return new UInt8Scalar((Pointer)this).offsetAddress(i);
    }

}
