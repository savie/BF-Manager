package l;

/* JADX INFO: renamed from: l.᩷֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CAT9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20550 implements InterfaceC18433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f66548;

    @Override // l.InterfaceC18433
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1029() {
        return false;
    }

    public C20550(int i) {
        this.f66548 = i;
    }

    public final int hashCode() {
        return C4758.m13213(C4758.m13217(C4758.m13217(0, EnumC19139.MODE.ordinal()), this.f66548), 2);
    }

    @Override // l.InterfaceC18433
    /* JADX INFO: renamed from: ۙ */
    public final void mo1028(AbstractC1415 abstractC1415) {
        abstractC1415.f5847 = this.f66548;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20550) {
            return this.f66548 == ((C20550) obj).f66548;
        }
        return false;
    }

    public final String toString() {
        return String.format("mode(%d)", Integer.valueOf(this.f66548));
    }
}
