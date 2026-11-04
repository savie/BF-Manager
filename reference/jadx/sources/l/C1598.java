package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֫֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39IB */
/* JADX INFO: loaded from: classes3.dex */
public final class C1598 extends AbstractC17259 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f5497;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean[] f5498;

    public C1598() {
        throw null;
    }

    public C1598(AbstractC15877 abstractC15877, byte[] bArr, int i) {
        super(abstractC15877, bArr);
        this.f5497 = i;
        int length = (bArr.length * 8) - i;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = true;
            if ((bArr[i2 / 8] & (1 << (7 - (i2 % 8)))) == 0) {
                z = false;
            }
            zArr[i2] = z;
        }
        this.f5498 = zArr;
    }

    @Override // l.AbstractC4691
    public final Object getValue() {
        boolean[] zArr = this.f5498;
        return Arrays.copyOf(zArr, zArr.length);
    }

    @Override // l.AbstractC4691
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String mo5610() {
        return Arrays.toString(this.f5498);
    }
}
