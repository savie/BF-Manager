package l;

/* JADX INFO: renamed from: l.۫ᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8DH */
/* JADX INFO: loaded from: classes4.dex */
public final class C12577 extends AbstractC21803 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f42045;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f42046;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public short[] f42047;

    @Override // l.AbstractC21803
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double mo31293(int i, double d) {
        return 1.0d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12577(short[] sArr) {
        super(3);
        int length = sArr.length;
        this.f42046 = 1;
        short[] sArr2 = new short[length];
        this.f42047 = sArr2;
        this.f42045 = length;
        this.f42046 = 1;
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
    }

    @Override // l.AbstractC21803
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo31295() {
        return this.f42045;
    }

    @Override // l.AbstractC21803
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo31294() {
        return this.f42046;
    }

    @Override // l.AbstractC21803
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double mo31292(int i) {
        short s = this.f42047[i];
        int i2 = C3403.f12551;
        return ((double) s) * 3.051850947599719E-5d;
    }
}
