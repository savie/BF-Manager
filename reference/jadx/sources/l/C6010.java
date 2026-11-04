package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QIWT */
/* JADX INFO: loaded from: classes3.dex */
public final class C6010 implements InterfaceC4196 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f20572;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C6010(List list) {
        this.f20572 = list;
    }

    @Override // l.InterfaceC4196
    /* JADX INFO: renamed from: ۙ */
    public final void mo13405(C22815 c22815) {
        Iterator it = this.f20572.iterator();
        while (it.hasNext()) {
            ((C2281) it.next()).m7726(c22815);
        }
    }

    @Override // l.InterfaceC4196
    public final boolean isEmpty() {
        return this.f20572.isEmpty();
    }
}
