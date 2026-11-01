package l;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.᩵᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H580 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19698 extends AbstractC4300 implements InterfaceC3594 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f63241 = new C8409();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public short f63242;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public short f63243;

    public C19698(EnumC0772 enumC0772, int i, int i2) {
        super(enumC0772);
        if (i >= 65536 || i2 >= 65536) {
            throw new RuntimeException("The register number must be less than v65536");
        }
        this.f63243 = (short) i;
        this.f63242 = (short) i2;
    }

    public C19698(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        this.f63243 = (short) C14611.m35087(i + 2, bArr);
        this.f63242 = (short) C14611.m35087(i + 4, bArr);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841(0);
        c4651.m12833(this.f63243);
        c4651.m12833(this.f63242);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format32x;
    }

    @Override // l.InterfaceC3594
    /* JADX INFO: renamed from: ۙ */
    public final int mo4757() {
        return this.f63243 & HPKE.aead_EXPORT_ONLY;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m44822() {
        return this.f63242 & HPKE.aead_EXPORT_ONLY;
    }
}
