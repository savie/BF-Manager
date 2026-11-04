package l;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ܿ֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05HL */
/* JADX INFO: loaded from: classes5.dex */
public final class C17980 extends AbstractC24188 implements InterfaceC10015 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f58914 = new C20964();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public short f58915;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte f58916;

    public C17980(EnumC7779 enumC7779, short s, int i) {
        super(enumC7779);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        if (i >= 65536) {
            throw new RuntimeException("The register number must be less than v65536");
        }
        this.f58916 = (byte) s;
        this.f58915 = (short) i;
    }

    public C17980(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        this.f58916 = bArr[i + 1];
        this.f58915 = (short) C12556.m31238(i + 2, bArr);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138(this.f58916);
        c24166.m54139(this.f58915);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format22x;
    }

    @Override // l.InterfaceC10015
    /* JADX INFO: renamed from: ۙ */
    public final int mo9996() {
        return this.f58916 & 255;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m41956() {
        return this.f58915 & HPKE.aead_EXPORT_ONLY;
    }
}
