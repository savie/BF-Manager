package l;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۧۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5ZS */
/* JADX INFO: loaded from: classes4.dex */
public final class C11507 extends AbstractC14490 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f36206 = new C1813();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f36207;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public short f36208;

    public C11507(EnumC7779 enumC7779, short s, int i, AbstractC10739 abstractC10739) {
        super(enumC7779, abstractC10739);
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
        this.f36207 = (byte) s;
        this.f36208 = (short) i;
    }

    public C11507(C24738 c24738, EnumC7779 enumC7779, byte[] bArr, int i) {
        super(c24738, enumC7779, bArr, i);
        this.f36207 = (byte) (bArr[i + 1] & 255);
        this.f36208 = (short) C12556.m31238(i + 4, bArr);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138(this.f36207);
        c24166.m54139(m35002().m27353());
        c24166.m54139(this.f36208);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format3rc;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final short m28965() {
        return (short) (this.f36207 & 255);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m28966() {
        return this.f36208 & HPKE.aead_EXPORT_ONLY;
    }
}
