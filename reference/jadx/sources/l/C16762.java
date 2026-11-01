package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܽܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: DBEE */
/* JADX INFO: loaded from: classes4.dex */
public final class C16762 implements Serializable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Pattern f53652;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39325(CharSequence charSequence) {
        C13465.m32966(charSequence, "input");
        return this.f53652.matcher(charSequence).matches();
    }

    public C16762(Pattern pattern) {
        this.f53652 = pattern;
    }

    public C16762(String str) {
        Pattern patternCompile = Pattern.compile(str);
        C13465.m32967(patternCompile, "compile(...)");
        this.f53652 = patternCompile;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m39324(String str) {
        String strReplaceAll = this.f53652.matcher(str).replaceAll("$1 $2");
        C13465.m32967(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.f53652.toString();
        C13465.m32967(string, "toString(...)");
        return string;
    }

    private final Object writeReplace() {
        Pattern pattern = this.f53652;
        String strPattern = pattern.pattern();
        C13465.m32967(strPattern, "pattern(...)");
        return new C0533(strPattern, pattern.flags());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
