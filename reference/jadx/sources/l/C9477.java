package l;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۢۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9477 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Executor f32071;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13751 f32072;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final WeakReference f32073;

    public C9477(C13751 c13751, C10793 c10793, Executor executor) {
        this.f32072 = c13751;
        this.f32073 = new WeakReference(c10793);
        this.f32071 = executor;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m24291() {
        return this.f32073.get() == null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24290() {
        this.f32071.execute(new Runnable() { // from class: l.֫ۡۙ
            @Override // java.lang.Runnable
            public final void run() {
                C9477.m24289(this.f6773);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24289(C9477 c9477) {
        InterfaceC14416 interfaceC14416 = (InterfaceC14416) c9477.f32073.get();
        if (interfaceC14416 != null) {
            interfaceC14416.mo27089(c9477.f32072.m33498());
        }
    }
}
