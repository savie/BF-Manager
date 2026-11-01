package l;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֡ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: DBEE */
/* JADX INFO: loaded from: classes2.dex */
public final class C0533 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f2282;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f2283;

    public C0533(String str, int i) {
        this.f2283 = str;
        this.f2282 = i;
    }

    private final Object readResolve() {
        Pattern patternCompile = Pattern.compile(this.f2283, this.f2282);
        C13465.m32967(patternCompile, "compile(...)");
        return new C16762(patternCompile);
    }
}
