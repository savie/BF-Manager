package l;

/* JADX INFO: renamed from: l.ܺۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBG5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15774 extends AbstractC17806 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f51084;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f51085;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f51086;

    public C15774(EnumC7306 enumC7306, int i, int i2, int i3, int i4, int i5) {
        super(enumC7306, i, i2, 0, 0L);
        if (i5 != ((short) i5)) {
            throw new IllegalArgumentException(C8479.m22141(i5, "protoIndex doesn't fit in a short: "));
        }
        this.f51085 = i3;
        this.f51084 = i4;
        this.f51086 = i5;
    }

    @Override // l.AbstractC17806
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1687() {
        return this.f51084;
    }

    @Override // l.AbstractC17806
    /* JADX INFO: renamed from: ۨ */
    public final int mo20931() {
        return this.f51085;
    }

    @Override // l.AbstractC17806
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final short mo37516() {
        return (short) this.f51086;
    }
}
