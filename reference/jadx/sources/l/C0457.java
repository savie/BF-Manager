package l;

/* JADX INFO: renamed from: l.֡ܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBBJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C0457 extends AbstractC1100 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC23783 f2071;

    @Override // l.InterfaceC5771
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo2281() {
        return 8;
    }

    public C0457(AbstractC23783 abstractC23783) {
        super("ConstantValue");
        if ((abstractC23783 instanceof C17432) || (abstractC23783 instanceof C21665) || (abstractC23783 instanceof C7554) || (abstractC23783 instanceof C15316) || (abstractC23783 instanceof C4025)) {
            this.f2071 = abstractC23783;
        } else {
            if (abstractC23783 == null) {
                throw new NullPointerException("constantValue == null");
            }
            throw new IllegalArgumentException("bad type for constantValue");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC23783 m2282() {
        return this.f2071;
    }
}
