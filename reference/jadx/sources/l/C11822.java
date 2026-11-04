package l;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ۧᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 38N3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11822 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f38149 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29671(InterfaceC25249 interfaceC25249) {
        CopyOnWriteArrayList<C2128> copyOnWriteArrayList = this.f38149;
        for (C2128 c2128 : copyOnWriteArrayList) {
            if (c2128.f7008 == interfaceC25249) {
                c2128.m7327();
                copyOnWriteArrayList.remove(c2128);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29669(final long j, final int i, final long j2) {
        for (final C2128 c2128 : this.f38149) {
            if (!c2128.f7007) {
                c2128.f7006.post(new Runnable() { // from class: l.ۚᩴ᩷
                    @Override // java.lang.Runnable
                    public final void run() {
                        c2128.f7008.mo7253(j, i, j2);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29670(Handler handler, InterfaceC25249 interfaceC25249) {
        interfaceC25249.getClass();
        m29671(interfaceC25249);
        this.f38149.add(new C2128(handler, interfaceC25249));
    }
}
