package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ۨ۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes3.dex */
public final class C11696 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f39315 = new ArrayDeque();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f39316 = new ArrayDeque();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C13813 m29206() {
        C13813 c13813 = (C13813) this.f39316.removeFirst();
        this.f39315.push(c13813);
        return c13813;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13813 m29207() {
        return (C13813) this.f39316.peekFirst();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29205() {
        return this.f39316.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29204(int i, int i2, long j) {
        C13813 c13813;
        ArrayDeque arrayDeque = this.f39315;
        if (!arrayDeque.isEmpty()) {
            c13813 = (C13813) arrayDeque.pop();
        } else {
            c13813 = new C13813();
            c13813.f45596 = j;
            c13813.f45594 = i;
            c13813.f45595 = i2;
        }
        c13813.f45596 = j;
        c13813.f45594 = i;
        c13813.f45595 = i2;
        this.f39316.addLast(c13813);
    }
}
