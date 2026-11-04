package l;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ᩳۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: DBEE */
/* JADX INFO: loaded from: classes4.dex */
public final class C18777 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f60988;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f60989;

    public C18777(String str, int i) {
        this.f60989 = str;
        this.f60988 = i;
    }

    private final Object readResolve() {
        Pattern patternCompile = Pattern.compile(this.f60989, this.f60988);
        C15243.m36591(patternCompile, "compile(...)");
        return new C9826(patternCompile);
    }
}
