package l;

import java.io.DataInputStream;

/* JADX INFO: renamed from: l.᩸ۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: O7F3 */
/* JADX INFO: loaded from: classes.dex */
public final class C22599 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC13127 f73051;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC12931 f73052;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f73053;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f73054;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f73055;

    public C22599(AbstractC12931 abstractC12931, EnumC13127 enumC13127) {
        this.f73052 = abstractC12931;
        this.f73051 = enumC13127;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50928(int i, int i2, DataInputStream dataInputStream) {
        AbstractC12931 abstractC12931 = this.f73052;
        this.f73053 = i;
        this.f73055 = i2;
        try {
            byte[] bArr = new byte[i2];
            this.f73054 = bArr;
            dataInputStream.readFully(bArr);
            abstractC12931.m32315("AttrData:#%d length=%d", Integer.valueOf(i), Integer.valueOf(i2));
        } catch (ArrayIndexOutOfBoundsException | NegativeArraySizeException unused) {
            throw new C5474(abstractC12931.m32312(), "{0}: Invalid attribute length #{1}", this.f73051.m32609(), Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m50926() {
        byte[] bArr = this.f73054;
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        String str = (String) C11719.range(0, Math.min(10, bArr.length)).mapToObj(new C10664(0)).collect(C2025.joining(", "));
        return this.f73054.length > 10 ? C14483.m34972(str, ", ...") : str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50931(int i) {
        this.f73053 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50927(int i) {
        this.f73055 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m50932() {
        return this.f73053;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m50929() {
        return this.f73055;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC13127 m50930() {
        return this.f73051;
    }
}
