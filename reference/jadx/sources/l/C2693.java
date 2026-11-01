package l;

/* JADX INFO: renamed from: l.ۖᩳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes3.dex */
public final class C2693 extends AbstractC23156 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f10382;

    @Override // l.AbstractC23156
    /* JADX INFO: renamed from: ۙ */
    public final void mo4166(InterfaceC6927 interfaceC6927) {
        interfaceC6927.mo7547(this);
    }

    public C2693(Object obj, AbstractC16579 abstractC16579) {
        super(abstractC16579);
        this.f10382 = obj;
    }

    @Override // l.InterfaceC11097
    public final String toString() {
        return C20104.m45469(this.f10382, this.f75167);
    }

    @Override // l.AbstractC23156, l.InterfaceC11097
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo8225(InterfaceC23797 interfaceC23797) {
        Object obj = this.f10382;
        if (obj instanceof String) {
            return Boolean.FALSE;
        }
        boolean z = obj instanceof Integer;
        AbstractC16579 abstractC16579 = this.f75167;
        if (z) {
            int i = C3503.f12822[abstractC16579.mo1933().ordinal()];
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
        int i2 = C3503.f12822[abstractC16579.mo1933().ordinal()];
        if (i2 == 6) {
            ((Long) obj).getClass();
            return Boolean.FALSE;
        }
        if (i2 == 7) {
            ((Float) obj).getClass();
            return Boolean.FALSE;
        }
        if (i2 != 8) {
            throw new AssertionError(C9023.m23354(obj, "Bad annotation element value: "));
        }
        ((Double) obj).getClass();
        return Boolean.FALSE;
    }
}
