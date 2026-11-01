package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ۚܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: MA0A */
/* JADX INFO: loaded from: classes3.dex */
public final class C5431 extends C13899 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C5431 f18747;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C5431 m15010() {
        return new C5431();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static synchronized C5431 m15009() {
        C5431 c5431;
        c5431 = f18747;
        if (c5431 == null) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                try {
                    c5431 = (C5431) C4716.f16635.submit(new CallableC2608()).get();
                    f18747 = c5431;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                try {
                    c5431 = new C5431();
                    f18747 = c5431;
                } catch (C8484 e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return c5431;
    }

    public C5431() {
        super(new C3543());
    }
}
