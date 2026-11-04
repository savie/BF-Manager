package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ۢ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: MA0A */
/* JADX INFO: loaded from: classes4.dex */
public final class C10351 extends C0657 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C10351 f32969;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C10351 m26628() {
        return new C10351();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static synchronized C10351 m26627() {
        C10351 c10351;
        c10351 = f32969;
        if (c10351 == null) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                try {
                    c10351 = (C10351) C5261.f18538.submit(new CallableC19302()).get();
                    f32969 = c10351;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                try {
                    c10351 = new C10351();
                    f32969 = c10351;
                } catch (C20048 e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return c10351;
    }

    public C10351() {
        super(new C21540());
    }
}
