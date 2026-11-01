package l;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۚ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 05HL */
/* JADX INFO: loaded from: classes3.dex */
public final class C5586 extends AbstractC4300 implements InterfaceC3594 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f19176 = new C2763();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public short f19177;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte f19178;

    public C5586(EnumC0772 enumC0772, short s, int i) {
        super(enumC0772);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        if (i >= 65536) {
            throw new RuntimeException("The register number must be less than v65536");
        }
        this.f19178 = (byte) s;
        this.f19177 = (short) i;
    }

    public C5586(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        this.f19178 = bArr[i + 1];
        this.f19177 = (short) C14611.m35087(i + 2, bArr);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841(this.f19178);
        c4651.m12833(this.f19177);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format22x;
    }

    @Override // l.InterfaceC3594
    /* JADX INFO: renamed from: ۙ */
    public final int mo4757() {
        return this.f19178 & 255;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m15458() {
        return this.f19177 & HPKE.aead_EXPORT_ONLY;
    }
}
