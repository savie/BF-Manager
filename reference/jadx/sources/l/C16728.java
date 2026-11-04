package l;

/* JADX INFO: renamed from: l.ܺۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L69I */
/* JADX INFO: loaded from: classes5.dex */
public final class C16728 extends AbstractC24188 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f54020 = new C24934();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f54021;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public short f54022;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public short f54023;

    public C16728(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        this.f54021 = (byte) (bArr[i + 1] & 255);
        this.f54022 = (short) C12556.m31238(i + 2, bArr);
        this.f54023 = (short) C12556.m31238(i + 4, bArr);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138(this.f54021);
        c24166.m54139(this.f54022);
        c24166.m54139(this.f54023);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format3rms;
    }
}
