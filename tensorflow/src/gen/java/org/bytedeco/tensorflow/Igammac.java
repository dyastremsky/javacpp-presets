// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Compute the upper regularized incomplete Gamma function {@code Q(a, x)}.
 * 
 *  The upper regularized incomplete Gamma function is defined as:
 * 
 *  \(Q(a, x) = Gamma(a, x) / Gamma(a) = 1 - P(a, x)\)
 * 
 *  where
 * 
 *  \(Gamma(a, x) = int_{x}^{\infty} t^{a-1} exp(-t) dt\)
 * 
 *  is the upper incomplete Gama function.
 * 
 *  Note, above {@code P(a, x)} ({@code Igamma}) is the lower regularized complete
 *  Gamma function.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The z tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Igammac extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Igammac(Pointer p) { super(p); }

  public Igammac(@Const @ByRef Scope scope, @ByVal Input a,
          @ByVal Input x) { super((Pointer)null); allocate(scope, a, x); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input a,
          @ByVal Input x);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Igammac operation(Operation setter);
  public native @ByRef Output z(); public native Igammac z(Output setter);
}
