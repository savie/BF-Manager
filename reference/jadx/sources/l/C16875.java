package l;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ܽ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5ZS */
/* JADX INFO: loaded from: classes5.dex */
public final class C16875 extends AbstractC11357 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f53971 = new C0646();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public short f53972;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f53973;

    public C16875(EnumC0772 enumC0772, short s, int i, AbstractC9011 abstractC9011) {
        super(enumC0772, abstractC9011);
        if (s >= 256) {
            throw new RuntimeException("regCount must be less than 256");
        }
        if (s < 0) {
            throw new RuntimeException("regCount cannot be negative");
        }
        if (i >= 65536) {
            throw new RuntimeException("The beginning register of the range must be less than 65536");
        }
        if (i < 0) {
            throw new RuntimeException("The beginning register of the range cannot be negative");
        }
        this.f53973 = (byte) s;
        this.f53972 = (short) i;
    }

    public C16875(C12063 c12063, EnumC0772 enumC0772, byte[] bArr, int i) {
        super(c12063, enumC0772, bArr, i);
        this.f53973 = (byte) (bArr[i + 1] & 255);
        this.f53972 = (short) C14611.m35087(i + 4, bArr);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841(this.f53973);
        c4651.m12833(m28439().m23325());
        c4651.m12833(this.f53972);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format3rc;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final short m39536() {
        return (short) (this.f53973 & 255);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m39537() {
        return this.f53972 & HPKE.aead_EXPORT_ONLY;
    }
}
