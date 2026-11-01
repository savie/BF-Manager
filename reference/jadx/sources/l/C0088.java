package l;

/* JADX INFO: renamed from: l.֡֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2ASJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0088 implements InterfaceC18433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f1002;

    @Override // l.InterfaceC18433
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo1029() {
        return false;
    }

    public C0088(int i) {
        this.f1002 = i;
    }

    public final int hashCode() {
        return C4758.m13213(C4758.m13217(C4758.m13217(0, EnumC19139.PUSH_MODE.ordinal()), this.f1002), 2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0088) {
            return this.f1002 == ((C0088) obj).f1002;
        }
        return false;
    }

    public final String toString() {
        return String.format("pushMode(%d)", Integer.valueOf(this.f1002));
    }

    @Override // l.InterfaceC18433
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1028(AbstractC1415 abstractC1415) {
        abstractC1415.f5844.m14224(abstractC1415.f5847);
        abstractC1415.f5847 = this.f1002;
    }
}
