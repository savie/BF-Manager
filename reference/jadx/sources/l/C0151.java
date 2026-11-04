package l;

/* JADX INFO: renamed from: l.֡ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBBJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C0151 extends AbstractC5875 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC2519 f1146;

    @Override // l.InterfaceC1159
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo1345() {
        return 8;
    }

    public C0151(AbstractC2519 abstractC2519) {
        super("ConstantValue");
        if ((abstractC2519 instanceof C9976) || (abstractC2519 instanceof C15943) || (abstractC2519 instanceof C4011) || (abstractC2519 instanceof C17435) || (abstractC2519 instanceof C11468)) {
            this.f1146 = abstractC2519;
        } else {
            if (abstractC2519 == null) {
                throw new NullPointerException("constantValue == null");
            }
            throw new IllegalArgumentException("bad type for constantValue");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC2519 m1346() {
        return this.f1146;
    }
}
