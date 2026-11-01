package l;

/* JADX INFO: renamed from: l.᩷ۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB9Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C20712 extends AbstractC17806 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f67345;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f67346;

    public C20712(EnumC7306 enumC7306, int i, int i2, int i3, int[] iArr) {
        super(enumC7306, i, i2, 0, 0L);
        if (i3 != ((short) i3)) {
            throw new IllegalArgumentException(C8479.m22141(i3, "protoIndex doesn't fit in a short: "));
        }
        this.f67345 = i3;
        this.f67346 = iArr;
    }

    @Override // l.AbstractC17806
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1687() {
        return this.f67346.length;
    }

    @Override // l.AbstractC17806
    /* JADX INFO: renamed from: ۨ */
    public final int mo20931() {
        int[] iArr = this.f67346;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return 0;
    }

    @Override // l.AbstractC17806
    /* JADX INFO: renamed from: ۖ */
    public final int mo20929() {
        int[] iArr = this.f67346;
        if (iArr.length > 1) {
            return iArr[1];
        }
        return 0;
    }

    @Override // l.AbstractC17806
    /* JADX INFO: renamed from: ۚ */
    public final int mo20930() {
        int[] iArr = this.f67346;
        if (iArr.length > 2) {
            return iArr[2];
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m46563() {
        int[] iArr = this.f67346;
        if (iArr.length > 3) {
            return iArr[3];
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m46564() {
        int[] iArr = this.f67346;
        if (iArr.length > 4) {
            return iArr[4];
        }
        return 0;
    }

    @Override // l.AbstractC17806
    /* JADX INFO: renamed from: ᩳ */
    public final short mo37516() {
        return (short) this.f67345;
    }
}
