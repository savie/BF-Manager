package l;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.᩷ۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H580 */
/* JADX INFO: loaded from: classes.dex */
public final class C21950 extends AbstractC24188 implements InterfaceC10015 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f70855 = new C4796();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public short f70856;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public short f70857;

    public C21950(EnumC7779 enumC7779, int i, int i2) {
        super(enumC7779);
        if (i >= 65536 || i2 >= 65536) {
            throw new RuntimeException("The register number must be less than v65536");
        }
        this.f70857 = (short) i;
        this.f70856 = (short) i2;
    }

    public C21950(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        this.f70857 = (short) C12556.m31238(i + 2, bArr);
        this.f70856 = (short) C12556.m31238(i + 4, bArr);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138(0);
        c24166.m54139(this.f70857);
        c24166.m54139(this.f70856);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format32x;
    }

    @Override // l.InterfaceC10015
    /* JADX INFO: renamed from: ۙ */
    public final int mo9996() {
        return this.f70857 & HPKE.aead_EXPORT_ONLY;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m49674() {
        return this.f70856 & HPKE.aead_EXPORT_ONLY;
    }
}
