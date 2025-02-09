// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** A class that reads an entire CSV file into a Arrow Table */
@Namespace("arrow::csv") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class TableReader extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TableReader(Pointer p) { super(p); }


  /** Read the entire CSV file and convert it to a Arrow Table */
  public native @ByVal TableResult Read();
  /** Read the entire CSV file and convert it to a Arrow Table */
  public native @ByVal TableFuture ReadAsync();

  /** Create a TableReader instance */
  public static native @ByVal TableReaderResult Make(@ByVal IOContext io_context,
                                                     @SharedPtr @Cast({"", "std::shared_ptr<arrow::io::InputStream>"}) InputStream input,
                                                     @Const @ByRef ReadOptions arg2,
                                                     @Const @ByRef CsvParseOptions arg3,
                                                     @Const @ByRef ConvertOptions arg4);

  public static native @Deprecated @ByVal TableReaderResult Make(
        MemoryPool pool, @ByVal IOContext io_context, @SharedPtr @Cast({"", "std::shared_ptr<arrow::io::InputStream>"}) InputStream input,
        @Const @ByRef ReadOptions arg3, @Const @ByRef CsvParseOptions arg4, @Const @ByRef ConvertOptions arg5);
}
