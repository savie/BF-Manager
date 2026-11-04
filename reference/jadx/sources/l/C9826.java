package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۢۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: DBEE */
/* JADX INFO: loaded from: classes3.dex */
public final class C9826 implements Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Pattern f31637;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25600(CharSequence charSequence) {
        C15243.m36590(charSequence, "input");
        return this.f31637.matcher(charSequence).matches();
    }

    public C9826(Pattern pattern) {
        this.f31637 = pattern;
    }

    public C9826(String str) {
        Pattern patternCompile = Pattern.compile(str);
        C15243.m36591(patternCompile, "compile(...)");
        this.f31637 = patternCompile;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m25599(String str) {
        String strReplaceAll = this.f31637.matcher(str).replaceAll("$1 $2");
        C15243.m36591(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.f31637.toString();
        C15243.m36591(string, "toString(...)");
        return string;
    }

    private final Object writeReplace() {
        Pattern pattern = this.f31637;
        String strPattern = pattern.pattern();
        C15243.m36591(strPattern, "pattern(...)");
        return new C18777(strPattern, pattern.flags());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
