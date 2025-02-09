// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief A Scalar value for ExtensionType
 * 
 *  The value is the underlying storage scalar.
 *  {@code is_valid} must only be true if {@code value} is non-null and {@code value->is_valid} is true */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ExtensionScalar extends Scalar {
    static { Loader.load(); }

  
  
    public ExtensionScalar(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(type); }
    private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExtensionScalar(Pointer p) { super(p); }


  public ExtensionScalar(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Scalar>"}) Scalar storage, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(storage, type); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Scalar>"}) Scalar storage, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Scalar>"}) Scalar value(); public native ExtensionScalar value(Scalar setter);
}
