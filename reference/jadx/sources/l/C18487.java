package l;

/* JADX INFO: renamed from: l.ܿܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBG5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18487 extends AbstractC3659 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f60163;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f60164;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f60165;

    public C18487(EnumC14757 enumC14757, int i, int i2, int i3, int i4, int i5) {
        super(enumC14757, i, i2, 0, 0L);
        if (i5 != ((short) i5)) {
            throw new IllegalArgumentException(C13645.m33382(i5, "protoIndex doesn't fit in a short: "));
        }
        this.f60165 = i3;
        this.f60163 = i4;
        this.f60164 = i5;
    }

    @Override // l.AbstractC3659
    /* JADX INFO: renamed from: ᩹ */
    public final int mo2678() {
        return this.f60163;
    }

    @Override // l.AbstractC3659
    /* JADX INFO: renamed from: ۤ */
    public final int mo4904() {
        return this.f60165;
    }

    @Override // l.AbstractC3659
    /* JADX INFO: renamed from: ܶ */
    public final short mo11862() {
        return (short) this.f60164;
    }
}
