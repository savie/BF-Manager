package l;

/* JADX INFO: renamed from: l.ܰۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBDP */
/* JADX INFO: loaded from: classes4.dex */
public final class C13533 implements InterfaceC4919 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f44690;

    @Override // l.InterfaceC4919
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC4919 mo9835() {
        return this;
    }

    @Override // l.InterfaceC4919
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo9847() {
        return false;
    }

    public C13533(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("subroutineAddress < 0");
        }
        this.f44690 = i;
    }

    public final String toString() {
        return "<addr:" + C22475.m49982(this.f44690) + ">";
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return toString();
    }

    @Override // l.InterfaceC4919
    public final C3320 getType() {
        return C3320.f12288;
    }

    @Override // l.InterfaceC4919
    /* JADX INFO: renamed from: ۚ */
    public final int mo9834() {
        return C3320.f12288.mo9834();
    }

    @Override // l.InterfaceC4919
    /* JADX INFO: renamed from: ۘ */
    public final int mo9831() {
        return C3320.f12288.mo9831();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13533) {
            return this.f44690 == ((C13533) obj).f44690;
        }
        return false;
    }

    public final int hashCode() {
        return this.f44690;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m33078() {
        return this.f44690;
    }
}
