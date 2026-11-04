package l;

/* JADX INFO: renamed from: l.ۗ᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes3.dex */
public final class C3754 extends AbstractC21654 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f12872;

    @Override // l.AbstractC21654
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12192(InterfaceC14940 interfaceC14940) {
        interfaceC14940.mo18301(this);
    }

    public C3754(Object obj, AbstractC22664 abstractC22664) {
        super(abstractC22664);
        this.f12872 = obj;
    }

    @Override // l.InterfaceC19466
    public final String toString() {
        return C8257.m22249(this.f12872, this.f69124);
    }

    @Override // l.AbstractC21654, l.InterfaceC19466
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo12191(InterfaceC14990 interfaceC14990) {
        Object obj = this.f12872;
        if (obj instanceof String) {
            return Boolean.FALSE;
        }
        boolean z = obj instanceof Integer;
        AbstractC22664 abstractC22664 = this.f69124;
        if (z) {
            int i = C17178.f55992[abstractC22664.mo9097().ordinal()];
            if (i == 1) {
                return Boolean.FALSE;
            }
            if (i == 2) {
                return Boolean.FALSE;
            }
            if (i == 3) {
                return Boolean.FALSE;
            }
            if (i == 4) {
                return Boolean.FALSE;
            }
            if (i == 5) {
                return Boolean.FALSE;
            }
        }
        int i2 = C17178.f55992[abstractC22664.mo9097().ordinal()];
        if (i2 == 6) {
            ((Long) obj).getClass();
            return Boolean.FALSE;
        }
        if (i2 == 7) {
            ((Float) obj).getClass();
            return Boolean.FALSE;
        }
        if (i2 != 8) {
            throw new AssertionError(C14483.m34971("Bad annotation element value: ", obj));
        }
        ((Double) obj).getClass();
        return Boolean.FALSE;
    }
}
