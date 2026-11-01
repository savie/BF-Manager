package l;

import java.io.DataInputStream;

/* JADX INFO: renamed from: l.ܺۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7F3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15708 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f50982;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC16783 f50983;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f50984;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC0410 f50985;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f50986;

    public C15708(AbstractC0410 abstractC0410, EnumC16783 enumC16783) {
        this.f50985 = abstractC0410;
        this.f50983 = enumC16783;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37410(int i, int i2, DataInputStream dataInputStream) {
        AbstractC0410 abstractC0410 = this.f50985;
        this.f50984 = i;
        this.f50982 = i2;
        try {
            byte[] bArr = new byte[i2];
            this.f50986 = bArr;
            dataInputStream.readFully(bArr);
            abstractC0410.m2146("AttrData:#%d length=%d", Integer.valueOf(i), Integer.valueOf(i2));
        } catch (ArrayIndexOutOfBoundsException | NegativeArraySizeException unused) {
            throw new C16639(abstractC0410.m2163(), "{0}: Invalid attribute length #{1}", this.f50983.m39430(), Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m37408() {
        byte[] bArr = this.f50986;
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        String str = (String) C9653.range(0, Math.min(10, bArr.length)).mapToObj(new C20646(0)).collect(C1890.joining(", "));
        return this.f50986.length > 10 ? C15489.m37076(str, ", ...") : str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37413(int i) {
        this.f50984 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37409(int i) {
        this.f50982 = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m37407() {
        return this.f50984;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m37411() {
        return this.f50982;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC16783 m37412() {
        return this.f50983;
    }
}
