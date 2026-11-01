package l;

/* JADX INFO: renamed from: l.۟֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: EAS0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7144 implements InterfaceC18433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18433 f23883;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f23884;

    @Override // l.InterfaceC18433
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1029() {
        return true;
    }

    public C7144(int i, InterfaceC18433 interfaceC18433) {
        this.f23884 = i;
        this.f23883 = interfaceC18433;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m19049() {
        return this.f23884;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18433 m19050() {
        return this.f23883;
    }

    @Override // l.InterfaceC18433
    /* JADX INFO: renamed from: ۙ */
    public final void mo1028(AbstractC1415 abstractC1415) {
        this.f23883.mo1028(abstractC1415);
    }

    public final int hashCode() {
        return C4758.m13213(C4758.m13214(C4758.m13217(0, this.f23884), this.f23883), 2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7144)) {
            return false;
        }
        C7144 c7144 = (C7144) obj;
        return this.f23884 == c7144.f23884 && this.f23883.equals(c7144.f23883);
    }
}
