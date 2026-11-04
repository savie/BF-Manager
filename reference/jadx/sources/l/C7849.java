package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.۟ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7I4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7849 implements InterfaceC5656 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f26142;

    public C7849(InterfaceC11621 interfaceC11621) {
        this.f26142 = interfaceC11621;
    }

    public C7849() {
        this.f26142 = new HashSet();
    }

    @Override // l.InterfaceC5656
    /* JADX INFO: renamed from: ۙ */
    public void mo9647(C21383 c21383) {
        InterfaceC11621 interfaceC11621 = (InterfaceC11621) this.f26142;
        c21383.m13508(interfaceC11621);
        c21383.m13521(interfaceC11621);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m21371(String str) {
        synchronized (((HashSet) this.f26142)) {
            while (((HashSet) this.f26142).contains(str)) {
                try {
                    ((HashSet) this.f26142).wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException("线程被中断", e);
                }
            }
            ((HashSet) this.f26142).add(str);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m21372(String str) {
        synchronized (((HashSet) this.f26142)) {
            ((HashSet) this.f26142).remove(str);
            ((HashSet) this.f26142).notifyAll();
        }
    }
}
