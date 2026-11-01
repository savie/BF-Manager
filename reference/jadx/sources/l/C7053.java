package l;

/* JADX INFO: renamed from: l.ۜ᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C7053 extends AbstractC23282 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23282 f23691;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC4230 f23692;

    public C7053(EnumC4230 enumC4230, AbstractC23282 abstractC23282) {
        this.f23692 = enumC4230;
        this.f23691 = abstractC23282;
    }

    public final String toString() {
        int iOrdinal = this.f23692.ordinal();
        if (iOrdinal == 0) {
            return "?";
        }
        AbstractC23282 abstractC23282 = this.f23691;
        if (iOrdinal == 1) {
            return "? extends " + abstractC23282;
        }
        if (iOrdinal == 2) {
            return "? super " + abstractC23282;
        }
        throw new AssertionError();
    }
}
