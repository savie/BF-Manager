package l;

/* JADX INFO: renamed from: l.᩺ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9U8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23175 extends AbstractC5535 {

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f75212;

    @Override // l.AbstractC5535
    /* JADX INFO: renamed from: ܰ */
    public final int mo2803(byte[] bArr) {
        return 0;
    }

    public C23175(InterfaceC10601 interfaceC10601, byte[] bArr) {
        super(interfaceC10601);
        this.f75212 = bArr;
    }

    @Override // l.AbstractC5535
    /* JADX INFO: renamed from: ܰ */
    public final int mo2802(int i, int i2, byte[] bArr) throws C2796 {
        byte[] bArr2 = this.f75212;
        if (i2 > bArr2.length) {
            throw new C2796("Payload exceeds buffer size");
        }
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return i2;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final int m51168() {
        return this.f18969;
    }

    @Override // l.AbstractC5535, l.AbstractC14792
    public final String toString() {
        return new String(C22697.m50267(new StringBuilder("TransTransactNamedPipeResponse["), super.toString(), "]"));
    }
}
