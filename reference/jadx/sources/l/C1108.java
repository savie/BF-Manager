package l;

/* JADX INFO: renamed from: l.֨۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z96X */
/* JADX INFO: loaded from: classes.dex */
public class C1108 extends C2519 {
    static {
        ApplicationC6132.m17119(17);
    }

    public native C1108(byte[] bArr, int i, int i2);

    public C1108(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    @Override // l.C5342
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo4125(int i) {
        if (i < 0) {
            return 0;
        }
        int[] iArr = this.f18448;
        if (i >= iArr.length) {
            return -this.f18450;
        }
        int i2 = iArr[(iArr.length - i) - 1];
        return this.f18450 >= 0 ? i2 * 31 : i2 ^ 31;
    }
}
