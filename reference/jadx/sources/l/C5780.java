package l;

import bin.mt.plus.R;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۛۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66VE */
/* JADX INFO: loaded from: classes2.dex */
public final class C5780 {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m15915(C6222 c6222) throws C22356 {
        m15912();
        boolean zFind = c6222.find();
        m15913(c6222);
        return zFind;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15914(C6222 c6222, int i) throws C22356 {
        m15912();
        boolean zFind = c6222.find(i);
        m15913(c6222);
        return zFind;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15913(C6222 c6222) throws C22356 {
        m15912();
        if (c6222.m17270()) {
            throw new C22356(R.string.MT_Protector);
        }
        if (c6222.m17258()) {
            throw new C22356(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15912() {
        if (Thread.currentThread().isInterrupted()) {
            throw new CancellationException("Search canceled");
        }
    }
}
