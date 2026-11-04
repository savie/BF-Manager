package l;

/* JADX INFO: renamed from: l.᩶ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB9Z */
/* JADX INFO: loaded from: classes.dex */
public final class C21471 extends AbstractC3659 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f68582;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f68583;

    public C21471(EnumC14757 enumC14757, int i, int i2, int i3, int[] iArr) {
        super(enumC14757, i, i2, 0, 0L);
        if (i3 != ((short) i3)) {
            throw new IllegalArgumentException(C13645.m33382(i3, "protoIndex doesn't fit in a short: "));
        }
        this.f68583 = i3;
        this.f68582 = iArr;
    }

    @Override // l.AbstractC3659
    /* JADX INFO: renamed from: ᩹ */
    public final int mo2678() {
        return this.f68582.length;
    }

    @Override // l.AbstractC3659
    /* JADX INFO: renamed from: ۤ */
    public final int mo4904() {
        int[] iArr = this.f68582;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return 0;
    }

    @Override // l.AbstractC3659
    /* JADX INFO: renamed from: ᩸ */
    public final int mo11867() {
        int[] iArr = this.f68582;
        if (iArr.length > 1) {
            return iArr[1];
        }
        return 0;
    }

    @Override // l.AbstractC3659
    /* JADX INFO: renamed from: ᩴ */
    public final int mo11865() {
        int[] iArr = this.f68582;
        if (iArr.length > 2) {
            return iArr[2];
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int m48828() {
        int[] iArr = this.f68582;
        if (iArr.length > 3) {
            return iArr[3];
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m48829() {
        int[] iArr = this.f68582;
        if (iArr.length > 4) {
            return iArr[4];
        }
        return 0;
    }

    @Override // l.AbstractC3659
    /* JADX INFO: renamed from: ܶ */
    public final short mo11862() {
        return (short) this.f68583;
    }
}
