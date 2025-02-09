// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief A Scalar value for DictionaryType
 * 
 *  {@code is_valid} denotes the validity of the {@code index}, regardless of
 *  the corresponding value in the {@code dictionary}. */
@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class DictionaryScalar extends PrimitiveScalarBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DictionaryScalar(Pointer p) { super(p); }


  public DictionaryScalar(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(type); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  public DictionaryScalar(@ByVal @Cast("arrow::DictionaryScalar::ValueType*") Pointer value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("bool") boolean is_valid/*=true*/) { super((Pointer)null); allocate(value, type, is_valid); }
  private native void allocate(@ByVal @Cast("arrow::DictionaryScalar::ValueType*") Pointer value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("bool") boolean is_valid/*=true*/);
  public DictionaryScalar(@ByVal @Cast("arrow::DictionaryScalar::ValueType*") Pointer value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(value, type); }
  private native void allocate(@ByVal @Cast("arrow::DictionaryScalar::ValueType*") Pointer value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  public static native @SharedPtr DictionaryScalar Make(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Scalar>"}) Scalar index,
                                                  @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array dict);

  public native @ByVal ScalarResult GetEncodedValue();

  public native Pointer mutable_data();
}
