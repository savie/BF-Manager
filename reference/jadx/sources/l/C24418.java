package l;

/* JADX INFO: renamed from: l.᩺ܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes.dex */
public final class C24418 extends AbstractC4280 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC4280 f79285;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC6518 f79286;

    public C24418(EnumC6518 enumC6518, AbstractC4280 abstractC4280) {
        this.f79286 = enumC6518;
        this.f79285 = abstractC4280;
    }

    public final String toString() {
        int iOrdinal = this.f79286.ordinal();
        if (iOrdinal == 0) {
            return "?";
        }
        AbstractC4280 abstractC4280 = this.f79285;
        if (iOrdinal == 1) {
            return "? extends " + abstractC4280;
        }
        if (iOrdinal == 2) {
            return "? super " + abstractC4280;
        }
        throw new AssertionError();
    }
}
