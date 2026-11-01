package l;

/* JADX INFO: renamed from: l.ۡ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: PARF */
/* JADX INFO: loaded from: classes3.dex */
public final class C8556 implements InterfaceC18433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f29587;

    @Override // l.InterfaceC18433
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1029() {
        return false;
    }

    public C8556(int i) {
        this.f29587 = i;
    }

    public final int hashCode() {
        return C4758.m13213(C4758.m13217(C4758.m13217(0, EnumC19139.CHANNEL.ordinal()), this.f29587), 2);
    }

    @Override // l.InterfaceC18433
    /* JADX INFO: renamed from: ۙ */
    public final void mo1028(AbstractC1415 abstractC1415) {
        abstractC1415.f5843 = this.f29587;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8556) {
            return this.f29587 == ((C8556) obj).f29587;
        }
        return false;
    }

    public final String toString() {
        return String.format("channel(%d)", Integer.valueOf(this.f29587));
    }
}
