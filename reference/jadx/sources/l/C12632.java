package l;

import bin.mt.plus.R;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۨ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66VE */
/* JADX INFO: loaded from: classes4.dex */
public final class C12632 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m31399(C4245 c4245) throws C13464 {
        m31396();
        boolean zFind = c4245.find();
        m31397(c4245);
        return zFind;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31398(C4245 c4245, int i) throws C13464 {
        m31396();
        boolean zFind = c4245.find(i);
        m31397(c4245);
        return zFind;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31397(C4245 c4245) throws C13464 {
        m31396();
        if (c4245.m13557()) {
            throw new C13464(R.string.MT_Protector);
        }
        if (c4245.m13560()) {
            throw new C13464(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31396() {
        if (Thread.currentThread().isInterrupted()) {
            throw new CancellationException("Search canceled");
        }
    }
}
