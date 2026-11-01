package bin.mt.json;

import java.io.Writer;
import l.C2206;
import l.C4323;

/* JADX INFO: loaded from: classes.dex */
public abstract class WriterConfig {
    public static WriterConfig MINIMAL = new C2206();
    public static WriterConfig PRETTY_PRINT = PrettyPrint.indentWithSpaces(2);

    public abstract C4323 createWriter(Writer writer);
}
