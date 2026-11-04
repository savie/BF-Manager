package l;

/* JADX INFO: renamed from: l.᩻ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z96X */
/* JADX INFO: loaded from: classes.dex */
public class C24800 extends C5408 {
    static {
        ApplicationC23172.m52091(171);
    }

    public native C24800(byte[] bArr, int i, int i2);

    public C24800(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    @Override // l.C1679
    /* JADX INFO: renamed from: ᩷ */
    public final int mo6024(int i) {
        if (i < 0) {
            return 0;
        }
        int[] iArr = this.f5785;
        if (i >= iArr.length) {
            return -this.f5783;
        }
        int i2 = iArr[(iArr.length - i) - 1];
        return this.f5783 >= 0 ? i2 * 31 : i2 ^ 31;
    }
}
