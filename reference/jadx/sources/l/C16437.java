package l;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ܽۚܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38N3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16437 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f52857 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38691(InterfaceC12204 interfaceC12204) {
        CopyOnWriteArrayList<C0208> copyOnWriteArrayList = this.f52857;
        for (C0208 c0208 : copyOnWriteArrayList) {
            if (c0208.f1371 == interfaceC12204) {
                c0208.m1556();
                copyOnWriteArrayList.remove(c0208);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38689(final long j, final int i, final long j2) {
        for (final C0208 c0208 : this.f52857) {
            if (!c0208.f1370) {
                c0208.f1369.post(new Runnable() { // from class: l.᩶ۚܰ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c0208.f1371.mo2629(j, i, j2);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38690(Handler handler, InterfaceC12204 interfaceC12204) {
        interfaceC12204.getClass();
        m38691(interfaceC12204);
        this.f52857.add(new C0208(handler, interfaceC12204));
    }
}
