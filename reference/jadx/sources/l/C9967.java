package l;

/* JADX INFO: renamed from: l.ۤ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: AARL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9967 implements InterfaceC18433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f34072;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f34073;

    @Override // l.InterfaceC18433
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1029() {
        return true;
    }

    public C9967(int i, int i2) {
        this.f34073 = i;
        this.f34072 = i2;
    }

    public final int hashCode() {
        return C4758.m13213(C4758.m13217(C4758.m13217(C4758.m13217(0, EnumC19139.CUSTOM.ordinal()), this.f34073), this.f34072), 3);
    }

    @Override // l.InterfaceC18433
    /* JADX INFO: renamed from: ۙ */
    public final void mo1028(AbstractC1415 abstractC1415) {
        abstractC1415.mo5090(this.f34073, this.f34072);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9967)) {
            return false;
        }
        C9967 c9967 = (C9967) obj;
        return this.f34073 == c9967.f34073 && this.f34072 == c9967.f34072;
    }
}
