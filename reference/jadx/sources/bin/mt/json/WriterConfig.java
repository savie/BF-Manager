package bin.mt.json;

import java.io.Writer;
import l.C1486;
import l.C8943;

/* JADX INFO: loaded from: classes.dex */
public abstract class WriterConfig {
    public static WriterConfig MINIMAL = new C8943();
    public static WriterConfig PRETTY_PRINT = PrettyPrint.indentWithSpaces(2);

    public abstract C1486 createWriter(Writer writer);
}
