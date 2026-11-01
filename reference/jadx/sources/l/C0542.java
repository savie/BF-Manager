package l;

import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.֡ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N5OE */
/* JADX INFO: loaded from: classes2.dex */
public final class C0542 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] f2294;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[][] f2295;

    public C0542(C13825 c13825) {
        c13825.m33642();
        c13825.m33642();
        c13825.m33642();
        int iM33642 = c13825.m33642();
        this.f2294 = new String[iM33642];
        this.f2295 = new byte[iM33642][];
        for (int i = 0; i < iM33642; i++) {
            int iM33643 = c13825.m33642();
            try {
                this.f2294[i] = new String(c13825.m33646(iM33643), 0, iM33643 - 1, "US-ASCII");
                this.f2295[i] = c13825.m33646(20);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
