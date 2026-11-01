package l;

import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: l.ᩴ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18621 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8038 f60379;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f60380;

    public RunnableC18621(C8038 c8038, DialogInterfaceC19356 dialogInterfaceC19356) {
        this.f60379 = c8038;
        this.f60380 = dialogInterfaceC19356;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f60380.m44375()) {
            C8038 c8038 = this.f60379;
            SimpleDateFormat simpleDateFormat = c8038.f28142;
            if (simpleDateFormat != null) {
                c8038.m40347(simpleDateFormat.format(Long.valueOf(System.currentTimeMillis())));
            }
            C16737.m39267(1000L, this);
        }
    }
}
