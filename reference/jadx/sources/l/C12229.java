package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 39IB */
/* JADX INFO: loaded from: classes4.dex */
public final class C12229 extends AbstractC23518 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean[] f40859;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f40860;

    public C12229() {
        throw null;
    }

    public C12229(AbstractC14676 abstractC14676, byte[] bArr, int i) {
        super(abstractC14676, bArr);
        this.f40860 = i;
        int length = (bArr.length * 8) - i;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = true;
            if ((bArr[i2 / 8] & (1 << (7 - (i2 % 8)))) == 0) {
                z = false;
            }
            zArr[i2] = z;
        }
        this.f40859 = zArr;
    }

    @Override // l.AbstractC9032
    public final Object getValue() {
        boolean[] zArr = this.f40859;
        return Arrays.copyOf(zArr, zArr.length);
    }

    @Override // l.AbstractC9032
    /* JADX INFO: renamed from: ۨ */
    public final String mo23363() {
        return Arrays.toString(this.f40859);
    }
}
