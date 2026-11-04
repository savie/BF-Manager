package l;

/* JADX INFO: renamed from: l.ۙۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4651 extends AbstractC1513 {

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f16451;

    @Override // l.AbstractC1513
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5379(byte[] bArr) {
        return 0;
    }

    public C4651(InterfaceC5878 interfaceC5878, byte[] bArr) {
        super(interfaceC5878);
        this.f16451 = bArr;
    }

    @Override // l.AbstractC1513
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5378(int i, int i2, byte[] bArr) throws C19061 {
        byte[] bArr2 = this.f16451;
        if (i2 > bArr2.length) {
            throw new C19061("Payload exceeds buffer size");
        }
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return i2;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final int m14506() {
        return this.f5272;
    }

    @Override // l.AbstractC1513, l.AbstractC3971
    public final String toString() {
        return new String(C8947.m23910(new StringBuilder("TransTransactNamedPipeResponse["), super.toString(), "]"));
    }
}
