package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5VI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9669 extends C11080 implements Iterable {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14608 m24573(int i) {
        C16724 c16724 = this.f37606;
        return new C14608(c16724, (C23780) c16724.f53557[this.f37610], (int) ((((long) i) * this.f37607) + this.f37608));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1906(this);
    }
}
