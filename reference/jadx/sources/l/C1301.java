package l;

/* JADX INFO: renamed from: l.֨ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: NA1Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C1301 extends AbstractC5535 {

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f5568;

    @Override // l.AbstractC5535
    /* JADX INFO: renamed from: ܰ */
    public final int mo2803(byte[] bArr) {
        return 0;
    }

    public C1301(InterfaceC10601 interfaceC10601, byte[] bArr) {
        super(interfaceC10601);
        this.f5568 = bArr;
    }

    @Override // l.AbstractC5535
    /* JADX INFO: renamed from: ܰ */
    public final int mo2802(int i, int i2, byte[] bArr) throws C2796 {
        byte[] bArr2 = this.f5568;
        if (i2 > bArr2.length) {
            throw new C2796("Payload exceeds buffer size");
        }
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return i2;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final int m4646() {
        return this.f18969;
    }

    @Override // l.AbstractC5535, l.AbstractC14792
    public final String toString() {
        return new String(C22697.m50267(new StringBuilder("TransCallNamedPipeResponse["), super.toString(), "]"));
    }
}
