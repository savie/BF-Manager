package l;

import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: l.᩵֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC20220 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12015 f64900;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f64901;

    public RunnableC20220(C12015 c12015, DialogInterfaceC8327 dialogInterfaceC8327) {
        this.f64900 = c12015;
        this.f64901 = dialogInterfaceC8327;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f64901.m22434()) {
            C12015 c12015 = this.f64900;
            SimpleDateFormat simpleDateFormat = c12015.f38746;
            if (simpleDateFormat != null) {
                c12015.m22954(simpleDateFormat.format(Long.valueOf(System.currentTimeMillis())));
            }
            C21576.m49062(1000L, this);
        }
    }
}
