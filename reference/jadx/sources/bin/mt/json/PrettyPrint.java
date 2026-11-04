package bin.mt.json;

import java.io.Writer;
import java.util.Arrays;
import l.C1486;
import l.C2977;

/* JADX INFO: loaded from: classes.dex */
public class PrettyPrint extends WriterConfig {
    public final char[] indentChars;

    public PrettyPrint(char[] cArr) {
        this.indentChars = cArr;
    }

    public static PrettyPrint singleLine() {
        return new PrettyPrint(null);
    }

    public static PrettyPrint indentWithSpaces(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("number is negative");
        }
        char[] cArr = new char[i];
        Arrays.fill(cArr, ' ');
        return new PrettyPrint(cArr);
    }

    public static PrettyPrint indentWithTabs() {
        return new PrettyPrint(new char[]{'\t'});
    }

    @Override // bin.mt.json.WriterConfig
    public C1486 createWriter(Writer writer) {
        return new C2977(writer, this.indentChars);
    }
}
