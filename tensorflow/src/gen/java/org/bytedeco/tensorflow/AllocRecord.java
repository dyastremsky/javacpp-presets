// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// TrackingAllocator is a wrapper for an Allocator. It keeps a running
// count of the number of bytes allocated through the wrapper. It is
// used by the Executor to "charge" allocations to particular Op
// executions. Each Op gets a separate TrackingAllocator wrapper
// around the underlying allocator.
//
// The implementation assumes the invariant that all calls to
// AllocateRaw by an Op (or work items spawned by the Op) will occur
// before the Op's Compute method returns. Thus the high watermark is
// established once Compute returns.
//
// DeallocateRaw can be called long after the Op has finished,
// e.g. when an output tensor is deallocated, and the wrapper cannot
// be deleted until the last of these calls has occurred.  The
// TrackingAllocator keeps track of outstanding calls using a
// reference count, and deletes itself once the last call has been
// received and the high watermark has been retrieved.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AllocRecord extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AllocRecord(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AllocRecord(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AllocRecord position(long position) {
        return (AllocRecord)super.position(position);
    }
    @Override public AllocRecord getPointer(long i) {
        return new AllocRecord((Pointer)this).offsetAddress(i);
    }

  public AllocRecord(@Cast("tensorflow::int64") long a_btyes, @Cast("tensorflow::int64") long a_micros) { super((Pointer)null); allocate(a_btyes, a_micros); }
  private native void allocate(@Cast("tensorflow::int64") long a_btyes, @Cast("tensorflow::int64") long a_micros);
  public AllocRecord() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @Cast("tensorflow::int64") long alloc_bytes(); public native AllocRecord alloc_bytes(long setter);
  public native @Cast("tensorflow::int64") long alloc_micros(); public native AllocRecord alloc_micros(long setter);
}
