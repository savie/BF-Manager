package l;

/* JADX INFO: renamed from: l.ܳ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8DH */
/* JADX INFO: loaded from: classes5.dex */
public final class C14999 extends AbstractC8909 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f49005;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public short[] f49006;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f49007;

    @Override // l.AbstractC8909
    /* JADX INFO: renamed from: ۙ */
    public final double mo1151(int i, double d) {
        return 1.0d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14999(short[] sArr) {
        super(3);
        int length = sArr.length;
        this.f49005 = 1;
        short[] sArr2 = new short[length];
        this.f49006 = sArr2;
        this.f49007 = length;
        this.f49005 = 1;
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
    }

    @Override // l.AbstractC8909
    /* JADX INFO: renamed from: ᩷ */
    public final int mo23821() {
        return this.f49007;
    }

    @Override // l.AbstractC8909
    /* JADX INFO: renamed from: ۙ */
    public final int mo1152() {
        return this.f49005;
    }

    @Override // l.AbstractC8909
    /* JADX INFO: renamed from: ۙ */
    public final double mo1150(int i) {
        short s = this.f49006[i];
        int i2 = C15745.f51194;
        return ((double) s) * 3.051850947599719E-5d;
    }
}
