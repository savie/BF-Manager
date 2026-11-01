package l;

/* JADX INFO: renamed from: l.۫֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UASO */
/* JADX INFO: loaded from: classes4.dex */
public final class C12084 implements InterfaceC18433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f40441;

    @Override // l.InterfaceC18433
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1029() {
        return false;
    }

    public C12084(int i) {
        this.f40441 = i;
    }

    public final int hashCode() {
        return C4758.m13213(C4758.m13217(C4758.m13217(0, EnumC19139.TYPE.ordinal()), this.f40441), 2);
    }

    @Override // l.InterfaceC18433
    /* JADX INFO: renamed from: ۙ */
    public final void mo1028(AbstractC1415 abstractC1415) {
        abstractC1415.f5850 = this.f40441;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12084) {
            return this.f40441 == ((C12084) obj).f40441;
        }
        return false;
    }

    public final String toString() {
        return String.format("type(%d)", Integer.valueOf(this.f40441));
    }
}
